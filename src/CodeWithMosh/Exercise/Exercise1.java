package CodeWithMosh.Exercise;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number:");
        int number = sc.nextInt();

//        switch (number){
//            case number % 5 == 0:
//                System.out.println("Fizz");
//                break;
//            case number % 3 == 0:
//                System.out.println("Buzz");
//                break;
//            case number % 3 == 0 && number % 5 == 0:
//            System.out.println("Buzz");
//            break;
//            default:
//                System.out.println(number);

//Solution 1
//        if (number % 5 == 0 && number % 3 == 0)
//            System.out.println("FizzBuzz");
//        else if (number % 3 == 0)
//            System.out.println("Buzz");
//        else if (number % 5 == 0)
//            System.out.println("Fizz");
//        else
//            System.out.println(number);
//Solution 2 --The below code is clled nesting and isnt the best way to code
        if (number % 5 == 0){
            if (number % 5 == 0)
                System.out.println("FizzBuzz");
            else
                System.out.println("Fizz");
        }
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);
        }

    }

