package CodeWithMosh;

import java.util.Scanner;

public class ForLoopWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
////      While loop **********************************************
//        for (int i = 0; i < 10; i++)
//            System.out.println("Hello world ");
//      While loop **********************************************
//        int p = 0;
//        while (p < 10){
//            System.out.println("Hello world "+ p);
//            p++;
//    }
//      While loop **********************************************
//   While loops are useful in situations when we don't know ahead
//   of time how many times we want to repeat something
        String input = "";
        while (true){
            System.out.print("Enter number: ");
            input = scanner.next().toLowerCase() ;
            if (!input.equals("pass"))
                continue;
            if (!input.equals("quit") || !input.equals("stop"))
                System.out.println(input);
        }
//
//        do?

        }
    }

