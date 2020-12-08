package BettyFisher;
import java.util.Scanner;

//.equals to be used for String variables
//If Statement
public class Deciesions {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age");
        int age = sc.nextInt();
        if (age < 2){
            System.out.println("Infant");}
        else if (age < 12){
            System.out.println("Child");
            }
        else if (age < 20){
            System.out.println("Teenager");
        }
        else if (age < 65){
            System.out.println("Adult");
        }
        else{
            System.out.println("Senior");
        }
        }
    }

