/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.View;

import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import melt.Controller;
import melt.Model.Mcq;
import melt.Model.Question;
import melt.Model.Section;
import melt.Model.Subsection;
import melt.Model.TestBank;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author panos
 */
public class TreePanelTest {
    
    public TreePanelTest() {
    }
    TreePanel instance;
    StaffPanel staffPanelInstance;
    Controller controllerInstance;
    String meltFile;
    Viewer viewerInstance;
    TestBank model;
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        meltFile = "melt.xml";
        viewerInstance = new Viewer();
        controllerInstance = new Controller(model, viewerInstance, meltFile);
        controllerInstance.loadFromXmlFile();
        staffPanelInstance = new StaffPanel(new JPanel(), controllerInstance);
        instance = new TreePanel(controllerInstance, staffPanelInstance);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getParentObject method, of class TreePanel.
     */
    @Test
    public void testGetParentObject() {
        System.out.println("getParentObject");
        //TreePanel instance = null;
        instance.setSelectionRow(1);
        TreePath currentSelection = instance.getSelectionPath();
        DefaultMutableTreeNode currentNode = (DefaultMutableTreeNode) (currentSelection.getLastPathComponent());
        DefaultMutableTreeNode expResult = (DefaultMutableTreeNode) (currentNode.getParent());
        Object result = instance.getParentObject();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedObject method, of class TreePanel.
     */
    @Test
    public void testGetSelectedObject() {
        System.out.println("getSelectedObject");
        //TreePanel instance = null;
        Object expResult = null;
        Object result = instance.getSelectedObject();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of addTestNode method, of class TreePanel.
     */
    @Test
    public void testAddTestNode() {
        System.out.println("addTestNode");
        melt.Model.Test test = new melt.Model.Test(1,"newTest","creator");
        instance.addTestNode(test);
        
    }

    /**
     * Test of addSectionNode method, of class TreePanel.
     */
    @Test
    public void testAddSectionNode() {
        System.out.println("addSectionNode");
        Section sec = new Section(1, 2.0, "newSection", "instructions");
        instance.addSectionNode(sec);
        
    }

    /**
     * Test of addSubSectionNode method, of class TreePanel.
     */
    @Test
    public void testAddSubSectionNode() {
        System.out.println("addSubSectionNode");
        Subsection subsec = new Subsection("Mcq", "subsection1",1);
        
        instance.addSubSectionNode(subsec);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addQuestionNode method, of class TreePanel.
     */
    @Test
    public void testAddQuestionNode() {
        
        //create a question  object
        System.out.println("addQuestionNode");
        String questionText = "sample question";
        ArrayList<String> answers = new ArrayList();
        ArrayList<Integer> correctAnswers = new ArrayList();
        answers.add("answer1");
        answers.add("answer2");
        correctAnswers.add(1);
        Question question = new Mcq(answers, correctAnswers, 1, questionText, 1.0);
        //TreePanel instance = null;
        instance.addQuestionNode(question);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class TreePanel.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeCurrentNode method, of class TreePanel.
     */
    @Test
    public void testRemoveCurrentNode() {
        
        System.out.println("removeCurrentNode");
        instance.removeCurrentNode();
        
    }
}