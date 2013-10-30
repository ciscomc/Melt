/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.View.marker;

import java.awt.Color;
import java.awt.Component;
import javax.swing.AbstractListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import melt.Controller;
import melt.Model.Essay;
import melt.Model.Fibq;
import melt.Model.FibqSingleBlank;
import melt.Model.Mcq;
import melt.Model.Subsection;
import melt.View.BlanksMatcher;

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
    private MarkerTreePanel markerTreePanelFibq;
    private MarkerPanel markerPanel;
    private String isMarked;


    /**
     * Creates new form FibqPanel
     */
    public FibqPanel(Controller controller, MarkerPanel markerPanel) {
        this.controller = controller;
        // this.markerTreePanelFibq=markerTreePanelFibq;
        initComponents();
        this.markerPanel = markerPanel;
        ScrollPaneCorrectAnswer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ScrollPaneStudentAnswer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

    }

    public void setQuestion(Fibq fibq) {

        this.fibqObject = fibq;

        final FibqSingleBlank[] arrayOfCorrectAnswers = new FibqSingleBlank[fibqObject.getCorrectAnswers().size()];
        final String[] arrayOfStudentAnswers = new String[arrayOfCorrectAnswers.length];
        for (int i = 0; i < fibqObject.getCorrectAnswers().size(); i++) {
            arrayOfCorrectAnswers[i] = fibqObject.getCorrectAnswers().get(i);
            arrayOfStudentAnswers[i] = fibqObject.getCorrectAnswers().get(i).getStudentAnswer();
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

        listStudentAnswers.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!listStudentAnswers.isSelectionEmpty()) {
                    int answerIndex = listStudentAnswers.getSelectedIndex();
                    FibqSingleBlank blank = (FibqSingleBlank) listModelOfCorrectAnswer.getElementAt(answerIndex);
                    double mark = blank.getMark();
                    double studentMark = blank.getStudentMarkForBlank();
                    lblblankMarks.setText("Blank Mark: " + Double.toString(mark));
                    txtStudentBlankMark.setText("" + studentMark);
                    lblStudentFullMark.setText("Student Full Mark: " + Double.toString(fibqObject.getStudentMark()) );
                    /*if (studentMark != -1) {
                        //lblFullMarks.setText("Full Mark: " + Double.toString(fibqObject.getMark()) + "  This blank has been marked!");
                        txtStudentBlankMark.setText("" + studentMark);
                    } else {
                        //lblFullMarks.setText("Full Mark: " + Double.toString(fibqObject.getMark()));
                        txtStudentBlankMark.setText("");
                    }*/

                }
            }
        });

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

        this.listCorrectAnswers.setSelectedIndex(0);
        this.listStudentAnswers.setSelectedIndex(0);
        preview();
    }

    public void setSubsectionObject(Subsection subsection) {
        this.subsectionObject = subsection;
    }

    private boolean isNumeric(String str) {
        return (str.matches("\\d+(\\.\\d+)?") && (Double.valueOf(str) >= 0));
    }

    private void preview() {

        clear();

        String questionText = "";
        //Get a BlanksMatcher object for the question text with _ as delimiter
        BlanksMatcher blanksMatcher = new BlanksMatcher(this.fibqObject.getQuestionText(), '_');
        String[] questionWithoutBlanks = blanksMatcher.getMatches();
        int numOfBlanks = blanksMatcher.getNumOfDelimiters();

        //check if there is a blank at the beginning of the question
        int blanksCounter = 0;
        if (blanksMatcher.isFirstChar()) {
            questionText = " _________ ";
            blanksCounter++;
        }

        //add the questions text followed by blanks, except if there is no more blanks
        for (int i = 0; i < questionWithoutBlanks.length; i++) {
            questionText += questionWithoutBlanks[i];
            if (blanksCounter < numOfBlanks) {
                questionText += " _________ ";
                blanksCounter++;
            }
        }

        //Just to make sure there is no blanks left!!
        for (blanksCounter = blanksCounter; blanksCounter < numOfBlanks; blanksCounter++) {
            questionText += " _________ ";
        }


        lblQuestionText.setText(questionText);
        lblQuestionText.setFont(new java.awt.Font("MV Boli", 0, 16));

        lblFullMarks.setText("Full Mark: " + Double.toString(fibqObject.getMark()));
        lblStudentFullMark.setText("Student Full Mark: " + Double.toString(fibqObject.getStudentMark()));

        FibqSingleBlank blankToMark = (FibqSingleBlank) listModelOfCorrectAnswer.getElementAt(0);
        lblblankMarks.setText("Blank Mark: " + blankToMark.getMark());
        double studentMark = blankToMark.getStudentMarkForBlank();
        txtStudentBlankMark.setText("" + studentMark);
        
        /*if (studentMark != -1) {
            txtStudentBlankMark.setText("" + studentMark);
        } else {
            txtStudentBlankMark.setText("");
        }*/

        if (fibqObject.isAutoMarked()) {
            btnMark.setEnabled(false);
            //txtStudentBlankMark.setText("");
            txtStudentBlankMark.setEnabled(false);
            correctAnswersLbl.setVisible(true);
            listCorrectAnswers.setVisible(true);
            ScrollPaneCorrectAnswer.setEnabled(true);
        } else {
            btnMark.setEnabled(true);
            correctAnswersLbl.setVisible(true);
            listCorrectAnswers.setVisible(true);
            ScrollPaneCorrectAnswer.setEnabled(false);
            txtStudentBlankMark.setEnabled(true);
        }

    }

    private void clear() {
        lblQuestionText.setText("");
        lblFullMarks.setText("Full Mark");
        lblStudentBlankMark.setText("Student Blank Mark:");
        lblStudentFullMark.setText("Student Full Mark:");
        lblblankMarks.setText("Blank Mark:");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScrollPaneStudentAnswer = new javax.swing.JScrollPane();
        listStudentAnswers = new javax.swing.JList();
        lblQuestionText = new javax.swing.JLabel();
        correctAnswersLbl = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        ScrollPaneCorrectAnswer = new javax.swing.JScrollPane();
        listCorrectAnswers = new javax.swing.JList();
        lblFullMarks = new javax.swing.JLabel();
        lblblankMarks = new javax.swing.JLabel();
        txtStudentBlankMark = new javax.swing.JTextField();
        btnMark = new javax.swing.JButton();
        lblStudentAnswers = new javax.swing.JLabel();
        lblStudentFullMark = new javax.swing.JLabel();
        lblStudentBlankMark = new javax.swing.JLabel();

        listStudentAnswers.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        ScrollPaneStudentAnswer.setViewportView(listStudentAnswers);

        lblQuestionText.setText("Question:");

        correctAnswersLbl.setText("Correct Answers:");

        lblTitle.setFont(new java.awt.Font("Snap ITC", 0, 30)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Fill in the Blank Question");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        listCorrectAnswers.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        ScrollPaneCorrectAnswer.setViewportView(listCorrectAnswers);

        lblFullMarks.setText("Full marks : ");

        lblblankMarks.setText("Blank marks :");

        txtStudentBlankMark.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtStudentBlankMark.setText("             ");

        btnMark.setText("Mark");
        btnMark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarkActionPerformed(evt);
            }
        });

        lblStudentAnswers.setText("Student Answers:");

        lblStudentFullMark.setFont(new java.awt.Font("DejaVu Sans", 0, 13)); // NOI18N
        lblStudentFullMark.setText("Sudent Full Marks:");

        lblStudentBlankMark.setText("Student Blank Mark:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblblankMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFullMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblQuestionText, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(382, 382, 382)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblStudentFullMark, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblStudentBlankMark)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtStudentBlankMark, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(btnMark, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(33, 33, 33))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblStudentAnswers, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ScrollPaneStudentAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(correctAnswersLbl)
                                        .addGap(244, 244, 244))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(ScrollPaneCorrectAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())))))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ScrollPaneCorrectAnswer, ScrollPaneStudentAnswer});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblFullMarks, lblStudentFullMark, lblblankMarks});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(4, 4, 4)
                .addComponent(lblQuestionText, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(correctAnswersLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ScrollPaneCorrectAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblStudentAnswers, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ScrollPaneStudentAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStudentBlankMark, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMark, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStudentBlankMark, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblblankMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFullMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStudentFullMark))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ScrollPaneCorrectAnswer, ScrollPaneStudentAnswer});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblFullMarks, lblStudentFullMark, lblblankMarks});

    }// </editor-fold>//GEN-END:initComponents

    private void btnMarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarkActionPerformed
        // TODO add your handling code here:
       
        if (txtStudentBlankMark.getText() != null && isNumeric(txtStudentBlankMark.getText())) {
            double blankMark = Double.parseDouble(txtStudentBlankMark.getText());

            int selectedAnswerIndex = listStudentAnswers.getSelectedIndex();
            FibqSingleBlank blankToMark = this.fibqObject.getCorrectAnswers().get(selectedAnswerIndex);
            if (blankMark > blankToMark.getMark()) {
                JOptionPane.showMessageDialog(this, "The mark for a blank must be equal or less to the full marks of a blank");
                txtStudentBlankMark.setText("");
                return;
            }
            blankToMark.setStudentMarkForBlank(Double.parseDouble(txtStudentBlankMark.getText()));
            lblStudentFullMark.setText("Student Full Mark: " + Double.toString(fibqObject.getStudentMark()) );
            /*double studentMark = blankToMark.getStudentMarkForBlank();
            if (studentMark != -1) {
                lblStudentFullMark.setText("Student Full Mark: " + Double.toString(fibqObject.getStudentMark()) );
            } else {
                lblStudentFullMark.setText("Student Full Mark: " + Double.toString(fibqObject.getStudentMark()) );
            }*/
            controller.updateStudentFile();
         
	   
        } else {
            JOptionPane.showMessageDialog(this, "Please enter a mark for the blank. Mark must be a non negative number.");
            return;
        }
    }//GEN-LAST:event_btnMarkActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPaneCorrectAnswer;
    private javax.swing.JScrollPane ScrollPaneStudentAnswer;
    private javax.swing.JButton btnMark;
    private javax.swing.JLabel correctAnswersLbl;
    private javax.swing.JLabel lblFullMarks;
    private javax.swing.JLabel lblQuestionText;
    private javax.swing.JLabel lblStudentAnswers;
    private javax.swing.JLabel lblStudentBlankMark;
    private javax.swing.JLabel lblStudentFullMark;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblblankMarks;
    private javax.swing.JList listCorrectAnswers;
    private javax.swing.JList listStudentAnswers;
    private javax.swing.JTextField txtStudentBlankMark;
    // End of variables declaration//GEN-END:variables
}
