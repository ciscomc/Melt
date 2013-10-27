/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.View;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.AbstractDocument;
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
        this.validate();
        return this;
    }
    
    public void setStudentAnswer(){
        this.essayQuestion.setStudentAnswer(this.essayTextArea.getText());
        
    }
    
    public void clearAnswer(){
        this.essayTextArea.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */                      
    private void initComponents() {

        essayQuestionLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        essayTextArea = new javax.swing.JTextArea();

        essayQuestionLabel.setFont(new java.awt.Font("MV Boli", 0, 16)); // NOI18N
        essayQuestionLabel.setText("Question Text");

        essayTextArea.setColumns(20);
        essayTextArea.setRows(1);
        jScrollPane1.setViewportView(essayTextArea);
       /* Dimension d = essayTextArea.getPreferredSize(); 
        int row = d.height / essayTextArea.getRows(); 
        int column= d.width / essayTextArea.getColumns();
        System.out.print(""+row+" "+column);
        * row=15;column=11;
        */
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,750, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(essayQuestionLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(essayQuestionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,  16*essayQuestion.getNoOfLines(), javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>                        
    // Variables declaration - do not modify                     
    private javax.swing.JLabel essayQuestionLabel;
    private javax.swing.JTextArea essayTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}
