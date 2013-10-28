/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.Model;

import java.util.ArrayList;
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
public class FibqTest {
    
    private Fibq fibqInstance;
    public FibqTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        ArrayList<FibqSingleBlank> correctAnswers = new ArrayList();
        //create 2 blanks, add 2 correct answers, a student answer and a mark for each of them
        String answer1 = "correctAnswer1";
        String answer2 = "correctAnswer2";
        ArrayList<String> correctAnswersForBlank1 = new ArrayList();
        correctAnswersForBlank1.add(answer1);
        correctAnswersForBlank1.add(answer2);
        String studentAnswerBlank1 = "correctAnswer1";
        double markForBlank1 = 5;
        FibqSingleBlank singleBlank1 = new FibqSingleBlank()
        fibqInstance = new Fibq(null, 1, "Fill in the blanks question");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isAutoMarked method, of class Fibq.
     */
    @Test
    public void testIsAutoMarked() {
        System.out.println("isAutoMarked");
        Fibq instance = new Fibq();
        boolean expResult = false;
        boolean result = instance.isAutoMarked();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAutoMarked method, of class Fibq.
     */
    @Test
    public void testSetAutoMarked() {
        System.out.println("setAutoMarked");
        boolean autoMarked = false;
        Fibq instance = new Fibq();
        instance.setAutoMarked(autoMarked);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkAnswer method, of class Fibq.
     */
    @Test
    public void testCheckAnswer() {
        System.out.println("checkAnswer");
        Fibq instance = new Fibq();
        boolean expResult = false;
        boolean result = instance.checkAnswer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCorrectAnswers method, of class Fibq.
     */
    @Test
    public void testSetCorrectAnswers() {
        System.out.println("setCorrectAnswers");
        ArrayList<FibqSingleBlank> correctAnswers = null;
        Fibq instance = new Fibq();
        instance.setCorrectAnswers(correctAnswers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCorrectAnswers method, of class Fibq.
     */
    @Test
    public void testGetCorrectAnswers() {
        System.out.println("getCorrectAnswers");
        Fibq instance = new Fibq();
        ArrayList expResult = null;
        ArrayList result = instance.getCorrectAnswers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}