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
public class SectionTest {
    private Section instance;
    private Subsection subsection1;
    public SectionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    instance = new Section(1, 3.0, "section1", "easy");
    subsection1 = new Subsection("fibq", "subsection1", 1);
    instance.getSubsections().add(subsection1);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getInstructions method, of class Section.
     */
    @Test
    public void testGetInstructions() {
        System.out.println("getInstructions");
        String expResult = "easy";
        String result = instance.getInstructions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setInstructions method, of class Section.
     */
    @Test
    public void testSetInstructions() {
        System.out.println("setInstructions");
        String instructions = "why";
        instance.setInstructions(instructions);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Section.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        int expResult = 1;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getSubsections method, of class Section.
     */
    @Test
    public void testGetSubsections() {
        System.out.println("getSubsections");
        instance.getSubsections();
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getSubsectionById method, of class Section.
     */
    @Test
    public void testGetSubsectionById() {
        System.out.println("getSubsectionById");
        int id = 1;
        Subsection expResult = subsection1;
        Subsection result = instance.getSubsectionById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Section.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 1;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Section.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "section2";
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Section.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "section1";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //ail("The test case is a prototype.");
    }

    /**
     * Test of addSubsection method, of class Section.
     */
    @Test
    public void testAddSubsection() {
        System.out.println("addSubsection");
        boolean expResult = false;
        boolean result = instance.addSubsection(subsection1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteSubsection method, of class Section.
     */
    @Test
    public void testDeleteSubsection() {
        System.out.println("deleteSubsection");
        int subsectionId = 1;
        boolean expResult = true;
        boolean result = instance.deleteSubsection(subsectionId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTime method, of class Section.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        double expResult = 3.0;
        double result = instance.getTime();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTime method, of class Section.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        double time = 3.0;
        instance.setTime(time);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Section.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = instance.getName();
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
}