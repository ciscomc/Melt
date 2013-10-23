/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.Model;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;


/**
 *
 * @author mbaxkpg2
 */

//@XmlType(propOrder={"questionText","answers", "correctAnswers", "mark" ,"studentAnswers"})

public class Mcq extends Question {

    //list with the answers to the question
    private ArrayList<String> answers;
    //list with the correct answers that correspond to the list of answers
    private ArrayList<Integer> correctAnswers;
    //the answers that the student gave
    private ArrayList<Integer> studentAnswers;

    /**
     * Empty constructor
     */
    public Mcq() {
        
    }
    
    public Mcq(ArrayList<String> answers, ArrayList<Integer> correctAnswers, int id, String questionText, double mark) {
        super(id, questionText, mark);
        this.answers = answers;
        this.correctAnswers = correctAnswers;
    }

    
    public ArrayList<String> getAnswers() {
        return answers;
    }

    
    public ArrayList<Integer> getCorrectAnswers() {
        return correctAnswers;
    }

    @XmlElement(name="answer")
    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    @XmlElement(name="correctAnswer")
    public void setCorrectAnswers(ArrayList<Integer> correctAnswers) {
        this.correctAnswers = correctAnswers;
    }
    

    public ArrayList<Integer> getStudentAnswers() {
        return studentAnswers;
    }

    @XmlElement(name="Student answers")
    public void setStudentAnswers(ArrayList<Integer> studentAnswers) {
        this.studentAnswers = studentAnswers;
    }
    
    
    
    @Override
    public boolean checkAnswer(){
        
        if (correctAnswers.size() != studentAnswers.size())
            return false;
        
        int counter = 0;
        
        for (Integer answer : correctAnswers)
        {
            for (Integer studentAnswer : studentAnswers)
            {
                if (studentAnswer.intValue() == answer.intValue())
                {
                    counter++;
                    break;
                }
            }
        }
        
        if (counter == correctAnswers.size())
            return true;
        
        return false;
    }
    
}
