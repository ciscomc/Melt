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
public class ClockDisplayTest {
    
    private ClockDisplay instance;
    public ClockDisplayTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new ClockDisplay(1, 1, 1);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of timeTick method, of class ClockDisplay.
     */
    @Test
    public void testTimeTick() {
        System.out.println("timeTick");
        //ClockDisplay instance = new ClockDisplay();
        instance.timeTick();
       
    }

    /**
     * Test of setTime method, of class ClockDisplay.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        int hour = 0;
        int minute = 0;
        int second = 0;
        
        instance.setTime(hour, minute, second);
        
    }

    /**
     * Test of getTime method, of class ClockDisplay.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        
        String expResult = "01:01:01";
        String result = instance.getTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}