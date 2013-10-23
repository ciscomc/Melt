/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.View;

import javax.swing.JOptionPane;
import melt.Controller;
import melt.Model.Section;
import melt.Model.Subsection;

/**
 *
 * @author Fuhao
 */
public class SubsectionDetails extends javax.swing.JPanel {

    private Controller controller;
    private Section sectionObject;
    private TreePanel treePane;
    private Subsection subsectionObject;

    /**
     * Creates new form SubsectionPanel
     */
    public SubsectionDetails() {
        initComponents();
    }

    public void deleteSubsection() {
        this.controller.deleteSubsection(sectionObject, subsectionObject.getId());
        treePane.removeCurrentNode();
    }

    public SubsectionDetails(Controller controller, TreePanel treePane) {
        setOpaque(true);
        this.controller = controller;
        this.treePane = treePane;
        initComponents();
    }

    public void setSectionObject(Section section) {
        this.sectionObject = section;
    }

    public void setSubsectionObject(Subsection subsection) {
        this.subsectionObject = subsection;
        preview();
    }

    private void preview() {
        if (subsectionObject == null) {
            clear();
        } else {
            subsectionName.setText(subsectionObject.getName());
            switch (subsectionObject.getType()) {
                case "Fibq":
                    radioFibq.setSelected(true);
                    break;
                case "Mcq":
                    radioMcq.setSelected(true);
                    break;
                case "Essay":
                    radioEssay.setSelected(true);
                    break;
                default:
            }
            saveButton.setEnabled(false);
            btnUpdate.setEnabled(true);
        }
    }

    private void clear() {
        subsectionName.setText("");
        saveButton.setEnabled(true);
        btnUpdate.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        subsectionName = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        lblQuestionType = new javax.swing.JLabel();
        radioMcq = new javax.swing.JRadioButton();
        radioFibq = new javax.swing.JRadioButton();
        btnUpdate = new javax.swing.JButton();
        radioEssay = new javax.swing.JRadioButton();

        lblTitle.setFont(new java.awt.Font("Snap ITC", 0, 30)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Subsection Details");

        lblName.setFont(new java.awt.Font("MV Boli", 0, 15)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Subsection Name:");

        subsectionName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        subsectionName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subsectionNameActionPerformed(evt);
            }
        });

        saveButton.setFont(new java.awt.Font("MV Boli", 0, 15)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        lblQuestionType.setFont(new java.awt.Font("MV Boli", 0, 15)); // NOI18N
        lblQuestionType.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblQuestionType.setText("Question Type:");

        btnGroup.add(radioMcq);
        radioMcq.setFont(new java.awt.Font("MV Boli", 0, 15)); // NOI18N
        radioMcq.setSelected(true);
        radioMcq.setText("Multiple Choice");

        btnGroup.add(radioFibq);
        radioFibq.setFont(new java.awt.Font("MV Boli", 0, 15)); // NOI18N
        radioFibq.setText("Fill in the Blanks");

        btnUpdate.setFont(new java.awt.Font("MV Boli", 0, 15)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnGroup.add(radioEssay);
        radioEssay.setFont(new java.awt.Font("MV Boli", 0, 15)); // NOI18N
        radioEssay.setText("Essay");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(83, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(244, 244, 244)
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(saveButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblName)
                                    .addComponent(lblQuestionType, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioMcq)
                                    .addComponent(subsectionName, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radioEssay)
                                    .addComponent(radioFibq))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(subsectionName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuestionType)
                    .addComponent(radioMcq))
                .addGap(6, 6, 6)
                .addComponent(radioFibq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioEssay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(saveButton))
                .addContainerGap(126, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void subsectionNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subsectionNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subsectionNameActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if (this.subsectionName.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter a name for the subsection.");
        } else {
            String subsectionQuestionType;
            String subName = this.subsectionName.getText();
            if (radioFibq.isSelected()) {
                subsectionQuestionType = "Fibq";
            } else if (radioMcq.isSelected()){
                subsectionQuestionType = "Mcq";
            } else {
                subsectionQuestionType = "Essay";
            }
            
            Subsection newSubsection = this.controller.addSubsection(sectionObject, subsectionQuestionType, subName);
            treePane.addSubSectionNode(newSubsection);
            this.controller.updateXmlFile();
        }

    }//GEN-LAST:event_saveButtonActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (this.subsectionName.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter a name for the subsection.");
        } else {
            String subsectionQuestionType;
            String subName = this.subsectionName.getText();
            if (radioFibq.isSelected()) {
                subsectionQuestionType = "Fibq";
            } else if (radioMcq.isSelected()){
                subsectionQuestionType = "Mcq";
            } else {
                subsectionQuestionType = "Essay";
            }

            if (!subsectionObject.getType().equals(subsectionQuestionType)) {
                if (subsectionObject.getQuestions().size() > 0) {
                    JOptionPane.showMessageDialog(this, "You can not change the question type while having saved questions in this subsection.\nTo have a subsection with different question type delete existing questions in this subsection or create a new subsection.");
                } else {
                    this.controller.updateSubsectionDetails(subsectionObject, subsectionQuestionType, subName);
                    this.controller.updateXmlFile();
                }
            } else {
                this.controller.updateSubsectionDetails(subsectionObject, subsectionQuestionType, subName);
                this.controller.updateXmlFile();
            }
        }// TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblQuestionType;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JRadioButton radioEssay;
    private javax.swing.JRadioButton radioFibq;
    private javax.swing.JRadioButton radioMcq;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField subsectionName;
    // End of variables declaration//GEN-END:variables
}
