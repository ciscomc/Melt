/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.View;

import melt.Model.TestBank;
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
public class TestDetailsTest {
    
    public TestDetailsTest() {
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
     * Test of setTestBankObject method, of class TestDetails.
     */
    @Test
    public void testSetTestBankObject() {
        System.out.println("setTestBankObject");
        TestBank testBankObject = null;
        TestDetails instance = new TestDetails();
        instance.setTestBankObject(testBankObject);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTestObject method, of class TestDetails.
     */
    @Test
    public void testSetTestObject() {
        System.out.println("setTestObject");
        melt.Model.Test testObject = null;
        TestDetails instance = new TestDetails();
        instance.setTestObject(testObject);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteTest method, of class TestDetails.
     */
    @Test
    public void testDeleteTest() {
        System.out.println("deleteTest");
        TestDetails instance = new TestDetails();
        instance.deleteTest();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}