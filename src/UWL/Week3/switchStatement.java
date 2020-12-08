package UWL.Week3;

import java.util.Scanner;
public class switchStatement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name");
        String name = sc.next();

        switch (name.toLowerCase()){
            case "tolu":
            case "tammy":
                System.out.println("Welcome " + name);
                break;
            case "Clare":
                System.out.println("Youre not welcome " + name);
                break;
            default:
                System.out.println("We dont know u");
                break;
        }
    }
}
