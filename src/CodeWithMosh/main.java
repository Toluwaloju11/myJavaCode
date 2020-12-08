package CodeWithMosh;

import java.util.Date;

public class main {
    public static void main(String[] args) {
        byte age = 20;
        long viewsCount = 3_123_456_789L; // This is a primitive type
        float price = 10.99f; //Double was too large to to store a price as its 8 bytes
        Date curDate = new Date();//This is a reference Type
        System.out.println(curDate);



        String message =  new String("Hello World");//This proves that Strings are reference types
        System.out.println(message);
    }
}
