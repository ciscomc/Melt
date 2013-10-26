/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.View.marker;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import melt.Controller;
import melt.Model.Essay;
import melt.Model.Fibq;
import melt.Model.Question;
import melt.Model.Subsection;
import melt.Model.Test;

/**
 *
 * @author mbaxjah5
 */
public class FibqPanel extends javax.swing.JPanel {
    private Subsection subsectionObject;
    private Controller controller;
    private Fibq fibqObject;
    private AbstractListModel listModelOfStudentAnswer;
    private AbstractListModel listModelOfCorrectAnswer;
    private MarkerTreePanel markerTreePanel;
    private MarkerPanel markerPanel;
    /**
     * Creates new form FibqPanel
     */
    public FibqPanel(Controller controller,MarkerPanel markerPanel) {
        this.controller =controller;
        initComponents();
        this.markerPanel = markerPanel;
        jScrollPane3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        
           
        
    }
     public void setQuestion(Fibq fibq) {
        this.fibqObject = fibq;
        preview();
    }
    
    public void setSubsectionObject(Subsection subsection) {
        this.subsectionObject = subsection;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblMarks = new javax.swing.JLabel();
        txtMarks = new javax.swing.JTextField();
        btnMark = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listCorrectAnswers = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        listStudentAnswers = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        labelQuestionText = new javax.swing.JLabel();

        lblTitle.setFont(new java.awt.Font("Snap ITC", 0, 30)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Fill in the Blank Question");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setText("Question:");

        jLabel2.setText("Student Answers:");

        lblMarks.setFont(new java.awt.Font("MV Boli", 0, 16)); // NOI18N
        lblMarks.setText("Marks:");

        txtMarks.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMarks.setText("             ");
        txtMarks.setMinimumSize(new java.awt.Dimension(60, 25));
        txtMarks.setPreferredSize(new java.awt.Dimension(60, 25));

        btnMark.setText("Mark");
        btnMark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarkActionPerformed(evt);
            }
        });

        listCorrectAnswers.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listCorrectAnswers);

        listStudentAnswers.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(listStudentAnswers);

        jLabel3.setText("Correct Answers:");

        labelQuestionText.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(labelQuestionText, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMark, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(labelQuestionText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMark, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMarks))
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarkActionPerformed

        if(txtMarks.getText()!=null){          
            
            markerPanel.redrawFIBQPanel((Fibq) markerTreePanel.getSelectedObject());
        }else{
            
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMarkActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMark;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelQuestionText;
    private javax.swing.JLabel lblMarks;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JList listCorrectAnswers;
    private javax.swing.JList listStudentAnswers;
    private javax.swing.JTextField txtMarks;
    // End of variables declaration//GEN-END:variables

    private void preview() {
        labelQuestionText.setText(fibqObject.getQuestionText());
        final String[] arrayOfStudentAnswers = new String[fibqObject.getStudentAnswer().size()+1];
        for(int i=0;i<fibqObject.getStudentAnswer().size();i++){
           arrayOfStudentAnswers[i] = fibqObject.getStudentAnswer().get(i);
        }
        listModelOfStudentAnswer = new AbstractListModel() {
     
            @Override
            public int getSize() {
                return arrayOfStudentAnswers.length;//To change body of generated methods, choose Tools | Templates.
            }
     
            @Override
            public Object getElementAt(int i) {
                 return arrayOfStudentAnswers[i]; //To change body of generated methods, choose Tools | Templates.
            }
        };
        listStudentAnswers.setModel(listModelOfStudentAnswer);
        final ArrayList[] arrayOfCorrectAnswers = new ArrayList[fibqObject.getCorrectAnswers().size()];
        for(int i=0;i<fibqObject.getCorrectAnswers().size();i++){
           arrayOfCorrectAnswers[i] = fibqObject.getCorrectAnswers().get(i).getPossibleAnswers();
        }
        listModelOfCorrectAnswer = new AbstractListModel() {
     
            @Override
            public int getSize() {
                return arrayOfCorrectAnswers.length;//To change body of generated methods, choose Tools | Templates.
            }
     
            @Override
            public Object getElementAt(int i) {
                 return arrayOfCorrectAnswers[i]; //To change body of generated methods, choose Tools | Templates.
            }
        };
        listCorrectAnswers.setModel(listModelOfCorrectAnswer);
        if(fibqObject.isAutoMarked()){
           btnMark.setEnabled(false);
           txtMarks.setText(""+fibqObject.getMark());
           txtMarks.setEnabled(false);
           jLabel3.setVisible(true);
           listCorrectAnswers.setVisible(true); 
        }else{
            btnMark.setEnabled(true);
           txtMarks.setText("");
           txtMarks.setEnabled(true);
           jLabel3.setVisible(false);
           listCorrectAnswers.setVisible(false); 
        }
       //To change body of generated methods, choose Tools | Templates.
    }
}
