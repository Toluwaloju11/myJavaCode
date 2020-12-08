package CodeWithMosh;

import java.awt.*;

public class MemoryManagement {
    public static void main(String[] args) {
        int x = 1;
        int y = x;
        x = 2;
        System.out.println(y); //Primitive types are copied by their values




        Point point1 = new Point(1,2);
        Point point2 = point1;
        point1.x = 2;     //Reference types are copied by their references. i.e
        System.out.println(point2);

        //Strings are reference types


    }
}
