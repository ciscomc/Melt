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
public class TestTest {
    private melt.Model.Test instance;
    private Section section;
    public TestTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    instance = new melt.Model.Test(1, "test1", "Fuhao");
    instance.setInstructions("easy");
    section = new Section(1, 1.0,"section1" , "easy");
    instance.addSection(section);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setName method, of class Test.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "test1";
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Test.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "test1";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Test.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        int expResult =1;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCreator method, of class Test.
     */
    @Test
    public void testGetCreator() {
        System.out.println("getCreator");
        String expResult = "Fuhao";
        String result = instance.getCreator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getInstructions method, of class Test.
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
     * Test of getSections method, of class Test.
     */
    @Test
    public void testGetSections() {
        System.out.println("getSections");
        instance.getSections();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getSectionById method, of class Test.
     */
    @Test
    public void testGetSectionById() {
        System.out.println("getSectionById");
        int id = 1;
        Section expResult = section;
        Section result = instance.getSectionById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Test.
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
     * Test of setCreator method, of class Test.
     */
    @Test
    public void testSetCreator() {
        System.out.println("setCreator");
        String creator = "Abdu";
        instance.setCreator(creator);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setInstructions method, of class Test.
     */
    @Test
    public void testSetInstructions() {
        System.out.println("setInstructions");
        String instructions = "hard";
        instance.setInstructions(instructions);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addSection method, of class Test.
     */
    @Test
    public void testAddSection() {
        System.out.println("addSection");
        boolean expResult = false;
        boolean result = instance.addSection(section);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of deleteSection method, of class Test.
     */
    @Test
    public void testDeleteSection() {
        System.out.println("deleteSection");
        int sectionId = 1;
        boolean expResult = false;
        boolean result = instance.deleteSection(sectionId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Test.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = instance.getName();
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}