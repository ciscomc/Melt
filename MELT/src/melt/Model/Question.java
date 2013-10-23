/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.Model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author mbaxkpg2
 */
@XmlSeeAlso ({Mcq.class,Fibq.class,Essay.class})
public abstract class Question {
    
    private int id;
    private String questionText;
    private double mark;
    
    public Question() {
        
        
    
    }
    /**
     * 
     * @param id the id of the question
     * @param questionText the text of the question (the question itself)
     * @param mark the mark that the student will get from the question
     */
    public Question(int id,String questionText,double mark){
        this.id = id;
        this.questionText = questionText;
        this.mark = mark;
           
    }

    /**
     * Get the id of the question
     * @return the id of the question
     */
    public int getId() {
        return id;
    }
   
    /**
     * Get the text of the question
     * @return the text of the question
     */
    public String getQuestionText() {
        return questionText;
    }

    /**
     * Get the mark of the question
     * @return the mark of the question
     */
    public double getMark() {
        return mark;
    }

    

 
    /**
     * Set an id for the question
     * @param id the id of the question
     */
    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Set the text of the question
     * @param questionText the text of the question
     */
    @XmlElement
    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }
    
    /**
     * Set the mark that the question will have
     * @param mark the mark of the question
     */
    @XmlElement
    public void setMark(double mark) {
        this.mark = mark;
    }

    
    /**
     * Check if the answer of the question is correct
     * @return the result of the check
     */
    public abstract boolean checkAnswer();
    
    @Override
    public String toString(){
        Integer x = this.getId();
        return "Q" + x.toString();
    }
    
}
