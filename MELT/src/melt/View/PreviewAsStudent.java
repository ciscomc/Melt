/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.View;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import melt.Model.Section;
import melt.Model.Test;

/**
 *
 * @author panos
 */
public class PreviewAsStudent extends javax.swing.JPanel {

    private Test testObject;
    private SingleSectionPanel sectionPanel;
    private int sectionID=1;
    private ClockDisplay sectionClock;
    /**
     * Creates new form PreviewAsStudent
     */
    public PreviewAsStudent(Test test) {
        
        initComponents();
        this.testObject = test;
        sectionClock = new ClockDisplay(0,0,0);
        if(test.getSections().isEmpty()){
            JOptionPane.showMessageDialog(this, "The test is empty - there is nothing to preview");
            this.setVisible(false);
        }
        else{
            
            Section currentSection = testObject.getSectionById(sectionID);
            sectionPanel = new SingleSectionPanel(currentSection);
            this.jScrollPane1.setViewportView(sectionPanel);
            sectionPanel.showSection(); 
            int minutes = (int) (currentSection.getTime() % 60);
            int hours = (int) (currentSection.getTime() / 60);
            sectionClock.setTime(hours, minutes, 0);
            this.sectionTimeLabel.setText(sectionClock.getTime());
            this.revalidate();        
            //this.nextSectionBtn.doClick();
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        previousSectionBtn = new javax.swing.JButton();
        nextSectionBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        sectionTimeLabel = new javax.swing.JLabel();
        sectionTimeInfoLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));

        previousSectionBtn.setFont(new java.awt.Font("MV Boli", 0, 16)); // NOI18N
        previousSectionBtn.setText("Previous Section");
        previousSectionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousSectionBtnActionPerformed(evt);
            }
        });

        nextSectionBtn.setFont(new java.awt.Font("MV Boli", 0, 16)); // NOI18N
        nextSectionBtn.setText("Next Section");
        nextSectionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextSectionBtnActionPerformed(evt);
            }
        });

        jScrollPane1.setPreferredSize(new java.awt.Dimension(900, 511));

        sectionTimeLabel.setFont(new java.awt.Font("MV Boli", 0, 16)); // NOI18N
        sectionTimeLabel.setText("00:00:00");

        sectionTimeInfoLabel.setFont(new java.awt.Font("MV Boli", 0, 16)); // NOI18N
        sectionTimeInfoLabel.setText("Time for section :");

        jLabel1.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Preview Mode");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sectionTimeInfoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sectionTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(previousSectionBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextSectionBtn)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sectionTimeInfoLabel)
                        .addComponent(sectionTimeLabel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nextSectionBtn)
                        .addComponent(previousSectionBtn)))
                .addGap(8, 8, 8))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void showPreview(){
    
        JFrame aframe = new JFrame();
        aframe.add(sectionPanel);
        aframe.add(jScrollPane1);
        aframe.add(this);
        aframe.pack();
        aframe.setSize(900, 640);
        aframe.setVisible(true);
        
            if(testObject.getSections().isEmpty()){
            JOptionPane.showMessageDialog(this, "The test is empty - there is nothing to preview");
            this.setVisible(false);
        }
        else{
            
            Section currentSection = testObject.getSectionById(sectionID);
            sectionPanel = new SingleSectionPanel(currentSection);
            this.jScrollPane1.setViewportView(sectionPanel);
            sectionPanel.showSection(); 
            int minutes = (int) (currentSection.getTime() % 60);
            int hours = (int) (currentSection.getTime() / 60);
            sectionClock.setTime(hours, minutes, 0);
            this.sectionTimeLabel.setText(sectionClock.getTime());
            this.revalidate();
            System.out.println("this");
            //this.nextSectionBtn.doClick();
        }
    }
    private void nextSectionBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_nextSectionBtnActionPerformed
        // TODO add your handling code here:
        if(sectionID == testObject.getSections().size()){
            JOptionPane.showMessageDialog(this, "This is the last section of the test");
        }
        else{
            
            sectionID++;
            Section currentSection = testObject.getSectionById(sectionID);
            sectionPanel = new SingleSectionPanel(currentSection);
            this.jScrollPane1.setViewportView(sectionPanel);
            sectionPanel.showSection(); 
            int minutes = (int) (currentSection.getTime() % 60);
            int hours = (int) (currentSection.getTime() / 60);
            sectionClock.setTime(hours, minutes, 0);
            this.sectionTimeLabel.setText(sectionClock.getTime());
            this.revalidate();
        }
    }//GEN-LAST:event_nextSectionBtnActionPerformed

    private void previousSectionBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_previousSectionBtnActionPerformed
        if(sectionID == 1){
            JOptionPane.showMessageDialog(this,"This is the first section of the test");
        }
        else{
            sectionID--;
            Section currentSection = testObject.getSectionById(sectionID);
            sectionPanel = new SingleSectionPanel(currentSection);
            this.jScrollPane1.setViewportView(sectionPanel);
            sectionPanel.showSection();
            int minutes = (int) (currentSection.getTime() % 60);
            int hours = (int) (currentSection.getTime() / 60);
            sectionClock.setTime(hours, minutes, 0);
            this.sectionTimeLabel.setText(sectionClock.getTime());
            this.revalidate();
        }
        
    }//GEN-LAST:event_previousSectionBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nextSectionBtn;
    private javax.swing.JButton previousSectionBtn;
    private javax.swing.JLabel sectionTimeInfoLabel;
    private javax.swing.JLabel sectionTimeLabel;
    // End of variables declaration//GEN-END:variables
}
