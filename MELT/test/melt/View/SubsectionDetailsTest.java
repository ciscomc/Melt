/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.View;

import melt.Model.Section;
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
public class SubsectionDetailsTest {
    
    public SubsectionDetailsTest() {
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
     * Test of deleteSubsection method, of class SubsectionDetails.
     */
    @Test
    public void testDeleteSubsection() {
        System.out.println("deleteSubsection");
        SubsectionDetails instance = new SubsectionDetails();
        instance.deleteSubsection();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSectionObject method, of class SubsectionDetails.
     */
    @Test
    public void testSetSectionObject() {
        System.out.println("setSectionObject");
        Section section = null;
        SubsectionDetails instance = new SubsectionDetails();
        instance.setSectionObject(section);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSubsectionObject method, of class SubsectionDetails.
     */
    @Test
    public void testSetSubsectionObject() {
        System.out.println("setSubsectionObject");
        Subsection subsection = null;
        SubsectionDetails instance = new SubsectionDetails();
        instance.setSubsectionObject(subsection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}