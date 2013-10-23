/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.View;

import javax.swing.JPanel;
import melt.Model.Fibq;
import melt.Model.Mcq;
import melt.Model.Section;
import melt.Model.Subsection;
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
public class StaffPanelTest {
    
    public StaffPanelTest() {
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
     * Test of redrawPanel method, of class StaffPanel.
     */
    @Test
    public void testRedrawPanel() {
        System.out.println("redrawPanel");
        JPanel panel = null;
        String btnText = "";
        StaffPanel instance = null;
        instance.redrawPanel(panel, btnText);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of redrawMCQPanel method, of class StaffPanel.
     */
    @Test
    public void testRedrawMCQPanel() {
        System.out.println("redrawMCQPanel");
        String btnText = "";
        Subsection subsectionObject = null;
        Mcq mcqObject = null;
        StaffPanel instance = null;
        instance.redrawMCQPanel(btnText, subsectionObject, mcqObject);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of redrawFIBQPanel method, of class StaffPanel.
     */
    @Test
    public void testRedrawFIBQPanel() {
        System.out.println("redrawFIBQPanel");
        String btnText = "";
        Subsection subsectionObject = null;
        Fibq fibqObject = null;
        StaffPanel instance = null;
        instance.redrawFIBQPanel(btnText, subsectionObject, fibqObject);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of redrawSubsectionPanel method, of class StaffPanel.
     */
    @Test
    public void testRedrawSubsectionPanel() {
        System.out.println("redrawSubsectionPanel");
        String btnText = "";
        Section sectionObject = null;
        Subsection subsectionObject = null;
        StaffPanel instance = null;
        instance.redrawSubsectionPanel(btnText, sectionObject, subsectionObject);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of redrawSectionPanel method, of class StaffPanel.
     */
    @Test
    public void testRedrawSectionPanel() {
        System.out.println("redrawSectionPanel");
        String btnText = "";
        melt.Model.Test testObject = null;
        Section sectionObject = null;
        StaffPanel instance = null;
        instance.redrawSectionPanel(btnText, testObject, sectionObject);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of redrawTestPanel method, of class StaffPanel.
     */
    @Test
    public void testRedrawTestPanel() {
        System.out.println("redrawTestPanel");
        String btnText = "";
        TestBank testBankObject = null;
        melt.Model.Test testObject = null;
        StaffPanel instance = null;
        instance.redrawTestPanel(btnText, testBankObject, testObject);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of redrawTestBankPanel method, of class StaffPanel.
     */
    @Test
    public void testRedrawTestBankPanel() {
        System.out.println("redrawTestBankPanel");
        StaffPanel instance = null;
        instance.redrawTestBankPanel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}