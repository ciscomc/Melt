/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.View;

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
public class NumberDisplayTest {
    
    public NumberDisplayTest() {
    }
    NumberDisplay instance;
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new NumberDisplay(60);
        instance.setValue(40);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getValue method, of class NumberDisplay.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        //NumberDisplay instance = null;
        int expResult = 40;
        int result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDisplayValue method, of class NumberDisplay.
     */
    @Test
    public void testGetDisplayValue() {
        System.out.println("getDisplayValue");
        
        String expResult = "40";
        String result = instance.getDisplayValue();
        assertEquals(expResult, result);

    }

    /**
     * Test of setValue method, of class NumberDisplay.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        int replacementValue = 40;
        
        instance.setValue(replacementValue);
        
    }

    /**
     * Test of increment method, of class NumberDisplay.
     */
    @Test
    public void testIncrement() {
        System.out.println("increment");
        
        instance.increment();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of decrease method, of class NumberDisplay.
     */
    @Test
    public void testDecrease() {
        System.out.println("decrease");
       
        instance.decrease();
       
    }
}