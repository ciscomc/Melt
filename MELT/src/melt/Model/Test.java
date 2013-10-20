/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.Model;

import java.util.ArrayList;
import javax.xml.bind.annotation.*;

/**
 *
 * @author mbaxkpg2
 */


//@XmlRootElement(namespace="melt.TestBank")
public class Test {
    
    private int id;
    
    private String name;
    private String creator;
    private String instructions;
    
    
    @XmlElement(name="section")
    private ArrayList<Section> sections;
    
  public Test() {
        sections = new ArrayList();
    }

    /**
     * Constructor for the Test class.
     * @param id the id of the new test
     * @param name the name of the test
     * @param creator name of the test creator
     */
    public Test(int id, String name, String creator) {
        this.id = id;
        this.name = name;
        this.creator = creator;
        sections = new ArrayList();
        //
    }

    
    /**
     * Set the name of the test.
     * @param name the name of the test
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the name of the test
     * @return name of the test
     */
    public String getName() {
        return name;
    }

    
    /**
     * 
     * @return the id of the test
     */
    public int getId() {
        return id;
    }
    
    /**
     * 
     * @return the creator of the test
     */
    public String getCreator() {
        return creator;
    }
    
    /**
     * 
     * @return the instructions of the test
     */
    //@XmlElement
    public String getInstructions() {
        return instructions;
    }

    /**
     * Get all the sections in the test
     * @return the list of the sections in the test
     */
    //@XmlElements(XmlElement(name="Section"))
    public ArrayList<Section> getSections() {
        return sections;
    }
    
    /**
     * Get a section of the test, given a section id
     * @param id the section Id
     * @return The desired section. Null is returned if the section
     * does not exist.
     */
    public Section getSectionById(int id) {
        for (Section section : sections){
            if(section.getId()==id){
                return section;
            }
        }
        return null;
    }
    
    /**
     * Set the id of the test
     * @param id the new test id
     */
    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Set the creator of the test
     * @param creator name of the test creator
     */
    @XmlElement
    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    /**
     * Set the instructions for the test
     * @param instructions the instructions of the test 
     */
    @XmlElement
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
    
    /**
     * Add a new section to the test
     * @param section the new section that we want to add
     * @return the result of the addition
     */
    public boolean addSection(Section section) {
        
        if(sections == null){
            //sections = new ArrayList();
            this.sections.add(section);
            return true;
        }
        for (Section sect : sections){
            if(sect.getId()==section.getId()){
                // Question already exists
                return false;
            }
        }
        
        this.sections.add(section);
        return true;
    }
    /**
     * Delete a section of the test, given a section Id
     * @param sectionId the id of the section that we want to delete
     * @return the result of the action.
     */
    public boolean deleteSection(int sectionId){
        
        for(Section section : sections){
            if(section.getId()== sectionId){
                this.getSections().remove(section);
                return true;
            }
        }
        return false;
        
    }
    
    @Override
    public String toString() {
        return this.getName();
    }
            

}
