/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.View;

import java.awt.Toolkit;
import javax.swing.JTree;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;
import melt.Controller;
import melt.Model.Fibq;
import melt.Model.Mcq;
import melt.Model.Question;
import melt.Model.Section;
import melt.Model.Subsection;
import melt.Model.Test;
import melt.Model.TestBank;

/**
 *
 * @author Abdu
 */
public class TreePanel extends JTree {

    private Controller controller;
    private StaffPanel staffPanel;
    private DefaultMutableTreeNode allTests;
    private DefaultTreeModel treeModel;
    private Toolkit toolkit = Toolkit.getDefaultToolkit();

    /**
     * Creates new form TreePanel
     */
    public TreePanel(Controller controller, StaffPanel staffPanel) {

        this.controller = controller;
        this.staffPanel = staffPanel;
        setOpaque(true);
        allTests = new DefaultMutableTreeNode(this.controller.getTestBank());
        treeModel = new DefaultTreeModel(allTests);
        treeModel.addTreeModelListener(new MyTreeModelListener());
        this.setModel(treeModel);
        this.setEditable(false);
        this.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        this.setShowsRootHandles(true);
        this.addTreeSelectionListener(new TreeNodesListener());
        createNodes();
    }

    private void createNodes() {
        for (Test test : this.controller.getTestBank().getTests()) {
            DefaultMutableTreeNode testList = new DefaultMutableTreeNode(test);
            allTests.add(testList);
            if (test.getSections() == null) {
                break;
            }
            for (Section sect : test.getSections()) {
                DefaultMutableTreeNode sectionList = new DefaultMutableTreeNode(sect);
                testList.add(sectionList);
                if (sect.getSubsections() == null) {
                    break;
                }
                for (Subsection subsect : sect.getSubsections()) {
                    if (subsect.getQuestions() == null) {
                        break;
                    }
                    DefaultMutableTreeNode subsectionList = new DefaultMutableTreeNode(subsect);
                    sectionList.add(subsectionList);
                    for (Question question : subsect.getQuestions()) {

                        DefaultMutableTreeNode questionList = new DefaultMutableTreeNode(question);
                        subsectionList.add(questionList);
                    }
                }
            }
        }
    }

    public Object getParentObject() {
        TreePath currentSelection = this.getSelectionPath();
        if (currentSelection != null) {
            DefaultMutableTreeNode currentNode = (DefaultMutableTreeNode) (currentSelection.getLastPathComponent());
            DefaultMutableTreeNode parent = (DefaultMutableTreeNode) (currentNode.getParent());
            if (parent != null) {
                return parent.getUserObject();
            }
        }

        return null;
    }

    public Object getSelectedObject() {
        TreePath currentSelection = this.getSelectionPath();
        if (currentSelection != null) {
            DefaultMutableTreeNode currentNode = (DefaultMutableTreeNode) (currentSelection.getLastPathComponent());

            if (currentNode != null) {
                return currentNode.getUserObject();
            }
        }
        return null;
    }

    public void addTestNode(Test test) {
        if (getSelectedObject() instanceof TestBank) {
            addObject(test);
        } else {
            toolkit.beep();
        }
    }

    public void addSectionNode(Section sec) {
        if (getSelectedObject() instanceof Test) {
            addObject(sec);
        } else {
            toolkit.beep();
        }
    }

    public void addSubSectionNode(Subsection subsec) {
        if (getSelectedObject() instanceof Section) {
            addObject(subsec);
        } else {
            toolkit.beep();
        }
    }

    public void addQuestionNode(Question question) {
        if (getSelectedObject() instanceof Subsection) {
            addObject(question);
        } else if (getSelectedObject() instanceof Question) {
            DefaultMutableTreeNode parentNode = null;
            TreePath parentPath = this.getSelectionPath().getParentPath();

            if (parentPath == null) {
                parentNode = allTests;
            } else {
                parentNode = (DefaultMutableTreeNode) (parentPath.getLastPathComponent());
            }

            addObject(parentNode, question, true);
        } else {
            toolkit.beep();
        }
    }

    /**
     * Add child to the currently selected node.
     */
    private void addObject(Object child) {
        DefaultMutableTreeNode parentNode = null;
        TreePath parentPath = this.getSelectionPath();

        if (parentPath == null) {
            parentNode = allTests;
        } else {
            parentNode = (DefaultMutableTreeNode) (parentPath.getLastPathComponent());
        }

        addObject(parentNode, child, true);
    }

    private void addObject(DefaultMutableTreeNode parent,Object child) {
        addObject(parent, child, false);
    }

    private void addObject(DefaultMutableTreeNode parent,Object child,boolean shouldBeVisible) {
        DefaultMutableTreeNode childNode = new DefaultMutableTreeNode(child);

        if (parent == null) {
            parent = allTests;
        }

        //It is key to invoke this on the TreeModel, and NOT DefaultMutableTreeNode
        treeModel.insertNodeInto(childNode, parent,parent.getChildCount());

        //see the  new node.
        if (shouldBeVisible) {
            TreePath childPath = new TreePath(childNode.getPath());
            this.scrollPathToVisible(childPath);
            this.setSelectionPath(childPath);
        }
    }

    /**
     * Remove all nodes except the root node.
     */
    public void clear() {
        allTests.removeAllChildren();
        treeModel.reload();
    }

    /**
     * Remove the currently selected node.
     */
    public void removeCurrentNode() {
        TreePath currentSelection = this.getSelectionPath();
        if (currentSelection != null) {
            DefaultMutableTreeNode currentNode = (DefaultMutableTreeNode) (currentSelection.getLastPathComponent());
            MutableTreeNode parent = (MutableTreeNode) (currentNode.getParent());
            if (parent != null) {
                treeModel.removeNodeFromParent(currentNode);
                return;
            }
        }

        // Either there was no selection, or the root was selected.
        toolkit.beep();
    }

    private class MyTreeModelListener implements TreeModelListener {

        @Override
        public void treeNodesChanged(TreeModelEvent e) {
        }

        @Override
        public void treeNodesInserted(TreeModelEvent e) {
        }

        @Override
        public void treeNodesRemoved(TreeModelEvent e) {
        }

        @Override
        public void treeStructureChanged(TreeModelEvent e) {
        }
    }

    private class TreeNodesListener implements TreeSelectionListener {

        /**
         * Required by TreeSelectionListener interface.
         */
        @Override
        public void valueChanged(TreeSelectionEvent e) {

            Object currentNode = getSelectedObject();
            Object parentNode = getParentObject();

            if (currentNode instanceof TestBank) {
                staffPanel.redrawTestBankPanel();
            } else if (currentNode instanceof Test) {
                TestBank testBank = (TestBank) parentNode;
                staffPanel.redrawTestPanel("Add Section", testBank, (Test) currentNode);
            } else if (currentNode instanceof Section) {
                Test test = (Test) parentNode;
                staffPanel.redrawSectionPanel("Add Subsection", test, (Section) currentNode );
            } else if (currentNode instanceof Subsection) {
                Section section = (Section) parentNode;
                staffPanel.redrawSubsectionPanel("Add Question", section, (Subsection) currentNode);
            } else if (currentNode instanceof Question) {
                Subsection subsection = (Subsection) parentNode;
                if (currentNode instanceof Mcq) {
                    staffPanel.redrawMCQPanel("Add Question", subsection, (Mcq) currentNode);
                }
                if (currentNode instanceof Fibq) {
                    staffPanel.redrawFIBQPanel("Add Question", subsection, (Fibq) currentNode);
                }
            } 
        }
    }
}
