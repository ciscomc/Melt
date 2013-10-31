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
    private melt.Model.Test test1;
    private melt.Model.Test test2;
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

        instance = new TestBank();

    }

    @After
    public void tearDown() {
    }

    
    /**
     * Test of addTest method, of class TestBank.
     */
    @Test
    public void testAddTest() {
        System.out.println("addTest");
        test1 = new melt.Model.Test(1, "test1", "Fuhao");
        instance.addTest(test1);
        tests = instance.getTests();
        assertEquals(1, tests.size());
    }

    /**
     * Test of getTests method, of class TestBank.
     */
    @Test
    public void testGetTests() {
        System.out.println("getTests");
        tests = instance.getTests();
        System.out.println("After Constructor:");
        tests = instance.getTests();
        assertNotNull("tests is not null after constructor", tests);
        assertTrue("tests list is empty after constructor", tests.isEmpty());
    }

    /**
     * Test of getTestById method, of class TestBank.
     */
    @Test
    public void testGetTestById() {
        System.out.println("getTestById");
        test1 = new melt.Model.Test(1, "test1", "Me");
        test2 = new melt.Model.Test(1, "test1", "Me");
        instance.addTest(test1);
        int id = 1;
        melt.Model.Test result = instance.getTestById(id);
        assertSame(test1, result);
        assertNotSame(test2, result);
    }

    /**
     * Test of setTests method, of class TestBank.
     */
    @Test
    public void testSetTests() {
        System.out.println("setTests");
        instance.setTests(tests);
        
    }

    /**
     * Test of deleteTest method, of class TestBank.
     */
    @Test
    public void testDeleteTest() {
        System.out.println("deleteTest");
        int id = 1;
        boolean result = instance.deleteTest(id);
        assertFalse(result);
        test1 = new melt.Model.Test(1, "test1", "Fuhao");
        instance.addTest(test1);
        result = instance.deleteTest(id);
        assertTrue(result);
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
    }
}