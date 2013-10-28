/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.Model;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
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
public class StudentTest {
    private Student studentInstance;
    private melt.Model.Test studentTest;
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        //create a test object and populate it with a section, a subsection and a question.
        studentTest = new melt.Model.Test(1, "Sample test", "Test creator");
        Section section = new Section(1, 5, "Section1", "Section Instructions");
        Subsection subsection = new Subsection("Essay", "Subsection 1", 1);
        Essay essayQuestion = new Essay(1, "Write a short essay.", 5, 20,100);
        subsection.addQuestion(essayQuestion);
        section.addSubsection(subsection);
        studentTest.addSection(section);
        
        //create the student instance
        studentInstance = new Student("Sample student", 1, studentTest);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMcqMark method, of class Student.
     */
    @Test
    public void testGetMcqMark() {
        System.out.println("getMcqMark");
        
        double expResult = 0.0;
        double result = studentInstance.getMcqMark();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of getFibqMark method, of class Student.
     */
    @Test
    public void testGetFibqMark() {
        
        double expResult = 0.0;
        double result = studentInstance.getFibqMark();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of setFibqMark method, of class Student.
     */
    @Test
    public void testSetFibqMark() {
        System.out.println("setFibqMark");
        double fibqMark = 0.0;
        
        studentInstance.setFibqMark(fibqMark);
        
    }

    /**
     * Test of getEssayMark method, of class Student.
     */
    @Test
    public void testGetEssayMark() {
        System.out.println("getEssayMark");
        
        double expResult = 0.0;
        double result = studentInstance.getEssayMark();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of setEssayMark method, of class Student.
     */
    @Test
    public void testSetEssayMark() {
        System.out.println("setEssayMark");
        double essayMark = 0.0;
        
        studentInstance.setEssayMark(essayMark);
        
    }

    /**
     * Test of setMcqMark method, of class Student.
     */
    @Test
    public void testSetMcqMark() {
        System.out.println("setMcqMark");
        double studentMark = 0.0;
        
        studentInstance.setMcqMark(studentMark);
        
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Sample student";
        String result = studentInstance.getName();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Sample Student";
        
        studentInstance.setName(name);
        assertEquals(name,studentInstance.getName());
    }

    /**
     * Test of getId method, of class Student.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        
        int expResult = 1;
        int result = studentInstance.getId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId method, of class Student.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        
        studentInstance.setId(5);
        assertEquals(5,studentInstance.getId());
    }

    /**
     * Test of getSelectedTest method, of class Student.
     */
    @Test
    public void testGetSelectedTest() {
        System.out.println("getSelectedTest");
        
        
        melt.Model.Test result = studentInstance.getSelectedTest();
        //check that the student test is the same with the selected test 
        assertEquals(result.getName(),"Sample test");
        assertEquals(result.getId(),1);
        ArrayList<Section> sectionList = result.getSections();
        for(Section section : sectionList){
            assertEquals(section.getId(),1);
            ArrayList<Subsection> subsections = section.getSubsections();
            for(Subsection subsection : subsections){
                assertEquals(subsection.getId(),1);
                for(Question question : subsection.getQuestions()){
                    Essay essayObject = (Essay) question;
                    String exp = "Write a short essay.";
                    assertEquals(exp,essayObject.getEssayQuestion());
                    assertEquals(essayObject.getNumOfLines(),20);
                    assertEquals(essayObject.getWordLimit(),100);
                    assertEquals(essayObject.getId(),1);
                    
                }
            }
        }
               
        }

    /**
     * Test of markMcqQuestions method, of class Student.
     */
    @Test
    public void testMarkMcqQuestions() {
        
        System.out.println("markMcqQuestions");
        
        studentInstance.markMcqQuestions();
        
    }

    /**
     * Test of markFibqQuestions method, of class Student.
     */
    @Test
    public void testMarkFibqQuestions() {
        System.out.println("markFibqQuestions");
        
        studentInstance.markFibqQuestions();
        
    }

    /**
     * Test of setAnswersForQuestion method, of class Student.
     */
    @Test
    public void testSetAnswersForQuestion_4args_1() {
        System.out.println("setAnswersForQuestion");
        String answer = "";
        Section section = null;
        Subsection subsection = null;
        Question question = null;
        studentInstance.setAnswersForQuestion(answer, section, subsection, question);
        
    }

    /**
     * Test of setAnswersForQuestion method, of class Student.
     */
    @Test
    public void testSetAnswersForQuestion_4args_2() {
        System.out.println("setAnswersForQuestion");
        ArrayList<Integer> answers = null;
        Section section = null;
        Subsection subsection = null;
        Question question = null;
        studentInstance.setAnswersForQuestion(answers, section, subsection, question);
        
    }

    /**
     * Test of setAnswerForQuestion method, of class Student.
     */
    @Test
    public void testSetAnswerForQuestion() {
        System.out.println("setAnswerForQuestion");
        ArrayList<String> answers = null;
        Section section = null;
        Subsection subsection = null;
        Question question = null;
        studentInstance.setAnswerForQuestion(answers, section, subsection, question);
        
    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        
        String expResult = "Sample student";
        String result = studentInstance.toString();
        assertEquals(expResult, result);
        
    }
}