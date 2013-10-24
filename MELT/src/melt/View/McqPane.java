/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.View;

import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import melt.Controller;
import melt.Model.Mcq;
import melt.Model.Question;
import melt.Model.Subsection;

/**
 *
 * @author Fuhao
 */
public class McqPane extends javax.swing.JPanel {

    private Controller controller;
    private Subsection subsectionObject;
    private TreePanel treePane;
    private Mcq mcqObject;
    private ArrayList<String> questionAnswers;
    private ArrayList<Integer> correctAnswers;
    private String questionText;

    /**
     * Creates new form MCQs
     */
    public McqPane(Controller controller, TreePanel treePane) {
        initComponents();
        this.controller = controller;
        this.treePane = treePane;
        setupComponents();
    }

    public void deleteQuestion() {
        this.controller.deleteQuestion(subsectionObject, mcqObject.getId());
        treePane.removeCurrentNode();
    }

    public void setSubsectionObject(Subsection subsection) {
        this.subsectionObject = subsection;
    }

    private boolean isNumeric(String str) {
        return str.matches("\\d+(\\.\\d+)?");
    }

    public void setQuestion(Mcq mcq) {
        this.mcqObject = mcq;
        preview();
    }

    private void preview() {
        if (mcqObject == null) {
            clear();
        } else {
            clear();
            txtQuestion.setText(mcqObject.getQuestionText());
            ArrayList<String> questionAnswers = mcqObject.getAnswers();
            ArrayList<Integer> correctAnswers = mcqObject.getCorrectAnswers();
            ArrayList<JCheckBox> correctAnswerCheckBoxes = new ArrayList();
            correctAnswerCheckBoxes.add(chkAnswer1);
            correctAnswerCheckBoxes.add(chkAnswer2);
            correctAnswerCheckBoxes.add(chkAnswer3);
            correctAnswerCheckBoxes.add(chkAnswer4);
            correctAnswerCheckBoxes.add(chkAnswer5);
            correctAnswerCheckBoxes.add(chkAnswer6);
            for (int answer : correctAnswers) {
                correctAnswerCheckBoxes.get(answer).setSelected(true);
            }
            ArrayList<JTextField> answerFields = new ArrayList();
            answerFields.add(txtAnswer1);
            answerFields.add(txtAnswer2);
            answerFields.add(txtAnswer3);
            answerFields.add(txtAnswer4);
            answerFields.add(txtAnswer5);
            answerFields.add(txtAnswer6);
            for (String answer : questionAnswers) {
                int answerIndex = questionAnswers.indexOf(answer);
                answerFields.get(answerIndex).setText(answer);

            }

            txtMarks.setText(Double.toString(mcqObject.getMark()));
        }
    }

