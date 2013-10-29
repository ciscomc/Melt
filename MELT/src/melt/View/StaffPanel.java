/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.View;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import melt.Controller;
import melt.Model.Essay;
import melt.Model.Fibq;
import melt.Model.Mcq;
import melt.Model.Section;
import melt.Model.Subsection;
import melt.Model.Test;
import melt.Model.TestBank;
import melt.Model.Question;

/**
 *
 * @author Maria
 */
public class StaffPanel extends javax.swing.JPanel {

    private JPanel contentPane;
    private Controller controller;
    private McqPane mcq;
    private FibqPane fibq;
    private EssayPane essay;
    private SectionDetails section;
    private SubsectionDetails subsection;
    private TestDetails testDetails;
    private TestBankPane testBank;
    private TreePanel treePane;
    private Question question;

    /**
     * Creates new form StaffPanel
     */
    public StaffPanel(JPanel panel, Controller controller) {
        contentPane = panel;
        initComponents();
        this.controller = controller;
        treePane = new TreePanel(controller, this);
        treeScrollPane.setViewportView(treePane);

        mcq = new McqPane(controller, treePane);
        fibq = new FibqPane(controller, treePane);
        essay = new EssayPane(controller, treePane);
        section = new SectionDetails(controller, treePane);
        subsection = new SubsectionDetails(controller, treePane);
        testDetails = new TestDetails(controller, treePane);
        testBank = new TestBankPane();

        btnAddSubsection.setVisible(false);

        this.redrawTestBankPanel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        treeScrollPane = new javax.swing.JScrollPane();
        lblTitle = new javax.swing.JLabel();
        actionsPanel = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnPreview = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnAddSubsection = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Snap ITC", 1, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("MELT Staff");
        lblTitle.setMaximumSize(new java.awt.Dimension(178, 40));
        lblTitle.setMinimumSize(new java.awt.Dimension(178, 40));

        actionsPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        actionsPanel.setMinimumSize(new java.awt.Dimension(620, 520));
        actionsPanel.setPreferredSize(new java.awt.Dimension(620, 520));

        javax.swing.GroupLayout actionsPanelLayout = new javax.swing.GroupLayout(actionsPanel);
        actionsPanel.setLayout(actionsPanelLayout);
        actionsPanelLayout.setHorizontalGroup(
            actionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        actionsPanelLayout.setVerticalGroup(
            actionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );

        btnAdd.setFont(new java.awt.Font("MV Boli", 0, 16)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/melt/View/Icons/plus.png"))); // NOI18N
        btnAdd.setText("Add Test");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnPreview.setFont(new java.awt.Font("MV Boli", 0, 16)); // NOI18N
        btnPreview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/melt/View/Icons/search-icon-512.png"))); // NOI18N
        btnPreview.setText("Preview");
        btnPreview.setEnabled(false);
        btnPreview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviewActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("MV Boli", 0, 16)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/melt/View/Icons/delete.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("MV Boli", 0, 16)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/melt/View/Icons/return.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAddSubsection.setFont(new java.awt.Font("MV Boli", 0, 16)); // NOI18N
        btnAddSubsection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/melt/View/Icons/plus.png"))); // NOI18N
        btnAddSubsection.setText("Add Subsection");
        btnAddSubsection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSubsectionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(treeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(actionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPreview)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(btnAddSubsection, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnPreview)
                    .addComponent(btnDelete)
                    .addComponent(btnBack)
                    .addComponent(btnAddSubsection))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(treeScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addComponent(actionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:


        switch (btnAdd.getText().toLowerCase()) {
            case "add test":
                if (treePane.getSelectedObject() == null || !(treePane.getSelectedObject() instanceof TestBank)) {
                    JOptionPane.showMessageDialog(this, "You need to select the root node to add a new test.");
                    break;
                }
                redrawTestPanel("Add Section", (TestBank) treePane.getSelectedObject(), null);
                break;
            case "add section":
                if (treePane.getSelectedObject() == null || !(treePane.getSelectedObject() instanceof Test)) {
                    JOptionPane.showMessageDialog(this, "You need to select a test to add a new section.");
                    break;
                }
                redrawSectionPanel("Add Subsection", (Test) treePane.getSelectedObject(), null);
                break;
            case "add subsection":
                if (treePane.getSelectedObject() == null || !((treePane.getSelectedObject() instanceof Section))) {
                    JOptionPane.showMessageDialog(this, "You need to select a section to add a new subsection.");
                    break;
                }
                redrawSubsectionPanel("Add Question", (Section) treePane.getSelectedObject(), null);
                break;
            case "add question":
                Object x = treePane.getSelectedObject();
                if (x == null || !(treePane.getSelectedObject() instanceof Subsection || treePane.getSelectedObject() instanceof Question)) {
                    JOptionPane.showMessageDialog(this, "You need to select a subsection to add a new question.");
                    break;
                }
                if (x instanceof Subsection) {
                    Subsection sub = (Subsection) x;
                    QuestionTypeDialog questType = new QuestionTypeDialog((JFrame) this.getParent().getParent().getParent().getParent(), true);
                    questType.setVisible(true);
                    String qType = questType.getQtype();
                    switch (qType) {
                        case "Mcq":
                            redrawMCQPanel("Add Question", (Subsection) treePane.getSelectedObject(), null);
                            break;
                        case "Fibq":
                            redrawFIBQPanel("Add Question", (Subsection) treePane.getSelectedObject(), null);
                            break;
                        case "Essay":
                            redrawEssayPanel("Add Question", (Subsection) treePane.getSelectedObject(), null);
                            break;
                    }

                } else {
                    QuestionTypeDialog questType = new QuestionTypeDialog((JFrame) this.getParent().getParent().getParent().getParent(), true);
                    questType.setVisible(true);
                    String qType = questType.getQtype();
                    switch (qType) {
                        case "Mcq":
                            redrawMCQPanel("Add Question", (Subsection) treePane.getParentObject(), null);
                            break;
                        case "Fibq":
                            redrawFIBQPanel("Add Question", (Subsection) treePane.getParentObject(), null);
                            break;
                        case "Essay":
                            redrawEssayPanel("Add Question", (Subsection) treePane.getParentObject(), null);
                            break;
                    }
                }
                break;

            default:
                break;
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnPreviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviewActionPerformed
        // TODO add your handling code here:

        DefaultMutableTreeNode node = (DefaultMutableTreeNode) treePane.getLastSelectedPathComponent();
        if (node == null) {
            return;
        }
        Object nodeInfo = node.getUserObject();

        //PreviewTest prev = new PreviewTest(controller);

        if (this.actionsPanel.getComponent(0) instanceof TestDetails) {
            // Preview the whole test - as a student
            PreviewAsStudent preview = new PreviewAsStudent((Test) nodeInfo);
            preview.showPreview();

        } else if (this.actionsPanel.getComponent(0) instanceof SectionDetails) {
            // Preview the current section
            PreviewTest prev = new PreviewTest(controller);
            prev.previewSection((Section) nodeInfo);
        } else if (this.actionsPanel.getComponent(0) instanceof SubsectionDetails) {
            // Preview the current subsection
            PreviewTest prev = new PreviewTest(controller);
            prev.previewSubsection((Subsection) nodeInfo);
        } else if (this.actionsPanel.getComponent(0) instanceof McqPane) {
            PreviewTest prev = new PreviewTest(controller);
            // Preview the current question
            prev.previewQuestion((Mcq) nodeInfo);
        } else if (this.actionsPanel.getComponent(0) instanceof FibqPane) {
            // Preview the current question
            PreviewTest prev = new PreviewTest(controller);
            prev.previewQuestion((Fibq) nodeInfo);
        } else if (this.actionsPanel.getComponent(0) instanceof EssayPane) {
            PreviewTest prev = new PreviewTest(controller);
            prev.previewQuestion((Essay) nodeInfo);
        }
    }//GEN-LAST:event_btnPreviewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Object currentNode = treePane.getSelectedObject();

        if (currentNode == null) {
            JOptionPane.showMessageDialog(this, "You need to select a node to delete it.");
        }

        if (currentNode instanceof Test) {
            testDetails.deleteTest();
        } else if (currentNode instanceof Section) {
            section.deleteSection();
        } else if (currentNode instanceof Subsection) {
            subsection.deleteSubsection();
        } else if (currentNode instanceof Question) {
            if (currentNode instanceof Mcq) {
                mcq.deleteQuestion();
            }
            if (currentNode instanceof Fibq) {
                fibq.deleteQuestion();
            }
            if (currentNode instanceof Essay) {
                essay.deleteQuestion();
            }
        }
        TestList testList = (TestList) this.contentPane.getComponent(4);
        testList.showAllTest();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) contentPane.getLayout();
        cardLayout.show(contentPane, "welcomePanel");
        TestList testList = (TestList) this.contentPane.getComponent(4);
        testList.showAllTest();
        controller.updateXmlFile();

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddSubsectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSubsectionActionPerformed
        // TODO add your handling code here:
        if (treePane.getSelectedObject() == null) {
            JOptionPane.showMessageDialog(this, "You need to select a section to add a new subsection.");
        }
        redrawSubsectionPanel("Add Question", (Subsection) treePane.getSelectedObject(), null);
    }//GEN-LAST:event_btnAddSubsectionActionPerformed

    public void redrawPanel(JPanel panel, String btnText) {
        this.actionsPanel.removeAll();
        this.actionsPanel.setLayout(new java.awt.BorderLayout());
        this.actionsPanel.add(panel);
        this.actionsPanel.validate();
        this.actionsPanel.repaint();
        btnAdd.setText(btnText);
        btnPreview.setEnabled(true);
        btnAddSubsection.setVisible(false);
    }

    public void redrawMCQPanel(String btnText, Subsection subsectionObject, Mcq mcqObject) {
        redrawPanel(mcq, btnText);
        mcq.setSubsectionObject(subsectionObject);
        mcq.setQuestion(mcqObject);
    }

    public void redrawFIBQPanel(String btnText, Subsection subsectionObject, Fibq fibqObject) {
        redrawPanel(fibq, btnText);
        fibq.setSubsectionObject(subsectionObject);
        fibq.setQuestion(fibqObject);
    }

    public void redrawEssayPanel(String btnText, Subsection subsectionObject, Essay essayObject) {
        redrawPanel(essay, btnText);
        essay.setSubsectionObject(subsectionObject);
        essay.setQuestion(essayObject);
    }

    public void redrawSubsectionPanel(String btnText, Section sectionObject, Subsection subsectionObject) {
        redrawPanel(subsection, btnText);
        subsection.setFatherObject(sectionObject);
        subsection.setSubsectionObject(subsectionObject);
        btnAddSubsection.setVisible(true);
    }

    public void redrawSubsectionPanel(String btnText, Subsection subObject, Subsection subsectionObject) {
        redrawPanel(subsection, btnText);
        subsection.setFatherObject(subObject);
        subsection.setSubsectionObject(subsectionObject);
        btnAddSubsection.setVisible(true);
    }

    public void redrawSectionPanel(String btnText, Test testObject, Section sectionObject) {
        redrawPanel(section, btnText);
        section.setTestObject(testObject);
        section.setSectionObject(sectionObject);
    }

    public void redrawTestPanel(String btnText, TestBank testBankObject, Test testObject) {
        redrawPanel(testDetails, btnText);
        testDetails.setTestBankObject(testBankObject);
        testDetails.setTestObject(testObject);
    }

    public final void redrawTestBankPanel() {
        redrawPanel(testBank, "Add Test");
        btnPreview.setEnabled(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionsPanel;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddSubsection;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPreview;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane treeScrollPane;
    // End of variables declaration//GEN-END:variables
}
