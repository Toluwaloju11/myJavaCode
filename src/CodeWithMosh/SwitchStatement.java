package CodeWithMosh;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Whats your role: ");
        String role = sc.nextLine().toLowerCase();

        switch (role) {
            case "admin":
                System.out.println("You're admin");
                break;
            case "moderator":
                System.out.println("You're Moderator");
                break;
            default:
                System.out.println("You're a guest");
        }
    }
}
