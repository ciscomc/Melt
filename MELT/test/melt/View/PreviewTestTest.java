/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.View;

import melt.Model.Fibq;
import melt.Model.Mcq;
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
public class PreviewTestTest {
    
    public PreviewTestTest() {
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
     * Test of previewTest method, of class PreviewTest.
     */
    @Test
    public void testPreviewTest() {
        System.out.println("previewTest");
        melt.Model.Test test = null;
        PreviewTest instance = null;
        instance.previewTest(test);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of previewSection method, of class PreviewTest.
     */
    @Test
    public void testPreviewSection() {
        System.out.println("previewSection");
        Section sec = null;
        PreviewTest instance = null;
        instance.previewSection(sec);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of previewSubsection method, of class PreviewTest.
     */
    @Test
    public void testPreviewSubsection() {
        System.out.println("previewSubsection");
        Subsection sub = null;
        PreviewTest instance = null;
        instance.previewSubsection(sub);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of previewQuestion method, of class PreviewTest.
     */
    @Test
    public void testPreviewQuestion_Mcq() {
        System.out.println("previewQuestion");
        Mcq mcq = null;
        PreviewTest instance = null;
        instance.previewQuestion(mcq);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of previewQuestion method, of class PreviewTest.
     */
    @Test
    public void testPreviewQuestion_Fibq() {
        System.out.println("previewQuestion");
        Fibq fibq = null;
        PreviewTest instance = null;
        instance.previewQuestion(fibq);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}