/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.TestController;

import java.util.ArrayList;
import melt.Controller;
import melt.Model.Fibq;
import melt.Model.FibqBlankAnswers;
import melt.Model.Mcq;
import melt.Model.Question;
import melt.Model.Section;
import melt.Model.Subsection;
import melt.Model.TestBank;
import melt.View.Viewer;
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
public class ControllerTest {
    private TestBank testBank;
    private Viewer viewerForTest;
    private String testFileForTest;
    private melt.Model.Test test1 ;
    private Controller instance;
    private Section section;
    private Subsection subsection;
    private ArrayList<FibqBlankAnswers> rightAnswersList;
    private ArrayList<FibqBlankAnswers> newRightAnswersList;
    private ArrayList<String> stAnswers;
    private ArrayList<String> newStAnswers;
    private ArrayList<Integer> correctAnswers;
    private ArrayList<Integer> newCorrectAnswers;
    private Fibq fibq;
    private Mcq mcq;
    public ControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        testBank = new TestBank();
        viewerForTest = new Viewer();
        testFileForTest = "melt.xml";
        instance = new Controller(testBank, viewerForTest, testFileForTest);
        test1 = new melt.Model.Test();
        testBank.addTest(test1);
        section = new Section();
        subsection = new Subsection();
        fibq= new Fibq();
        mcq = new Mcq();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of loadFromXmlFile method, of class Controller.
     */
    @Test
    public void testLoadFromXmlFile() {
        System.out.println("loadFromXmlFile");
        instance.loadFromXmlFile();
    }

    /**
     * Test of updateXmlFile method, of class Controller.
     */
    @Test
    public void testUpdateXmlFile() {
        System.out.println("updateXmlFile");
        instance.updateXmlFile();
    }

