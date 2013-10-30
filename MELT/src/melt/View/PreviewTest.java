/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package melt.View;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import melt.Controller;
import melt.Model.Essay;
import melt.Model.Fibq;
import melt.Model.Mcq;
import melt.Model.Section;
import melt.Model.Subsection;
import melt.Model.Test;

/**
 *
 * @author Maria
 */
public class PreviewTest extends JFrame {

    private Controller controller;
    private int i;
    private JPanel listContainer;
    private JFrame frame = new JFrame("Preview");

    public PreviewTest(Controller controller) {
        this.controller = controller;
        initUI();
    }

    private void initUI() {
        listContainer = new JPanel();

        listContainer.setLayout(new BoxLayout(listContainer, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(listContainer);
        scrollPane.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        frame.add(scrollPane, BorderLayout.CENTER);
        final JPanel newPanel = new JPanel();
        JLabel lblTitle = new JLabel("Preview Mode");
        lblTitle.setFont(new java.awt.Font("Snap ITC", 1, 30));
        newPanel.add(lblTitle);
        listContainer.add(newPanel);
        listContainer.revalidate();
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    public void previewTest(Test test) {
        for (Section sec : test.getSections()) {
            previewSection(sec);
        }
    }

    public void previewSection(Section sec) {

        SingleSectionPanel sectionPanel = new SingleSectionPanel(sec);
        sectionPanel.showSection();
        listContainer.add(sectionPanel);
        listContainer.revalidate();
    }

    public void previewSubsection(Subsection sub) {
        SingleSectionPanel sectionPanel = new SingleSectionPanel();
        sectionPanel.showSubsection(sub);
        listContainer.add(sectionPanel);
        listContainer.revalidate();
    }

    @SuppressWarnings("SillyAssignment")
    public void previewQuestion(Mcq mcq) {
        SingleQuestionPanel mcqPanel = new SingleQuestionPanel(mcq);
        JPanel panelforShowing = mcqPanel.showQuestion(10);
        listContainer.add(panelforShowing);
        listContainer.revalidate();
    }

    public void previewQuestion(Fibq fibq) {
        SingleFibqQuestionPanel fibqPanel = new SingleFibqQuestionPanel(fibq);
        JPanel panelforShowing = fibqPanel.showQuestion();
        listContainer.add(panelforShowing);
        listContainer.revalidate();
    }

    public void previewQuestion(Essay essayObject) {
        SingleEssayQuestionPanel essayPanel = new SingleEssayQuestionPanel(essayObject, 10);
        JPanel panelforShowing = essayPanel.showQuestion();
        listContainer.add(panelforShowing);
        listContainer.revalidate();
    }
}
