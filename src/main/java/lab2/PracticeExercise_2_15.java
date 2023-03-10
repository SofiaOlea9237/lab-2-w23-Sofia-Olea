package lab2;

import java.awt.*;

public class PracticeExercise_2_15 {

    public static void main(String[] args)
    {
        Point small1 = new Point(3,4);
        Point small2 = new Point(-3,-4);

        Double distance = small1.distance(small2);

        System.out.println("The distance between point 1 and point 2 is: "+distance);
        //honestly, idk why it is 10... i thought it was going to be 0
    }
}