    /**
     * Test of getTest method, of class Controller.
     */
    @Test
    public void testGetTest() {
        System.out.println("getTest");
        int id = 1;
        melt.Model.Test expResult = testBank.getTestById(id);
        melt.Model.Test result = instance.getTest(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of addTest method, of class Controller.
     */
    @Test
    public void testAddTest() {
        System.out.println("addTest");
        String name = "test1";
        String creator = "Fuhao";
        String instructions = "very hard";
        melt.Model.Test result = instance.addTest(name, creator, instructions);
        melt.Model.Test expResult = instance.getTest(1);
        assertEquals(expResult, result);
    }

    /**
     * Test of updateTestDetails method, of class Controller.
     */
    @Test
    public void testUpdateTestDetails() {
        System.out.println("updateTestDetails");
        String newName = "test2";
        String newCreator = "Abdu";
        String newInstructions = "easy";
        melt.Model.Test result = instance.updateTestDetails(test1, newName, newCreator, newInstructions);
        assertEquals(newName, result.getName());
        assertEquals(newCreator,result.getCreator());
        assertEquals(newInstructions, result.getInstructions());
    }

    /**
     * Test of addSection method, of class Controller.
     */
    @Test
    public void testAddSection() {
        System.out.println("addSection");
        double Time = 0.0;
        String sectionName = "section1";
        String instructions = "not easy";
        melt.Model.Section result = instance.addSection(test1, Time, sectionName, instructions);
        melt.Model.Section expResult = test1.getSectionById(1);
        assertEquals(expResult, result);
    }

    /**
     * Test of updateSectionDetails method, of class Controller.
     */
    @Test
    public void testUpdateSectionDetails() {
        System.out.println("updateSectionDetails");     
        double newTime = 4.0;
        String newSectionName = "section2";
        String newInstructions = "easy";
        melt.Model.Section result = instance.updateSectionDetails(section, newTime, newSectionName, newInstructions);
        assertEquals(newTime,result.getTime(),0);
        assertEquals(newSectionName, result.getName());
        assertEquals(newInstructions, result.getInstructions());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addSubsection method, of class Controller.
     */
    @Test
    public void testAddSubsection() {
        System.out.println("addSubsection");
        String type = "fibq";
        String subsectionName = "fibq1";
        Subsection result = instance.addSubsection(section, type, subsectionName);
        Subsection expResult = section.getSubsectionById(1);
        assertEquals(expResult, result);
    }

    /**
     * Test of updateSubsectionDetails method, of class Controller.
     */
    @Test
    public void testUpdateSubsectionDetails() {
        System.out.println("updateSubsectionDetails");
       
        String newType = "fibq";
        String newSubsectionName = "fibq2";
        Subsection result = instance.updateSubsectionDetails(subsection, newType, newSubsectionName);
        assertEquals(newType, result.getType());
        assertEquals(newSubsectionName, result.getName());
        
    }

    /**
     * Test of addQuestion method, of class Controller.
     */
    @Test
    public void testAddQuestion_5args() {
        System.out.println("addQuestion");
        Question result = instance.addQuestion(subsection, stAnswers, correctAnswers, "What's your name?", 4.0);
        Question expResult = subsection.getQuestionById(1);
        assertEquals(expResult, result);
    }

    /**
     * Test of addQuestion method, of class Controller.
     */
    @Test
    public void testAddQuestion_4args() {
        System.out.println("addQuestion"); 
        Question result = instance.addQuestion(subsection, rightAnswersList, "What's your name?", 3.0);
        Question expResult = subsection.getQuestionById(1);
        assertEquals(expResult, result);
    }

    /**
     * Test of updateQuestionDetails method, of class Controller.
     */
    @Test
    public void testUpdateQuestionDetails_5args() {
        System.out.println("updateQuestionDetails");
        Mcq result = (Mcq) instance.updateQuestionDetails(mcq, newStAnswers, newCorrectAnswers, "Who", 3.0);
        assertEquals(newStAnswers, result.getAnswers());
        assertEquals(newCorrectAnswers, result.getCorrectAnswers());
        assertEquals("Who",result.getQuestionText());
        assertEquals(3.0,result.getMark(),0);
    }

    /**
     * Test of updateQuestionDetails method, of class Controller.
     */
    @Test
    public void testUpdateQuestionDetails_4args() {
        System.out.println("updateQuestionDetails");
        Fibq result = (Fibq) instance.updateQuestionDetails(fibq, newRightAnswersList, "why", 3.0);
        assertEquals(newRightAnswersList, result.getCorrectAnswers());
        assertEquals(3.0, result.getMark(),0);
        assertEquals("why",result.getQuestionText());
    }

    /**
     * Test of deleteTest method, of class Controller.
     */
    @Test
    public void testDeleteTest() {
        System.out.println("deleteTest");
        int testId = 0;
        boolean expResult = false;
        boolean result = instance.deleteTest(testId);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteSection method, of class Controller.
     */
    @Test
    public void testDeleteSection() {
        System.out.println("deleteSection");
        int sectionId = 0;
        boolean expResult = false;
        boolean result = instance.deleteSection(test1, sectionId);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteSubsection method, of class Controller.
     */
    @Test
    public void testDeleteSubsection() {
        System.out.println("deleteSubsection");
        int subsectionId = 0;
        boolean expResult = false;
        boolean result = instance.deleteSubsection(section, subsectionId);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteQuestion method, of class Controller.
     */
    @Test
    public void testDeleteQuestion() {
        System.out.println("deleteQuestion");
        int questionID = 0;
        boolean expResult = false;
        boolean result = instance.deleteQuestion(subsection, questionID);
        assertEquals(expResult, result);
    }

    /**
     * Test of getTestBank method, of class Controller.
     */
    @Test
    public void testGetTestBank() {
        System.out.println("getTestBank");
        TestBank result = instance.getTestBank();
        TestBank expResult = testBank;
        assertEquals(expResult, result);
        //Actually expResult and result is the same thing 
        //but with different pointers,so it's correct,just leave it like this
    }
}