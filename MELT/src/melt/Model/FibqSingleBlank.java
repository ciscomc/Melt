/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.Model;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Abdu
 */
public class FibqSingleBlank {

    private ArrayList<String> possibleAnswers;
    private double mark;
    private double studentMarkForBlank=-1;
    private String studentAnswer;

    public FibqSingleBlank() {
        this.possibleAnswers = new ArrayList();
    }

    public FibqSingleBlank(ArrayList<String> possibleAnswers, double mark) {
        this.possibleAnswers = possibleAnswers;
        this.mark = mark;
    }

    public ArrayList<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    @XmlElement(name="Answer")
    public void setPossibleAnswers(ArrayList<String> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    
    //Checks if the given answer is in the list of possible answers.
    public boolean checkAnswer() {

        for (String correctAnswer : possibleAnswers) {
            if (this.studentAnswer.equalsIgnoreCase(correctAnswer)) {
                this.studentMarkForBlank = this.mark;
                return true;
            }
        }
        this.studentMarkForBlank = 0;
        return false;

    }

    @XmlElement
    public void setMark(double mark) {
        this.mark = mark;
    }

    @XmlElement
    public void setStudentMarkForBlank(double studentMarkForBlank) {
        this.studentMarkForBlank = studentMarkForBlank;
        
    }

    public double getMark() {
        return mark;
    }

    public double getStudentMarkForBlank() {
        return studentMarkForBlank;
    }

     /**
     * Get the student answer.
     * @return the answer of the student 
     */
    public String getStudentAnswer() {
        return studentAnswer;
    }

    /**
     * Set the answer of a student
     * @param studentAnswer the student answer
     */
    @XmlElement(name="StudentAnswer")
    public void setStudentAnswer(String studentAnswer) {
        this.studentAnswer = studentAnswer;
    }
    
    
    @Override
    public String toString(){
        String correctAnswers = "";
        for(String str: possibleAnswers){
            correctAnswers += str + ",";
        }
        return correctAnswers.substring(0, correctAnswers.lastIndexOf(","));
       
        
    }
    
    
}
