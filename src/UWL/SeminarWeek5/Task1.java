package UWL.SeminarWeek5;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Please eater the chinese year:");
        int year = scanner.nextInt();

        switch (year){
            case 1 :
                System.out.println("Year of the monkey");
                break;
            case 2:
                System.out.println("Year of the Rooster");
                break;
            case 3:
                System.out.println("Year of the Dog");
                break;
            case 4:
                System.out.println("Year of the Rat");
                break;
            case 5:
                System.out.println("Year of the Ox");
                break;
            case 6:
                System.out.println("Year of the Tiger");
                break;
            case 7:
                System.out.println("Year of the Rabbit");
                break;
            case 8:
                System.out.println("Year of the Dragon");
                break;
            case 9:
                System.out.println("Year of the Snake");
                break;
            case 10:
                System.out.println("Year of the Horse");
                break;
            case 11:
                System.out.println("Year of the Sheep");
                break;
            case 12:
                System.out.println("Year of the Deer");
                break;
            default:
                System.out.println("I dont know the year");
                
        }
    }
}
