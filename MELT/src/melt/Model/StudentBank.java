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
 * @author panos
 */
@XmlRootElement
public class StudentBank {
    
    
    private ArrayList<Student> studentList;
    
    
    public StudentBank(){
        this.studentList = new ArrayList();
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    @XmlElement(name="Student")
    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
    
    public Student getStudentByName(String name){
        for(Student  student : this.studentList){
            if(student.getName().equals("name")){
                return student;
            }
            
        }
        return null;
    }
    public Student getStudentById(int id){
        
       for(Student student : this.studentList){
           if(student.getId()==id){
               return student;
           }
       }
       return null;
    }
    
    public Student addStudent(String name,Test studentSelection){
        int newID = this.getStudentList().size();
        Student student = new Student(name, newID, studentSelection);
        this.studentList.add(student);
        return student;
    }
    @Override
    public String toString()
    {
        return "StudentBank";
    } 
}
