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
public class McqTest {
    private ArrayList<String> answers; 
    private ArrayList<Integer> correctAnswers;
    private ArrayList<Integer> studentAnswers;
    private Mcq instance;
    public McqTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    answers = new ArrayList<>();
    correctAnswers = new ArrayList<>();
    studentAnswers = new ArrayList<>();
    instance = new Mcq(answers, correctAnswers, 1, "why", 3.0);
    instance.setStudentAnswers(studentAnswers);
    studentAnswers.add(1);
    correctAnswers.add(1);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAnswers method, of class Mcq.
     */
    @Test
    public void testGetAnswers() {
        System.out.println("getAnswers"); 
        ArrayList expResult = answers;
        ArrayList result = instance.getAnswers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCorrectAnswers method, of class Mcq.
     */
    @Test
    public void testGetCorrectAnswers() {
        System.out.println("getCorrectAnswers");
        ArrayList expResult =correctAnswers;
        ArrayList result = instance.getCorrectAnswers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setAnswers method, of class Mcq.
     */
    @Test
    public void testSetAnswers() {
        System.out.println("setAnswers");
        instance.setAnswers(answers);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setCorrectAnswers method, of class Mcq.
     */
    @Test
    public void testSetCorrectAnswers() {
        System.out.println("setCorrectAnswers");
        instance.setCorrectAnswers(correctAnswers);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getStudentAnswers method, of class Mcq.
     */
    @Test
    public void testGetStudentAnswers() {
        System.out.println("getStudentAnswers");

        ArrayList expResult = studentAnswers;
        ArrayList result = instance.getStudentAnswers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setStudentAnswers method, of class Mcq.
     */
    @Test
    public void testSetStudentAnswers() {
        System.out.println("setStudentAnswers");
        instance.setStudentAnswers(studentAnswers);
       // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of checkAnswer method, of class Mcq.
     */
    @Test
    public void testCheckAnswer() {
        System.out.println("checkAnswer");
        boolean expResult = true;
        boolean result = instance.checkAnswer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
}