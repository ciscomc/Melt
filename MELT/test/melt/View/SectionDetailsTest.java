/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.View;

import melt.Model.Section;
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
public class SectionDetailsTest {
    
    public SectionDetailsTest() {
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
     * Test of deleteSection method, of class SectionDetails.
     */
    @Test
    public void testDeleteSection() {
        System.out.println("deleteSection");
        SectionDetails instance = new SectionDetails();
        instance.deleteSection();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTestObject method, of class SectionDetails.
     */
    @Test
    public void testSetTestObject() {
        System.out.println("setTestObject");
        melt.Model.Test test = null;
        SectionDetails instance = new SectionDetails();
        instance.setTestObject(test);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSectionObject method, of class SectionDetails.
     */
    @Test
    public void testSetSectionObject() {
        System.out.println("setSectionObject");
        Section section = null;
        SectionDetails instance = new SectionDetails();
        instance.setSectionObject(section);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}