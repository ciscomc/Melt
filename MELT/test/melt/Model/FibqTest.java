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
        //create a blank, add 2 correct answers, a student answer and a mark for each of them
        String answer1 = "correctAnswer1";
        String answer2 = "correctAnswer2";
        ArrayList<String> correctAnswersForBlank1 = new ArrayList();
        correctAnswersForBlank1.add(answer1);
        correctAnswersForBlank1.add(answer2);
        double markForBlank1 = 5;
        FibqSingleBlank singleBlank1 = new FibqSingleBlank(correctAnswersForBlank1, markForBlank1);
        singleBlank1.setStudentAnswer("correctAnswer1");
        correctAnswers.add(singleBlank1);
        fibqInstance = new Fibq(correctAnswers, 1, "Fill in the blanks question");
        
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
        
        boolean expResult = false;
        boolean result = fibqInstance.isAutoMarked();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setAutoMarked method, of class Fibq.
     */
    @Test
    public void testSetAutoMarked() {
        System.out.println("setAutoMarked");
        boolean autoMarked = true;
        
        fibqInstance.setAutoMarked(autoMarked);
        assertEquals(autoMarked, fibqInstance.isAutoMarked());
        
    }

    /**
     * Test of checkAnswer method, of class Fibq.
     */
    @Test
    public void testCheckAnswer() {
        System.out.println("checkAnswer");
        
        boolean expResult = true;
        boolean result = fibqInstance.checkAnswer();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCorrectAnswers method, of class Fibq.
     */
    @Test
    public void testSetCorrectAnswers() {
        System.out.println("setCorrectAnswers");
        ArrayList<FibqSingleBlank> correctAnswers = new ArrayList();
        //create a blank, add 2 correct answers, a student answer and a mark for each of them
        String answer1 = "correctAnswer1";
        String answer2 = "correctAnswer2";
        ArrayList<String> correctAnswersForBlank1 = new ArrayList();
        correctAnswersForBlank1.add(answer1);
        correctAnswersForBlank1.add(answer2);
        double markForBlank1 = 5;
        FibqSingleBlank singleBlank1 = new FibqSingleBlank(correctAnswersForBlank1, markForBlank1);
        correctAnswers.add(singleBlank1);
        fibqInstance.setCorrectAnswers(correctAnswers);
        
    }

    /**
     * Test of getCorrectAnswers method, of class Fibq.
     */
    @Test
    public void testGetCorrectAnswers() {
        System.out.println("getCorrectAnswers");
        ArrayList<FibqSingleBlank> answers = fibqInstance.getCorrectAnswers();
        ArrayList expResult = answers;
        ArrayList result = fibqInstance.getCorrectAnswers();
        assertEquals(expResult, result);
        
    }
}