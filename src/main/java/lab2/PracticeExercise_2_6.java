package lab2;

import javax.swing.*;
import java.awt.Rectangle;

public class PracticeExercise_2_6
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(5, 10, 20, 30);
        System.out.println("Before adding: " + box);

        box.add(0, 0);
        System.out.println("After adding: " + box);

        System.out.println("Expected location: (0, 0)");
        System.out.println("Actual location: (" + box.x + ", " + box.y + ")");
        System.out.println("Expected width: 25");
        System.out.println("Actual width: " + box.width);
        System.out.println("Expected height: 40");
        System.out.println("Actual height: " + box.height);
    }
}

