/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.View;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import melt.Controller;
import melt.Model.Section;
import melt.Model.Test;
import melt.Model.TestBank;

/**
 *
 * @author mbaxkfx2
 */
public class StudentTestDetails extends javax.swing.JPanel {
    private Controller controller;
    private TestBank model;
    private Viewer viewer;
    private Test test1;
    /**
     * Creates new form StudentTestDetails
     */
   
    public StudentTestDetails(Controller controller)
    {   
        initComponents();
        this.controller = controller;
        
    }
    public static void main(String args[])
    {   
        ArrayList<JLabel> labelList = null;
        Controller controller;
        TestBank model = null;
        Viewer viewer = null;
        Test test1;
        controller = new Controller(model,viewer,"melt.xml");
        controller.loadFromXmlFile();
        test1=controller.getTest(1);
        StudentTestDetails details= new StudentTestDetails(controller);
        labelList = new ArrayList<>();
        for (Section section:test1.getSections()){
        JLabel labelSection=new JLabel(section.getName());
        labelList.add(labelSection);
        }
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(details);
        details.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelList.get(0),javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelList.get(1),javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap()));

        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20,20,20)
                .addComponent(labelList.get(0), javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelList.get(1), javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, 10)));
        
        JFrame aframe = new JFrame();
        aframe.add(details);
        aframe.setSize(800, 600);
        aframe.setVisible(true);
        
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 774, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}