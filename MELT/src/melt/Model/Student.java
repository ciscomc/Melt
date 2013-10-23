/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.Model;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author panos
 */
public class Student {
    
    private String name;
    private int id;
    @XmlElement(name="SelectedTest")
    private Test selectedTest;
    private double studentMark;

    public double getStudentMark() {
        return studentMark;
    }

    @XmlElement
    public void setStudentMark(double studentMark) {
        this.studentMark = studentMark;
    }
    
    public Student(String name,int id,Test studentSelectionTest){
        this.name = name;
        this.id = id;
        studentMark = 0;
        this.createSelectedTest(studentSelectionTest);
    }
    
    
    public Student(){
        
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @XmlElement
    public void setId(int id) {
        this.id = id;
    }

    public Test getSelectedTest() {
        return selectedTest;
    }

    private void createSelectedTest(Test test) {
        
        this.selectedTest = new Test();
        this.selectedTest.setCreator(test.getCreator());
        this.selectedTest.setId(test.getId());
        this.selectedTest.setInstructions(test.getInstructions());
        //copy sections of the test to the student test along with their details
        for(Section currentSection : test.getSections()){
            Section newSection = new Section();
            newSection.setId(currentSection.getId());
            newSection.setName(currentSection.getName());
            newSection.setTime(currentSection.getTime());
            newSection.setInstructions(currentSection.getInstructions());
            this.selectedTest.addSection(newSection);
            for(Subsection currentSubsection : currentSection.getSubsections()){
                Subsection newSubsection = new Subsection();
                newSubsection.setId(currentSubsection.getId());
                newSubsection.setName(currentSubsection.getName());
                newSubsection.setType(currentSubsection.getType());
                for(Question currentQuestion : currentSubsection.getQuestions()){
                  switch(newSubsection.getType()){
                    
                    case "Mcq":
                        Mcq currentMcq = (Mcq) currentQuestion;
                        ArrayList<String> mcqanswers = currentMcq.getAnswers();
                        ArrayList<Integer> correctAnswers = currentMcq.getCorrectAnswers();
                        String mcqQuestionText = currentMcq.getQuestionText();
                        Mcq newMcqQuestion = new Mcq();
                        newMcqQuestion.setQuestionText(mcqQuestionText);
                        newMcqQuestion.setAnswers(mcqanswers);
                        newMcqQuestion.setCorrectAnswers(correctAnswers);
                        newMcqQuestion.setId(currentMcq.getId());
                        newMcqQuestion.setMark(currentMcq.getMark());
                        newSubsection.addQuestion(currentQuestion);
                        newSection.addSubsection(newSubsection);
                        break;
                    case "Fibq":
                        Fibq currentFibq = (Fibq) currentQuestion;
                        ArrayList<FibqBlankAnswers> fibqanswers = currentFibq.getCorrectAnswers();
                        String fibqQuestionText = currentFibq.getQuestionText();
                        Fibq newFibqQuestion = new Fibq();
                        newFibqQuestion.setQuestionText(fibqQuestionText);
                        newFibqQuestion.setCorrectAnswers(fibqanswers);
                        newFibqQuestion.setId(currentFibq.getId());
                        newFibqQuestion.setMark(currentFibq.getMark());
                        newSubsection.addQuestion(newFibqQuestion);
                        newSection.addSubsection(newSubsection);
                        break;
                    case "Essay":
                        //code to add essay questions to the students selection here
                        break;
                }  
                }
                
                   
            }
               
        }        
    }

    public void markMcqQuestions(){
        
    }
    public void setAnswersForQuestion(String answer,Section section,Subsection subsection,Question question){
        
    }
    
    public void setAnswersForQuestion(ArrayList<Integer> answers,Section section,Subsection subsection,Question question){
        
    }
    
    public void setAnswerForQuestion(ArrayList<String> answers,Section section,Subsection subsection,Question question){
        
        
    }
}

