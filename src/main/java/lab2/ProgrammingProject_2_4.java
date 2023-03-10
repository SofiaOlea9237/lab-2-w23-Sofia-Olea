package lab2;

import javax.swing.*;
import java.awt.*;

public class ProgrammingProject_2_4 {

    public static void main(String[] args)
    {

        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setTitle("Rectangles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        IntersectionDrawer component = new IntersectionDrawer();
        frame.add(component);

        frame.setVisible(true);
    }

    private static class IntersectionDrawer extends JComponent {
        public void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g; // Cast the Graphics parameter into a Graphics2D object

            Rectangle box1 = new Rectangle(10,10,30,40);
            g2.draw(box1);
            Rectangle box2 = new Rectangle(20,30,40,60);
            g2.draw(box2);

            g2.setColor(Color.CYAN);
            Rectangle box3 = box1.intersection(box2);
            g2.draw(box3);
            g2.fill(box3);
            g2.setColor(Color.BLACK);
            g2.draw(box3);
            //the other rectangles will be empty where box1 and box2 don't meet
            //(you can tell where they will/won't meet with their coordinates)
        }
    }
}
