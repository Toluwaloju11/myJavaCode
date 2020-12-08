package UWL.GradedAssignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OnlineStore {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int numberOfProducts = 0;
        int quantity = 0;
        String productName = null;
        String quitMessage = "";
        double totalAmount = 0;
        Map<String, Double> product = new HashMap<>();
        product.put("cup", 2.21);
        product.put("gin", 1.13);
        product.put("mug", 2.41);
        product.put("oil", 2.43);
        product.put("eggs", 2.43);
        while ( numberOfProducts <= product.size() ) {
            System.out.println("Total amount: " + totalAmount);
            System.out.println("Total items: " + numberOfProducts);
            System.out.print("Please enter item you want to buy (Minimum of 4 items per shopping bag): ");
            productName = input.next().toLowerCase();
            if(productName.equals("cup")|| productName.equals("gin")|| productName.equals("mug")||productName.equals("oil")||productName.equals("eggs") ){//should only enter is correct
                System.out.print("Please enter quantity: ");
                quantity = input.nextInt();
                totalAmount += (product.get(productName) * quantity);
                numberOfProducts++;
            }
            else if (productName.equals("quit") && numberOfProducts < 1) {
                System.out.print("You cant quit while you have less than 4 items. ");
            }
            else if (productName.equals("quit")){//Ash
                System.out.print("Thank you. ");
                break;
            }
            else {
                System.out.print("Item not recognised. ");
            }
        }
    }
}
