/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.View;

import melt.Model.Fibq;
import melt.Model.Subsection;
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
public class FibqPaneTest {
    
    public FibqPaneTest() {
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
     * Test of deleteQuestion method, of class FibqPane.
     */
    @Test
    public void testDeleteQuestion() {
        System.out.println("deleteQuestion");
        FibqPane instance = null;
        instance.deleteQuestion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSubsectionObject method, of class FibqPane.
     */
    @Test
    public void testSetSubsectionObject() {
        System.out.println("setSubsectionObject");
        Subsection subsection = null;
        FibqPane instance = null;
        instance.setSubsectionObject(subsection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuestion method, of class FibqPane.
     */
    @Test
    public void testSetQuestion() {
        System.out.println("setQuestion");
        Fibq fibq = null;
        FibqPane instance = null;
        instance.setQuestion(fibq);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}