/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.Model;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author mbaxkpg2
 */
public class Subsection {
    
    private int id;
    private String name;
    
    @XmlElement(name="question")
    private ArrayList<Question> questions;

    //The type of questions a subsection will contain. Can either
    //be "Mcq" or "Fibq".
    private String questionType;

    /**
     * Get the type of the questions that the subsection will contain.
     * @return the type which can either be "Mcq" or "Fibq"
     */
    public String getType() {
        return questionType;
    }
    
    /**
     * Get the name of the section.
     * @param name the string that contains the name of the section.
     */
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set the type of questions that the subsection will contain.
     * @param type The string that contains the type of the question. Can either be
     * "Mcq" or "Fibq" or "Essay"
     */
    @XmlElement
    public void setType(String type) {
        this.questionType = type;
    }

    /**
     * Get the name of the subsection.
     * @return the string that contains the name of the subsection
     */
    public String getName() {
        return name;
    }
    
    /**
     * Empty constructor for the subsection class. Used when we have
     * empty subsections in the xml file.
     */
    public Subsection(){
        questions = new ArrayList();
    }

    /**
     * Constructor for the subsection class
     * @param id the id of the subsection
     */
    public Subsection(String type,String name,int id) {
        this.id = id;
        this.name = name;
        this.questionType = type;
        questions = new ArrayList();
    }

    /**
     * Get the id of the subsection.
     * @return the id of the subsection
     */
    public int getId() {
        return id;
    }

    /**
     * Get the list of questions in the subsection
     * @return the list of questions contained in the subsection
     */
    public ArrayList<Question> getQuestions() {
        return questions;
    }
    
    /**
     * Get a question from the subsection given the question's id
     * @param id the id of the question
     * @return the question with the given id. Null is returned if the
     * question does not exist.
     */    
    public Question getQuestionById(int id) {
        for (Question quest : questions){
            if(quest.getId()==id){
                return  quest;
            }
        }
        return null;
    }

    /**
     * Set the subsection id
     * @param id the id of the subsection
     */
    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Add a new question to the subsection
     * @param question the new question to add
     * @return the result of the addition
     */
    public boolean addQuestion(Question question) {
                
        for (Question quest : questions){
            if(quest.getId()==question.getId()){
                // Question already exists
                return false;
            }
        }
        
        this.questions.add(question);
        return true;
    }

    
    
    /**
     * Replace a question in the subsection.
     * @param id the id of the question that we want to replace
     * @param newQuestion The new question
     * @return result of the replacement. A false is returned if a question with
     * the given id does not exist
     */
    public boolean editQuestion(int id, Question newQuestion)
    {
        Question oldQuestion = null;
        
        for (Question question : questions){
            if(question.getId()==id){
                oldQuestion = question;
                break;
            }
        }
        
        if (oldQuestion != null)
        {
            questions.remove(getQuestionById(id));
            questions.add(newQuestion);
            return true;
        }
        else{
            return false;
        }
        
        
    }
    
    /**
     * Delete a question from the subsection, given a question ID
     * @param id the id of the question we want to remove
     * @return the result of the deletion.
     */
    public boolean deleteQuestion(int id){
        
        for(Question question : this.getQuestions()){
            if(question.getId()==id){
                this.getQuestions().remove(question);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Return the string representation of the subsection.
     * @return the name of the subsection
     */
    @Override
    public String toString() {
        return this.getName();
    }
}