    private void clear() {
        txtQuestion.setText("");
        txtAnswer1.setText("");
        txtAnswer2.setText("");
        txtAnswer3.setText("");
        txtAnswer4.setText("");
        txtAnswer5.setText("");
        txtAnswer6.setText("");
        txtMarks.setText("");
        chkAnswer1.setSelected(false);
        chkAnswer2.setSelected(false);
        chkAnswer3.setSelected(false);
        chkAnswer4.setSelected(false);
        chkAnswer5.setSelected(false);
        chkAnswer6.setSelected(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtAnswer5 = new javax.swing.JTextField();
        chkAnswer1 = new javax.swing.JCheckBox();
        lblCorrectAnswers = new javax.swing.JLabel();
        lblFillInstructions = new javax.swing.JLabel();
        txtAnswer2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        chkAnswer5 = new javax.swing.JCheckBox();
        txtAnswer3 = new javax.swing.JTextField();
        chkAnswer3 = new javax.swing.JCheckBox();
        btnSave = new javax.swing.JButton();
        txtAnswer1 = new javax.swing.JTextField();
        chkAnswer6 = new javax.swing.JCheckBox();
        txtMarks = new javax.swing.JTextField();
        lblAnswers = new javax.swing.JLabel();
        lblMarks = new javax.swing.JLabel();
        txtAnswer4 = new javax.swing.JTextField();
        chkAnswer4 = new javax.swing.JCheckBox();
        lblTitle = new javax.swing.JLabel();
        txtAnswer6 = new javax.swing.JTextField();
        lblQuestion = new javax.swing.JLabel();
        chkAnswer2 = new javax.swing.JCheckBox();

        setPreferredSize(new java.awt.Dimension(648, 518));

        chkAnswer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAnswer1ActionPerformed(evt);
            }
        });

        lblCorrectAnswers.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        lblCorrectAnswers.setText("Correct Answers");

        lblFillInstructions.setFont(new java.awt.Font("MV Boli", 0, 15)); // NOI18N
        lblFillInstructions.setText("Please Enter the question, list of answers, check the correct ones and give the mark:");
        lblFillInstructions.setToolTipText("");

        txtAnswer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnswer2ActionPerformed(evt);
            }
        });

        txtQuestion.setColumns(20);
        txtQuestion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtQuestion.setLineWrap(true);
        txtQuestion.setRows(5);
        jScrollPane1.setViewportView(txtQuestion);

        chkAnswer3.setToolTipText("");
        chkAnswer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAnswer3ActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("MV Boli", 0, 16)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/melt/View/Icons/save.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.setToolTipText("");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtAnswer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnswer1ActionPerformed(evt);
            }
        });

        chkAnswer6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAnswer6ActionPerformed(evt);
            }
        });

        txtMarks.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMarks.setText("             ");
        txtMarks.setMinimumSize(new java.awt.Dimension(60, 25));
        txtMarks.setPreferredSize(new java.awt.Dimension(60, 25));

        lblAnswers.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        lblAnswers.setText("Fill from 2 to 6 answers:");

        lblMarks.setFont(new java.awt.Font("MV Boli", 0, 16)); // NOI18N
        lblMarks.setText("Marks:");

        lblTitle.setFont(new java.awt.Font("Snap ITC", 0, 30)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Multiple Choice Question");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblQuestion.setFont(new java.awt.Font("MV Boli", 0, 15)); // NOI18N
        lblQuestion.setText("Question:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFillInstructions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAnswer1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAnswer2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtAnswer5, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtAnswer4, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtAnswer3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtAnswer6, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkAnswer1)
                                    .addComponent(chkAnswer3)
                                    .addComponent(chkAnswer4)
                                    .addComponent(chkAnswer2)
                                    .addComponent(chkAnswer5)
                                    .addComponent(chkAnswer6))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblAnswers)
                                            .addGap(302, 302, 302)
                                            .addComponent(lblCorrectAnswers))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtMarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(355, 355, 355)
                                            .addComponent(btnSave))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFillInstructions, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblQuestion)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnswers)
                    .addComponent(lblCorrectAnswers))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtAnswer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAnswer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAnswer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAnswer4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAnswer5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAnswer6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkAnswer1)
                                .addGap(25, 25, 25))
                            .addComponent(chkAnswer2))
                        .addGap(5, 5, 5)
                        .addComponent(chkAnswer3)
                        .addGap(6, 6, 6)
                        .addComponent(chkAnswer4)
                        .addGap(5, 5, 5)
                        .addComponent(chkAnswer5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkAnswer6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMarks)
                        .addComponent(txtMarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSave))
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setupComponents() {
    }

    private boolean isValidInput() {
        questionAnswers = new ArrayList();
        correctAnswers = new ArrayList();

        questionText = txtQuestion.getText();
        ArrayList<JTextField> answerFields = new ArrayList();
        //int questionMark = Integer.parseInt(marksTextField.getText());

        answerFields.add(txtAnswer1);
        answerFields.add(txtAnswer2);
        answerFields.add(txtAnswer3);
        answerFields.add(txtAnswer4);
        answerFields.add(txtAnswer5);
        answerFields.add(txtAnswer6);
        ArrayList<JCheckBox> correctAnswerFields = new ArrayList();
        correctAnswerFields.add(chkAnswer1);
        correctAnswerFields.add(chkAnswer2);
        correctAnswerFields.add(chkAnswer3);
        correctAnswerFields.add(chkAnswer4);
        correctAnswerFields.add(chkAnswer5);
        correctAnswerFields.add(chkAnswer6);
        //read answers, check that at least one answer is provided.
        for (JTextField field : answerFields) {
            if (!field.getText().equals("")) {
                questionAnswers.add(field.getText());
            }
        }

        for (JCheckBox checkBox : correctAnswerFields) {
            if (checkBox.isSelected()) {
                correctAnswers.add(correctAnswerFields.lastIndexOf(checkBox));
            }
        }
        if (questionText.equals("")) {
            JOptionPane.showMessageDialog(this, "Please provide a question text.");
            return false;
        } else if (questionAnswers.size() < 2) {
            JOptionPane.showMessageDialog(this, "Please provide at least two answers.");
            return false;
        } else if (correctAnswers.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide at least one correct answer.");
            return false;
        } else if (txtMarks.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please provide a mark for the question.");
            return false;
        } else if (!isNumeric(txtMarks.getText())) {
            JOptionPane.showMessageDialog(this, "Please provide a valid number in the marks field.");
            return false;
        }

        return true;
    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (isValidInput()) {
            Double questionMark = Double.parseDouble(txtMarks.getText());
            
            if (mcqObject == null) {
                Question question = this.controller.addQuestion(this.subsectionObject, questionAnswers, correctAnswers, questionText, questionMark);
                this.treePane.addQuestionNode(question);
            } else {
                this.controller.updateQuestionDetails(this.mcqObject, questionAnswers, correctAnswers, questionText, questionMark);
            }
            this.controller.updateXmlFile();
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void chkAnswer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAnswer3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAnswer3ActionPerformed

    private void txtAnswer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnswer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnswer1ActionPerformed

    private void txtAnswer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnswer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnswer2ActionPerformed

    private void chkAnswer6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAnswer6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAnswer6ActionPerformed

    private void chkAnswer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAnswer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAnswer1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox chkAnswer1;
    private javax.swing.JCheckBox chkAnswer2;
    private javax.swing.JCheckBox chkAnswer3;
    private javax.swing.JCheckBox chkAnswer4;
    private javax.swing.JCheckBox chkAnswer5;
    private javax.swing.JCheckBox chkAnswer6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAnswers;
    private javax.swing.JLabel lblCorrectAnswers;
    private javax.swing.JLabel lblFillInstructions;
    private javax.swing.JLabel lblMarks;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAnswer1;
    private javax.swing.JTextField txtAnswer2;
    private javax.swing.JTextField txtAnswer3;
    private javax.swing.JTextField txtAnswer4;
    private javax.swing.JTextField txtAnswer5;
    private javax.swing.JTextField txtAnswer6;
    private javax.swing.JTextField txtMarks;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables
}
