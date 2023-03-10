package lab2;

import javax.swing.*;

public class PracticeExercise_2_21Viewer {

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setTitle("My name");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PracticeExercise_2_21Component component = new PracticeExercise_2_21Component();
        frame.add(component);

        frame.setVisible(true);
    }
}
