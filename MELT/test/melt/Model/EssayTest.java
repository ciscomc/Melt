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
 * @author panos
 */
public class EssayTest {
    
    private Essay essayObject;
    public EssayTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        essayObject = new Essay(1,"Write a short essay",5,10,100);
        essayObject.setStudentAnswer("this is an answer.");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getEssayQuestion method, of class Essay.
     */
    @Test
    public void testGetEssayQuestion() {
        System.out.println("getEssayQuestion");
        Essay instance = new Essay(1,"Write a short essay",5,10,100);
        
        
        assertEquals(instance.getEssayQuestion(), essayObject.getEssayQuestion());
        assertEquals(10,essayObject.getNumOfLines());
        assertEquals(1,essayObject.getId());
        assertEquals(100,essayObject.getWordLimit());
        assertEquals("this is an answer.",essayObject.getStudentAnswer());
        
    }

    /**
     * Test of setEssayQuestion method, of class Essay.
     */
    @Test
    public void testSetEssayQuestion() {
        System.out.println("setEssayQuestion");
        String essayQuestion = "an essay question";
        Essay instance = new Essay();
        instance.setEssayQuestion(essayQuestion);
        assertEquals("an essay question", instance.getEssayQuestion());
    }

    /**
     * Test of getStudentAnswer method, of class Essay.
     */
    @Test
    public void testGetStudentAnswer() {
        System.out.println("getStudentAnswer");
        Essay instance = new Essay();
        instance.setStudentAnswer("a student answer");
        String expResult = "a student answer";
        String result = instance.getStudentAnswer();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setStudentAnswer method, of class Essay.
     */
    @Test
    public void testSetStudentAnswer() {
        System.out.println("setStudentAnswer");
        String studentAnswer = "this is a student answer";
        Essay instance = new Essay();
        instance.setStudentAnswer(studentAnswer);
        assertEquals(studentAnswer,instance.getStudentAnswer());
    }

    /**
     * Test of checkAnswer method, of class Essay.
     */
    

    /**
     * Test of getWordLimit method, of class Essay.
     */
    @Test
    public void testGetWordLimit() {
        System.out.println("getWordLimit");
        Essay instance = new Essay(1, "An essayquestion", 5, 100, 100);
        int expResult = 100;
        int result = instance.getWordLimit();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getStudentEssay method, of class Essay.
     */
    @Test
    public void testGetStudentEssay() {
        System.out.println("getStudentEssay");
        Essay instance = new Essay();
        instance.setStudentAnswer(" ");
        String expResult = " ";
        String result = instance.getStudentEssay();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setWordLimit method, of class Essay.
     */
    @Test
    public void testSetWordLimit() {
        System.out.println("setWordLimit");
        int wordLimit = 0;
        Essay instance = new Essay();
        instance.setWordLimit(wordLimit);
        
    }

    /**
     * Test of getNumOfLines method, of class Essay.
     */
    @Test
    public void testGetNumOfLines() {
        System.out.println("getNumOfLines");
        Essay instance = new Essay();
        int expResult = 0;
        int result = instance.getNumOfLines();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNumOfLines method, of class Essay.
     */
    @Test
    public void testSetNumOfLines() {
        System.out.println("setNumOfLines");
        int numOfLines = 0;
        Essay instance = new Essay(1, "text", 100, 5);
        instance.setNumOfLines(numOfLines);
        
    }
}