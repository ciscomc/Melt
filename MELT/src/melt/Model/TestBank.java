/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.Model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlRootElement;  



/**
 *
 * @author mbaxkmc7
 */
@XmlRootElement

public class TestBank {
    
   
    private ArrayList<Test> tests;
    
    /**
     * 
     */
    public TestBank()
    {
        this.tests = new ArrayList();
    }
    /**
     * Get all the tests that are contained
     * @return the list of tests
     */
    public ArrayList<Test> getTests() {
        return tests;
    }
    
    /**
     * Get a test, given a test id
     * @param id the id of the test
     * @return the desired test. Null is returned if the test
     * does not exist
     */
    public Test getTestById(int id)
    {
        
       for (Test test : tests){
            if(test.getId()==id){
                return test;
            }
        }
        return null;
    }

    /*
     * add a new test to the list
     */
    //@XmlElement(name="test")
    public void addTest(Test test) {
        this.tests.add(test);
    }
    
    /**
     * Set the test list
     * @param tests the list of tests
     */
    @XmlElement(name="test")
    public void setTests(ArrayList<Test> tests){
        this.tests = tests;
        
    }
    /**
     * Delete a test from the list
     * @param id the id of the test to delete
     * @return result of the deletion.
     */
    public boolean deleteTest(int id){
        
        for(Test test : getTests()){
            if(test.getId() == id){
                getTests().remove(test);
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "All Tests";
    }
   
    
    
}
