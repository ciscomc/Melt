/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.View;

import melt.Controller;
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
public class ViewerTest {
    
    public ViewerTest() {
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
     * Test of setController method, of class Viewer.
     */
    @Test
    public void testSetController() {
        System.out.println("setController");
        Controller controller = null;
        Viewer instance = new Viewer();
        instance.setController(controller);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayGUI method, of class Viewer.
     */
    @Test
    public void testDisplayGUI() {
        System.out.println("displayGUI");
        Viewer instance = new Viewer();
        instance.displayGUI();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of open method, of class Viewer.
     */
    @Test
    public void testOpen() {
        System.out.println("open");
        Viewer instance = new Viewer();
        instance.open();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}