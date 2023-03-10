package lab2;

import javax.swing.*;
import java.awt.*;

public class PracticeExercise_2_21Component extends JComponent
{
    public void paintComponent(Graphics g)
    {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        // Rectangle
        g2.setColor(Color.CYAN);
        Rectangle box = new Rectangle(30, 30, 70, 30);
        g2.fill(box);


        // My name
        g2.setColor(Color.RED);
        g2.drawString("Sofia", 50, 50);
    }
}

