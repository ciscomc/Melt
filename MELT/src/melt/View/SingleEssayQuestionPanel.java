/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.View;

import javax.swing.JPanel;
import melt.Model.Essay;

/**
 *
 * @author panos
 */
public class SingleEssayQuestionPanel extends javax.swing.JPanel {

    private Essay essayQuestion;
    /**
     * Creates new form SingleEssayQuestionPanel
     */
    public SingleEssayQuestionPanel(Essay essayQuestionObject) {
        this.essayQuestion = essayQuestionObject;
        initComponents();
    }

    public JPanel showQuestion(){
        
        this.essayQuestionLabel.setText(essayQuestion.getQuestionText() + " " + "Maximum number of words : " + this.essayQuestion.getWordLimit());
        
        return this;
    }
    
    public void setStudentAnswer(){
        this.essayQuestion.setStudentAnswer(this.essayTextArea.getText());
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        essayQuestionLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        essayTextArea = new javax.swing.JTextArea();

        essayQuestionLabel.setFont(new java.awt.Font("MV Boli", 0, 16)); // NOI18N
        essayQuestionLabel.setText("Question Text");

        essayTextArea.setColumns(20);
        essayTextArea.setRows(5);
        jScrollPane1.setViewportView(essayTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(essayQuestionLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(essayQuestionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel essayQuestionLabel;
    private javax.swing.JTextArea essayTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
