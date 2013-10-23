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
public class TestBankTest {
    private TestBank instance;
    private melt.Model.Test  test1;
    private ArrayList<melt.Model.Test> tests;
    public TestBankTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        test1 = new melt.Model.Test(1, "test1", "Fuhao");
    instance = new TestBank();
    instance.addTest(test1);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTests method, of class TestBank.
     */
    @Test
    public void testGetTests() {
        System.out.println("getTests");
        instance.getTests();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTestById method, of class TestBank.
     */
    @Test
    public void testGetTestById() {
        System.out.println("getTestById");
        int id = 1;
        melt.Model.Test expResult = test1;
        melt.Model.Test result = instance.getTestById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addTest method, of class TestBank.
     */
    @Test
    public void testAddTest() {
        System.out.println("addTest");
        instance.addTest(test1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTests method, of class TestBank.
     */
    @Test
    public void testSetTests() {
        System.out.println("setTests");
        instance.setTests(tests);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteTest method, of class TestBank.
     */
    @Test
    public void testDeleteTest() {
        System.out.println("deleteTest");
        int id = 1;
        boolean expResult = true;
        boolean result = instance.deleteTest(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class TestBank.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "All Tests";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}