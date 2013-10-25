/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.View.marker;

import melt.Controller;
import melt.Model.Essay;
import melt.Model.Mcq;
import melt.Model.Subsection;

/**
 *
 * @author mbaxjah5
 */
public class EssayPanel extends javax.swing.JPanel {
    private Subsection subsectionObject;
    private Controller controller;
    private Essay essayObject;
    /**
     * Creates new form EssayJPanel
     */
    public EssayPanel(Controller controller) {
        initComponents();
        this.controller = controller;
        
    }
    public void setQuestion(Essay essay) {
        this.essayObject = essay;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEssayAnswer = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        lblMarks1 = new javax.swing.JLabel();
        lblMarks = new javax.swing.JLabel();
        txtMarks = new javax.swing.JTextField();
        lblWordCount = new javax.swing.JLabel();
        txtWordCount = new javax.swing.JTextField();
        btnMark = new javax.swing.JButton();
        labelWordLimit = new javax.swing.JLabel();

        lblTitle.setFont(new java.awt.Font("Snap ITC", 0, 30)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Essay Question");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtEssayAnswer.setColumns(20);
        txtEssayAnswer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEssayAnswer.setLineWrap(true);
        txtEssayAnswer.setRows(5);
        jScrollPane1.setViewportView(txtEssayAnswer);

        jLabel1.setText("Essay Question: ");

        lblMarks1.setFont(new java.awt.Font("MV Boli", 0, 16)); // NOI18N
        lblMarks1.setText("Word Limit:");

        lblMarks.setFont(new java.awt.Font("MV Boli", 0, 16)); // NOI18N
        lblMarks.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMarks.setText("Marks:");
        lblMarks.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        txtMarks.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMarks.setText("             ");
        txtMarks.setMinimumSize(new java.awt.Dimension(60, 25));
        txtMarks.setPreferredSize(new java.awt.Dimension(60, 25));
        txtMarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarksActionPerformed(evt);
            }
        });

        lblWordCount.setFont(new java.awt.Font("MV Boli", 0, 16)); // NOI18N
        lblWordCount.setText("Word Count:");

        txtWordCount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtWordCount.setText("             ");
        txtWordCount.setMinimumSize(new java.awt.Dimension(60, 25));
        txtWordCount.setPreferredSize(new java.awt.Dimension(60, 25));

        btnMark.setText("Mark");

        labelWordLimit.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblWordCount)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtWordCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblMarks1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelWordLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(192, 192, 192)
                        .addComponent(lblMarks)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMark, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarks1)
                    .addComponent(txtMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMarks)
                    .addComponent(labelWordLimit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblWordCount)
                        .addComponent(txtWordCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnMark, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtMarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarksActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMark;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelWordLimit;
    private javax.swing.JLabel lblMarks;
    private javax.swing.JLabel lblMarks1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWordCount;
    private javax.swing.JTextArea txtEssayAnswer;
    private javax.swing.JTextField txtMarks;
    private javax.swing.JTextField txtWordCount;
    // End of variables declaration//GEN-END:variables

    private void preview() {
        txtEssayAnswer.setText(essayObject.getQuestionText());
        labelWordLimit.setText(""+essayObject.getWordLimit());
        //To change body of generated methods, choose Tools | Templates.
    }
}
