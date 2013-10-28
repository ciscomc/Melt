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
 * @author mbaxkfx2
 */
public class FibqSingleBlankTest {
    FibqSingleBlank fibqSingleBlankInstance;
    private ArrayList<String> answers;
    private ArrayList<String> newAnswers;
    private double mark;
    private String studentAnswer;
    public FibqSingleBlankTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        mark = 5;
        answers = new ArrayList();
        fibqSingleBlankInstance = new FibqSingleBlank(answers,mark);
        answers.add("correctAnswer1");
        answers.add("correctAnswer2");
        answers.add("correctAnswer3");
        
    }
    
    @After
    public void tearDown() {
        
    }

    /**
     * Test of getPossibleAnswers method, of class FibqSingleBlank.
     */
    @Test
    public void testGetPossibleAnswers() {
        System.out.println("getPossibleAnswers");
        ArrayList expResult = answers;
        ArrayList result = fibqSingleBlankInstance.getPossibleAnswers();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPossibleAnswers method, of class FibqSingleBlank.
     */
    @Test
    public void testSetPossibleAnswers() {
        System.out.println("setPossibleAnswers");
        fibqSingleBlankInstance.setPossibleAnswers(newAnswers);
        
    }

    /**
     * Test of checkAnswer method, of class FibqSingleBlank.
     */
    @Test
    public void testCheckAnswerCorrect() {//checkAnswer for a correct answer for the blank
        System.out.println("checkAnswer");
        String answer = "correctAnswer1";
        fibqSingleBlankInstance.setStudentAnswer(answer);
        boolean expResult = true;
        boolean result = fibqSingleBlankInstance.checkAnswer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetStudentAnswer(){
        System.out.println("getStudentAnswer");
        String expResult = this.studentAnswer;
        String result = fibqSingleBlankInstance.getStudentAnswer();
        assertEquals(expResult,result);
    }
    
    @Test
    public void testCheckAnswerWrong(){//checkAnswer for a wrong answer for the blank
        System.out.println("checkAnswer");
        String answer = "wrongAnswer1";
        fibqSingleBlankInstance.setStudentAnswer(answer);
        boolean expResult = false;
        boolean result = fibqSingleBlankInstance.checkAnswer();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetStudentMark(){//full marks
       System.out.println("getStudentMark"); 
       fibqSingleBlankInstance.setStudentMarkForBlank(5);
       double expResult = 5;
       double result = fibqSingleBlankInstance.getStudentMarkForBlank();
       assertEquals(expResult,result,0.1);
    }
    
    @Test
    public void testSetStudentMark(){
       System.out.println("setStudentMark");
       fibqSingleBlankInstance.setStudentMarkForBlank(5);
    }
}