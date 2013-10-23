/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mbaxkfx2
 */
public class QuestionTest {
    Question instance;
    
    public QuestionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    instance = new QuestionImpl();
    instance.setId(1);
    instance.setQuestionText("who");
    instance.setMark(2.0);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Question.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        int expResult = 1;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getQuestionText method, of class Question.
     */
    @Test
    public void testGetQuestionText() {
        System.out.println("getQuestionText");
        String expResult = "who";
        String result = instance.getQuestionText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getMark method, of class Question.
     */
    @Test
    public void testGetMark() {
        System.out.println("getMark");
        double expResult = 2.0;
        double result = instance.getMark();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Question.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 1;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setQuestionText method, of class Question.
     */
    @Test
    public void testSetQuestionText() {
        System.out.println("setQuestionText");
        String questionText = "who";
        instance.setQuestionText(questionText);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setMark method, of class Question.
     */
    @Test
    public void testSetMark() {
        System.out.println("setMark");
        double mark = 2.0;
        instance.setMark(mark);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of checkAnswer method, of class Question.
     */
    @Test
    public void testCheckAnswer() {
        System.out.println("checkAnswer");
        boolean expResult = false;
        boolean result = instance.checkAnswer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Question.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Q"+instance.getId();
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class QuestionImpl extends Question {

        public boolean checkAnswer() {
            return false;
        }
    }
}