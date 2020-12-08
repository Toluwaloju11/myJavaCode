package CodeWithMosh;

import java.awt.*;
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        var inp = new Scanner(System.in);
        int input = 0;
        final float PI = 3.14F;
        while ( input != 1 && input != 2)
        {
            System.out.print("Please Enter '1' for Radius and '2' for Diameter: ");
            input = inp.nextInt();
        }
        if (input == 1){
            System.out.print("What is the Radius: ");
            int radius = inp.nextInt();
            float rArea = PI * (radius * radius);
            System.out.println("The area of the circle is "+ rArea);
        }
        else {
            System.out.print("What is the Diameter: ");
            int diameter = inp.nextInt();
            int radius = diameter / 2;
            float dArea = PI * (radius * radius);
            System.out.println("The area of the circle is " + dArea);
        }
        System.out.println("Thanks for using the application");
}
}
