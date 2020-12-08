package BettyFisher;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
System.out.println("*********************************>   METHOD 1   <********************************************");
        Scanner inp = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Choose an item from the list below");
            System.out.println("__________________________________");
            System.out.println("1. Hot dog");
            System.out.println("2. Hamburger");
            System.out.println("3. Cheeseburger");
            System.out.println("4. Veggie Burger");
            System.out.println("5. Nachos");
            choice = inp.nextInt();
        }while (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5);
        switch (choice){

            case 1:
                System.out.println("You chose hot dog");
                break;
            case 2:
                System.out.println("You chose a hamburger");
                break;
            case 3:
                System.out.println("You chose a Cheeseburger");
                break;
            case 4:
                System.out.println("You chose a vergie burger");
                break;
            case 5:
                System.out.println("You chose a Nachos");
                break;
            default:
                System.out.println("Have a good day");
                break;
        }
System.out.println("*********************************>   METHOD 2   <********************************************");
        double loanBalance = 5000;
        int months = 0;
        while (loanBalance > 0)
        {
            loanBalance -= 500;
            months ++;
        }
        System.out.println(months);

    }
}
