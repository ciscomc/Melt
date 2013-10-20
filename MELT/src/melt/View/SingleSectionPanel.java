/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.View;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import melt.Model.Mcq;
import melt.Model.Question;
import melt.Model.Section;
import melt.Model.Subsection;

/**
 *
 * @author panos
 */
public class SingleSectionPanel extends JPanel {
    
    private Section sectionObject;
    ArrayList<SingleQuestionPanel> questionPanels;
    
    public SingleSectionPanel(Section section){
        
        questionPanels = new ArrayList();
         this.sectionObject = section;
         this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    public void setSectionObject(Section sectionObject) {
        this.sectionObject = sectionObject;
    }
    
    
    public void showSection(){
        final JPanel newPanel = new JPanel();
        JLabel sectionNameLabel = new JLabel(sectionObject.getName());
        sectionNameLabel.setFont(new java.awt.Font("DejaVu Sans", 0, 16));
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(newPanel);
        newPanel.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(sectionNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(sectionNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10,10))
        );
        
        this.add(newPanel);
        for(Subsection subsection : sectionObject.getSubsections()){
           showSubsection(subsection);
            
        }
    }
    
    public void showSubsection(Subsection subsection){
        final JPanel newPanel = new JPanel();
        JLabel subsectionNameLabel = new JLabel(subsection.getName());
        subsectionNameLabel.setFont(new java.awt.Font("DejaVu Sans", 0, 16));
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(newPanel);
        newPanel.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(subsectionNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(subsectionNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10,10))
        );
        this.add(newPanel);
        for(Question question : subsection.getQuestions()){
            SingleQuestionPanel questionPanel = new SingleQuestionPanel((Mcq) question);
            this.questionPanels.add(questionPanel);
            this.add(questionPanel.showQuestion());
        }
        
    }
    
    
    public static void main(String[] args){
        
        Section section = new Section(1, 5, "section 1 ", "instructions");
        Subsection subsection = new Subsection("Mcq", "Subsection 1", 1);
        String questionText = "question 1 ";
        ArrayList<String> answers = new ArrayList();
        answers.add("answer1");
        answers.add("answer2");
        ArrayList<Integer> correctAnswers = new ArrayList();
        correctAnswers.add(1);
        
        Mcq question = new Mcq(answers, correctAnswers, 1, questionText, 4.0);
        subsection.addQuestion(question);
        section.addSubsection(subsection);
        
        
        
        
        SingleSectionPanel sectionPanel = new SingleSectionPanel(section);
        JFrame aframe = new JFrame();
        aframe.add(sectionPanel);
        sectionPanel.showSection();
        
        aframe.setSize(800, 600);
        aframe.setVisible(true);
    }
    
    public void setPanelAnswers(){
        for(SingleQuestionPanel questionPanel : questionPanels){
            questionPanel.setStudentAnswer();
        }
    }
}
