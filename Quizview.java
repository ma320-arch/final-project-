
package view;

import javax.swing.*;
import java.awt.*;

public class Quizview extends JFrame {
    
    public JLabel questionLabel = new JLabel();
    public JRadioButton[] options = new JRadioButton[4];
    public ButtonGroup optionsGroup = new ButtonGroup();
    public JButton submitButton = new JButton("إرسال الإجابة");
    public JButton nextButton = new JButton("السؤال التالي");
    public JTextArea feedbackArea = new JTextArea(5, 20);

    public Quizview() {
        setTitle("نظام الاختبارات التفاعلية");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));

        for (int i = 0; i < 4; i++) {
            options[i] = new JRadioButton();
            optionsGroup.add(options[i]);
            centerPanel.add(options[i]);
        }

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(submitButton);
        buttonPanel.add(nextButton);
        nextButton.setEnabled(false);

        add(feedbackArea, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }
}
