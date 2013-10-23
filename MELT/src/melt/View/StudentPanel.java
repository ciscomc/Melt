/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.View;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import melt.Controller;
import melt.Model.Mcq;
import melt.Model.Question;
import melt.Model.Section;
import melt.Model.Subsection;
import melt.Model.Test;
import melt.Model.TestBank;

/**
 *
 * @author mbaxkfx2
 */
public class StudentPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentPanel
     */
    private Controller controller;
    private SingleSectionPanel sectionPanel;
    private int sectionIndex = 1;
    private double score = 0;
    private Test currentTest;
    private JPanel contentPane;
    private final ClockDisplay clock;
    private boolean clockRunning = false;
    
    //private TimerThread timerThread;

    StudentPanel(JPanel panel, Controller controller) {
        initComponents();
        this.controller = controller;
        this.contentPane = panel;
        clock = new ClockDisplay();

        //To change body of generated methods, choose Tools | Templates.
    }

    public void startTest() {
        TestBank model = controller.getTestBank();

        currentTest = model.getTestById(1);
        if (currentTest == null) {
            JOptionPane.showMessageDialog(sectionPanel, "There are no tests in the database");
            CardLayout cardLayout = (CardLayout) contentPane.getLayout();
            cardLayout.show(contentPane, "welcomePanel");
        } else {
            Section firstSection = currentTest.getSectionById(sectionIndex);
            int minutes = (int) firstSection.getTime() % 60;
            int hours = (int) (firstSection.getTime() / 60);
            sectionPanel = new SingleSectionPanel(firstSection);

            clock.setTime(hours, minutes, 0);
            this.start();
            clockRunning = true;
            scrollPane.setViewportView(sectionPanel);
            sectionPanel.showSection();
        }
    }

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void start() {
        clockRunning = true;
        TimerThread timerThread = new TimerThread();
        timerThread.start();
    }

    /**
     *
     */
    private void stop() {
        clockRunning = false;
    }

    /**
     *
     */
    private void step() {
        clock.timeTick();
        jlabelTime.setText(clock.getTime());
    }

    class TimerThread extends Thread {

        public void run() {
            while (clockRunning) {
                step();

                String timeRemaining = clock.getTime();
                if (timeRemaining.equals("00:00:00")) {
                    JOptionPane.showMessageDialog(sectionPanel, "Time out.");
                    
                    NextButton.doClick();
                    this.stop();
                    
                }
                if (timeRemaining.equals("00:00:30")) {
                    jlabelTime.setForeground(Color.red);

                }
                jlabelTime.setVisible(true);
                pause();
            }
        }

        private void pause() {
            try {

                Thread.sleep(50);
                // pause for 300 milliseconds
            } catch (InterruptedException exc) {
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SubmitButton = new javax.swing.JButton();
        jlabelTime = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();

        NextButton.setText("Next");
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });

        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        jlabelTime.setText("Time");

        scrollPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jlabelTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 626, Short.MAX_VALUE)
                .addComponent(NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(SubmitButton))
            .addComponent(scrollPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmitButton)
                    .addComponent(NextButton)
                    .addComponent(jlabelTime)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        jlabelTime.setForeground(Color.BLACK);
        sectionIndex++;
        
        if (currentTest.getSectionById(sectionIndex) == null) {
            sectionPanel.setPanelAnswers();
            JOptionPane.showMessageDialog(sectionPanel, "There are no more sections in the test, the test will now be submitted.");
            SubmitButton.doClick();
            //Thread.currentThread().stop();
        } else {
            sectionPanel.setPanelAnswers();
            sectionPanel = new SingleSectionPanel(currentTest.getSectionById(sectionIndex));
            scrollPane.setViewportView(sectionPanel);
            sectionPanel.showSection();
            int minutes = (int) currentTest.getSectionById(sectionIndex).getTime() % 60;
            int hours = (int) (currentTest.getSectionById(sectionIndex).getTime() / 60);
            clock.setTime(hours, minutes, 0);
            this.start();
            this.revalidate();
        }


    }//GEN-LAST:event_NextButtonActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here:
        double total = 0.0;
        for (Section section : currentTest.getSections()) {
            for (Subsection subsection : section.getSubsections()) {
                for (Question question : subsection.getQuestions()) {
                    Mcq mcqQuestion = (Mcq) question;
                    total += mcqQuestion.getMark();
                    if (mcqQuestion.checkAnswer()) {
                        score = score + mcqQuestion.getMark();
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(sectionPanel, score + " out of " + total);
    }//GEN-LAST:event_SubmitButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private final javax.swing.JButton NextButton = new javax.swing.JButton();
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel jlabelTime;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}
