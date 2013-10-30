/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.View;

import javax.swing.JPanel;
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
public class SingleQuestionPanelTest {
    
    public SingleQuestionPanelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of showQuestion method, of class SingleQuestionPanel.
     */
    @Test
    public void testShowQuestion() {
        System.out.println("showQuestion");
        SingleQuestionPanel instance = null;
        JPanel expResult = null;
        JPanel result = instance.showQuestion(1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStudentAnswer method, of class SingleQuestionPanel.
     */
    @Test
    public void testSetStudentAnswer() {
        System.out.println("setStudentAnswer");
        SingleQuestionPanel instance = null;
        instance.setStudentAnswer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class SingleQuestionPanel.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SingleQuestionPanel.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}