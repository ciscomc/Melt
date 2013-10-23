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
public class FibqTest {
     private ArrayList<FibqBlankAnswers> rightAnswersList;
     private FibqBlankAnswers rtAnswer;
     private ArrayList<String> stAnswers;
     private ArrayList<String> correctAnswers ;
    
    
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
        stAnswers= new ArrayList<String>();
        correctAnswers = new ArrayList<String>();
        rightAnswersList = new ArrayList<FibqBlankAnswers>();
        rtAnswer = new FibqBlankAnswers();
        stAnswers.add("abc");
        correctAnswers.add("a");
        rightAnswersList.add(rtAnswer); 
        rtAnswer.setPossibleAnswers(correctAnswers);
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of checkAnswer method, of class Fibq.
     */
    @Test
    public void testCheckAnswer() {
        System.out.println("checkAnswer");
        Fibq instance = new Fibq();
        instance.setCorrectAnswers(rightAnswersList);
        instance.setStudentAnswer(stAnswers);
        boolean expResult = false;
        boolean result = instance.checkAnswer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCorrectAnswers method, of class Fibq.
     */
    @Test
    public void testSetCorrectAnswers() {
        System.out.println("setCorrectAnswers");
        Fibq instance = new Fibq();
         instance.setCorrectAnswers(rightAnswersList);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setStudentAnswer method, of class Fibq.
     */
    @Test
    public void testSetStudentAnswer() {
        System.out.println("setStudentAnswer");
        Fibq instance = new Fibq();
        instance.setStudentAnswer(stAnswers);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCorrectAnswers method, of class Fibq.
     */
    @Test
    public void testGetCorrectAnswers() {
        System.out.println("getCorrectAnswers");
        Fibq instance = new Fibq();
        ArrayList expResult = rightAnswersList;
        instance.setCorrectAnswers(rightAnswersList);
        ArrayList result = instance.getCorrectAnswers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getStudentAnswer method, of class Fibq.
     */
    @Test
    public void testGetStudentAnswer() {
        System.out.println("getStudentAnswer");
        Fibq instance = new Fibq();
        ArrayList expResult = stAnswers;
        instance.setStudentAnswer(stAnswers);
        ArrayList result = instance.getStudentAnswer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}