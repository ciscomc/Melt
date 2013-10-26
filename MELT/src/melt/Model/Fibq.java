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
public class Fibq extends Question {

    private ArrayList<FibqBlankAnswers> correctAnswers;
    private ArrayList<String> studentAnswer;
    private boolean autoMarked = false;

    public boolean isAutoMarked() {
        return autoMarked;
    }

    @XmlElement(name="automarked")
    public void setAutoMarked(boolean autoMarked) {
        this.autoMarked = autoMarked;
    }
     /**
     * Empty constructor
     */
    public Fibq() {
        
    }

    /**
     * Constructor for a fill in the blanks question.
     *
     * @param correctAnswers An array list for the correct answers in the
     * question.
     * @param id The id of the new question - for internal use.
     * @param questionText The text of the question
     * @param mark The mark that the question will have
     */
    public Fibq(ArrayList<FibqBlankAnswers> correctAnswers, int id, String questionText) {
        super(id, questionText, 0);
        this.correctAnswers = correctAnswers;
        double mark=0;
        for (FibqBlankAnswers blankanswer: correctAnswers) {
            mark += blankanswer.getMark();
        }
        this.setMark(mark);
    }

    /**
     * Check if an answer is correct
     *
     * @return the result of the check
     */

    @Override
    public boolean checkAnswer() {

        int i;
        for (i=0;i<correctAnswers.size();i++) {
            boolean res = correctAnswers.get(i).checkAnswer(studentAnswer.get(i));
            if (res == false) return false;
            
        }
        
        return true;
    }

    /**
     * Set the answers for the question
     * @param correctAnswers an arraylist with the correct answers.
     */
    @XmlElement(name="BlankAnswers")
    public void setCorrectAnswers(ArrayList<FibqBlankAnswers> correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    /**
     * Set the answer of a student
     * @param studentAnswer the student answer
     */
    @XmlElement(name="StudentAnswers")
    public void setStudentAnswer(ArrayList<String> studentAnswer) {
        this.studentAnswer = studentAnswer;
    }

    /**
     * Get all the answers in an array list
     * @return the array list of the answers
     */
    public ArrayList<FibqBlankAnswers> getCorrectAnswers() {
        return correctAnswers;
    }

    /**
     * Get the student answer.
     * @return the answer of the student 
     */
    public ArrayList<String> getStudentAnswer() {
        return studentAnswer;
    }
}
