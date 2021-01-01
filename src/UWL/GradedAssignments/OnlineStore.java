/*
NAME      : Toluwaloju Abisogun
Student ID: ‭21352001
Instructor: Dr Ikram Rehman
Course    : Bsc Cyber Security (Intensive)
Module    : Programming
Task      : Write a Java program to simulate an online store. The program should begin by displaying a list of products
            and their prices. There should be a minimum of 4 products offered.
            The program should ask the user to choose a product and then ask the user to enter the quantity they
            require of that product. The program should then allow the user to keep choosing more products and
            quantities until they enter something to indicate they want to end the program (e.g. a given number or ‘q’
            or ‘exit’). The program should then tell the user the total amount for the products they have selected.

Method    : 1. I used HashMap to create a Key Value pair as (Key = itemName and Value = price) and then printed it out
            2. Using the While loop, I used the scanner object (NextLine) to get  input from the user and then used the containsKey to see availability of stock.
            3. I then prompted the user to enter quantity using nextInt if the item was available. Then prompted the user to enter item again if item entered wasn't available
*/
package UWL.GradedAssignments;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OnlineStore {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int numberOfProducts = 0;
        double totalAmount = 0;
        Map<String, Double> product = new HashMap<>();
        product.put("jam", 2.21);
        product.put("bread", 1.13);
        product.put("mug", 2.41);
        product.put("milk", 2.43);
        product.put("eggs", 2.43);
        product.put("rice", 3.70);
        System.out.println("The prices of the items are displayed below. Please enter 'quit' when shopping is completed");
        product.forEach((key, value) -> System.out.println(key + " = " + "£" + value));

        while (true) {
            if(numberOfProducts < 1) {
                System.out.println();
                System.out.print("Please enter an item from the list above: ");
            }
            else
                System.out.print("Please enter another item: or enter 'quit' to proceed to checkout: ");
            String productName = input.next().toLowerCase();
            if(product.containsKey(productName) ){
                System.out.print("Please enter quantity: ");
                int quantity = input.nextInt();
                totalAmount += (product.get(productName) * quantity);
                numberOfProducts++;
                String formattedAmount = NumberFormat.getCurrencyInstance().format(totalAmount);
                System.out.println("Current shopping total is " + formattedAmount);
            }
            else if (productName.equals("quit") && numberOfProducts < 1) {
                System.out.print("Your basket is empty. Thanks for shopping with us");
                break;
            }
            else if (productName.equals("quit")){
                System.out.println("Thanks for shopping with us. ");
                break;
            }
            else{
                System.out.print("Item not recognised! ");
            }
        }
        String formattedAmount = NumberFormat.getCurrencyInstance().format(totalAmount);
        System.out.println("Your shopping total is " + formattedAmount);
    }
}
