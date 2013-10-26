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
public class FibqBlankAnswersTest {
    FibqBlankAnswers instance;
    private ArrayList<String> answers;
    private ArrayList<String> newAnswers;
    public FibqBlankAnswersTest() {
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
        instance = new FibqBlankAnswers();
        answers.add("a");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPossibleAnswers method, of class FibqBlankAnswers.
     */
    @Test
    public void testGetPossibleAnswers() {
        System.out.println("getPossibleAnswers");
        ArrayList expResult = answers;
        ArrayList result = instance.getPossibleAnswers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPossibleAnswers method, of class FibqBlankAnswers.
     */
    @Test
    public void testSetPossibleAnswers() {
        System.out.println("setPossibleAnswers");
        instance.setPossibleAnswers(newAnswers);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of checkAnswer method, of class FibqBlankAnswers.
     */
    @Test
    public void testCheckAnswer() {
        System.out.println("checkAnswer");
        String Answer = "a";
        boolean expResult = true;
        boolean result = instance.checkAnswer(Answer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
}