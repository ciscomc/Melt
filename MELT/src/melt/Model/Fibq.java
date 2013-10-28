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

    private ArrayList<FibqSingleBlank> correctAnswers;
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
    public Fibq(ArrayList<FibqSingleBlank> correctAnswers, int id, String questionText) {
        super(id, questionText, 0);
        this.correctAnswers = correctAnswers;
        double mark=0;
        for (FibqSingleBlank blankanswer: correctAnswers) {
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

        
        double mark=0;
        for(FibqSingleBlank blank: correctAnswers){
            blank.checkAnswer();
            mark+=blank.getStudentMarkForBlank();
         }
      this.setStudentMark(mark);
      return true;
    }
    
        
    /**
     * Set the answers for the question
     * @param correctAnswers an arraylist with the correct answers.
     */
    @XmlElement(name="BlankAnswers")
    public void setCorrectAnswers(ArrayList<FibqSingleBlank> correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    
    
    /**
     * Get all the answers in an array list
     * @return the array list of the answers
     */
    public ArrayList<FibqSingleBlank> getCorrectAnswers() {
        return correctAnswers;
    }

    @Override
    public double getStudentMark(){
        double mark=0;
        for(FibqSingleBlank blank : this.correctAnswers){
            
            mark+=blank.getStudentMarkForBlank();
            
        }
        this.setStudentMark(mark);
        return mark;
    }
   
    
}
