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
            2. Using the doWhile loop, I used the scanner object (NextLine) to get  input from the user and then checked to see if the input value with containsKey method.
            3. Based on the input being in the HashMap, i used the If
*/
package UWL.GradedAssignments;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class shoppingBasket {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int numberOfProducts = 0;
        int quantity;
        String productName;
        double totalAmount = 0;
        Map<String, Double> product = new HashMap<>();
        product.put("cup", 3.20);
        product.put("gin", 1.10);
        product.put("mug", 2.40);
        product.put("oil", 4.40);
        product.put("eggs", 5.40);
        product.put("rice", 3.70);
        System.out.println("The prices of the items are displayed below");
        product.forEach((key, value) -> System.out.println(key + " = " + "£" + value));

        do {
            System.out.print("Please enter item you want to buy (Minimum of 4 items per shopping bag):");
            productName = input.nextLine().toLowerCase();
            if (product.containsKey(productName)) {
                System.out.print("Please enter quantity:");
                quantity = input.nextInt();
                totalAmount += (product.get(productName) * quantity);
                numberOfProducts++;
            }
            else if (productName.equals("quit") && numberOfProducts < 1 ) {
                System.out.println("Your basket is empty. Thanks for shopping with us");
                break;
            }
            else if (productName.equals("quit") ) {
                System.out.println("Thanks for shopping with us. ");
                break;
            }
            else {
                System.out.println(String.format("'%s' not recognised as an item",productName));
            }
        }
        while (true);
        String formattedAmount = NumberFormat.getCurrencyInstance().format(totalAmount);
        System.out.println("The total for your items is " + formattedAmount);
    }
}
