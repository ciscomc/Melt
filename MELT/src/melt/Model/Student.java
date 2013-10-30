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
    @XmlElement(name = "SelectedTest")
    private Test selectedTest;
    private String testName;
    private double mcqMark;
    private double fibqMark;
    private double essayMark;

    public double getMcqMark() {
        return mcqMark;
    }

    public double getFibqMark() {
        return fibqMark;
    }

    @XmlElement(name = "FibqMarks")
    public void setFibqMark(double fibqMark) {
        this.fibqMark = fibqMark;
    }

    public double getEssayMark() {
        return essayMark;
    }

    @XmlElement(name = "EssayMarks")
    public void setEssayMark(double essayMark) {
        this.essayMark = essayMark;
    }

    @XmlElement(name = "McqMarks")
    public void setMcqMark(double studentMark) {
        this.mcqMark = studentMark;

    }

    public Student(String name, int id, Test studentSelectionTest) {
        this.name = name;
        this.id = id;
        mcqMark = 0;
        fibqMark = 0;
        essayMark = 0;
        this.createSelectedTest(studentSelectionTest);
    }

    public Student() {
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
        this.selectedTest.setName(test.getName());
        this.selectedTest.setInstructions(test.getInstructions());
        //copy sections of the test to the student test along with their details
        for (Section currentSection : test.getSections()) {
            Section newSection = new Section();
            newSection.setId(currentSection.getId());
            newSection.setName(currentSection.getName());
            newSection.setTime(currentSection.getTime());
            newSection.setInstructions(currentSection.getInstructions());
            this.selectedTest.addSection(newSection);
            for (Subsection currentSubsection : currentSection.getSubsections()) {
                Subsection newSubsection = new Subsection();
                newSubsection.setId(currentSubsection.getId());
                newSubsection.setName(currentSubsection.getName());
                for (Question currentQuestion : currentSubsection.getQuestions()) {
                    if (currentQuestion instanceof Mcq) {
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
                        //newSection.addSubsection(newSubsection);
                    } else if (currentQuestion instanceof Fibq) {
                        Fibq currentFibq = (Fibq) currentQuestion;
                        ArrayList<FibqSingleBlank> fibqanswers = currentFibq.getCorrectAnswers();
                        String fibqQuestionText = currentFibq.getQuestionText();
                        Fibq newFibqQuestion = new Fibq();
                        newFibqQuestion.setQuestionText(fibqQuestionText);
                        newFibqQuestion.setCorrectAnswers(fibqanswers);
                        newFibqQuestion.setId(currentFibq.getId());
                        newFibqQuestion.setMark(currentFibq.getMark());
                        newFibqQuestion.setAutoMarked(currentFibq.isAutoMarked());
                        newSubsection.addQuestion(newFibqQuestion);
                    } else if (currentQuestion instanceof Essay) {
                        Essay currentEssay = (Essay) currentQuestion;
                        String essayText = currentEssay.getQuestionText();
                        int wordLimit = currentEssay.getWordLimit();
                        double mark = currentEssay.getMark();
                        int numOfLines = currentEssay.getNumOfLines();
                        Essay newEssay = new Essay(currentEssay.getId(), essayText, mark, numOfLines);
                        newEssay.setWordLimit(wordLimit);
                        newSubsection.addQuestion(newEssay);
                    }
                }
                newSection.addSubsection(currentSubsection);
            }
        }
        this.testName = selectedTest.getName();
    }

    public void markMcqQuestions() {
        for (Section section : selectedTest.getSections()) {
            for (Subsection subsection : section.getSubsections()) {
                for (Question question : subsection.getQuestions()) {
                    if (question instanceof Mcq) {
                        if (question.checkAnswer()) {
                            this.mcqMark += question.getMark();
                            question.setStudentMark(question.getMark());
                        }
                    }
                }
            }
        }
    }

    public void markFibqQuestions() {
        for (Section section : selectedTest.getSections()) {
            for (Subsection subsection : section.getSubsections()) {
                for (Question question : subsection.getQuestions()) {
                    if (question instanceof Fibq) {
                        Fibq currentFibq = (Fibq) question;
                        if (currentFibq.isAutoMarked()) {
                            currentFibq.checkAnswer();
                            this.fibqMark += currentFibq.getStudentMark();
                        }
                    }
                }
            }
        }
    }

    public void setAnswersForQuestion(String answer, Section section, Subsection subsection, Question question) {
    }

    public void setAnswersForQuestion(ArrayList<Integer> answers, Section section, Subsection subsection, Question question) {
    }

    public void setAnswerForQuestion(ArrayList<String> answers, Section section, Subsection subsection, Question question) {
    }

    @Override
    public String toString() {
        return this.name;
    }
}
