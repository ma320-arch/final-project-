
package controller;

import moddel.QuizModel;
import view.Quizview;
import java.awt.Color;
public class QuizController {
    
    private Quizview view;
    private QuizModel model;

    public QuizController(Quizview view, QuizModel model) {
        this.view = view;
        this.model = model;

        // إعداد البيانات الأولية في الواجهة
        this.view.questionLabel.setText(model.getQuestion());
        String[] opts = model.getOptions();
        for (int i = 0; i < 4; i++) {
            view.options[i].setText(opts[i]);
        }

        // ربط الأزرار بالأحداث
        this.view.submitButton.addActionListener(e -> handleSubmit());
        this.view.nextButton.addActionListener(e -> handleNext());
    }

    private void handleSubmit() {
        String selected = "";
        if (view.options[0].isSelected()) {
            selected = "A";
        } else if (view.options[1].isSelected()) {
            selected = "B";
        } else if (view.options[2].isSelected()) {
            selected = "C";
        } else if (view.options[3].isSelected()) {
            selected = "D";
        }

        if (model.checkAnswer(selected)) {
            view.feedbackArea.setText("إجابة صحيحة! النتيجة: " + model.getScore());
            view.feedbackArea.setForeground(Color.GREEN);
        } else {
            view.feedbackArea.setText("إجابة خاطئة. الإجابة الصحيحة هي: ب");
            view.feedbackArea.setForeground(Color.RED);
        }
        view.submitButton.setEnabled(false);
        view.nextButton.setEnabled(true);
    }

    private void handleNext() {
        view.feedbackArea.setText("انتقل للسؤال التالي...");
        view.feedbackArea.setForeground(Color.BLACK);
        view.submitButton.setEnabled(true);
        view.nextButton.setEnabled(false);
        view.optionsGroup.clearSelection();
    }

}
