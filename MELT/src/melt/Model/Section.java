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
public class Section {
    private int id;
    private String name;
    private String instructions;
    
    /**
     * Get the section instructions.
     * @return the string with the section instructions
     */
    public String getInstructions() {
        return instructions;
    }

    /**
     * Set the instructions for the test.
     * @param instructions the string containing the instructions
     */
    @XmlElement
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
    
    @XmlElement(name="subsection")
    private ArrayList<Subsection> subsections;
    private double time;
    
    /**
     * Empty constructor for the section class. We initialize the arraylist
     * to get an empty subsection from the xml file, if there is any.
     */
    public Section() {
        
        subsections = new ArrayList();
    
    }
    /**
     * Constructor for the section class.
     * @param id the id of the section
     * @param time the time limit for the section
     */
    public Section(int id,double time,String name,String instructions) {
        this.id = id;
        this.time = time;
        this.name = name;
        this.instructions = instructions;
        subsections = new ArrayList();
    }

    /**
     * Get the id of the section
     * @return the id of the section
     */
    public int getId() {
        return id;
    }

    
    /**
     * Get all the subsections in the section
     * @return the list of the subsections
     */
    public ArrayList<Subsection> getSubsections() {
        return subsections;
    }
    
    /**
     * Get a subsection from the list of the subsections given
     * a subsection id.
     * @param id the id of the subsection
     * @return the subsection with the desired id. Null if the subsection does
     * not exist
     */
    public Subsection getSubsectionById(int id) {
        for (Subsection subsection : subsections){
            if(subsection.getId()==id){
                return subsection;
            }
        }
        return null;
    }

    /**
     * Set the id of the section
     * @param id the id of the section
     */
    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Set the section name.
     * @param name the string that contains the name of the section
     */
    @XmlElement
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * Get the name of the section.
     * @return String that contains the name of the section
     */
    public String getName(){
        return this.name;
    }
    /**
     * Add a new subsection to the list of subsections
     * @param subsection the new subsection to add
     * @return the result of the addition
     */
    public boolean addSubsection(Subsection subsection) {
               
        for (Subsection sub : subsections){
            if(sub.getId()==subsection.getId()){
                return false;
            }
        }
        
       this.subsections.add(subsection);
       return true;
    }
    /**
     * Delete a subsection from a list given a subsection id.
     * @param subsectionId the id of the subsection we want to delete
     * @return the result of the deletion
     */
    public boolean deleteSubsection(int subsectionId){
        
        for(Subsection subsection : subsections){
            if(subsection.getId() == subsectionId){
                this.getSubsections().remove(subsection);
                return true;
            }
        }
        return false;
        
    }
    /**
     * Get the time limit of the section
     * @return the time limit of the section
     */
    public double getTime() {
        return time;
    }

    /**
     * Set the time limit for the section
     * @param time the time limit for the section
     */
    @XmlElement
    /**Set the time for the section.
     * @param time the time limit for the section
     */
    public void setTime(double time) {
        this.time = time;
    }
    
    /**
     * Get the string representation of the section.
     * @return the section name
     */
    @Override
    public String toString() {
        return this.getName();
    }
    
    
}
