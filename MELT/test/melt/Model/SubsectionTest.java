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
public class SubsectionTest {
    private Subsection instance;
    private Fibq fibq;
    private ArrayList<FibqBlankAnswers> answers;
    public SubsectionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    instance = new Subsection("fibq", "subsection1", 1);
    fibq = new Fibq(answers, 1, "who");
    instance.addQuestion(fibq);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getType method, of class Subsection.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        String expResult = "fibq";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Subsection.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "subsection1";
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class Subsection.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String type = "mcq";
        instance.setType(type);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Subsection.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "subsection1";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Subsection.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        int expResult = 1;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getQuestions method, of class Subsection.
     */
    @Test
    public void testGetQuestions() {
        System.out.println("getQuestions");
        instance.getQuestions();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getQuestionById method, of class Subsection.
     */
    @Test
    public void testGetQuestionById() {
        System.out.println("getQuestionById");
        int id = 1;
        Question expResult = fibq;
        Question result = instance.getQuestionById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Subsection.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addQuestion method, of class Subsection.
     */
    @Test
    public void testAddQuestion() {
        System.out.println("addQuestion");
        boolean expResult = false;
        boolean result = instance.addQuestion(fibq);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of editQuestion method, of class Subsection.
     */
    @Test
    public void testEditQuestion() {
        System.out.println("editQuestion");
        int id = 1;
        boolean expResult = true;;
        boolean result = instance.editQuestion(id, fibq);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteQuestion method, of class Subsection.
     */
    @Test
    public void testDeleteQuestion() {
        System.out.println("deleteQuestion");
        int id = 1;
        boolean expResult = true;
        boolean result = instance.deleteQuestion(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Subsection.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = instance.getName();
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
}