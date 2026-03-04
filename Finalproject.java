
package finalproject;

import moddel.QuizModel;
import view.Quizview;
import controller.QuizController;
import javax.swing.SwingUtilities;

public class Finalproject {
 
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(() -> {
            QuizModel model = new QuizModel();
            Quizview view = new Quizview();
            new QuizController(view, model);
            view.setVisible(true);
        });
        
    }
    
}
