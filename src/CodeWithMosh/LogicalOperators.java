package CodeWithMosh;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ***********************************************************************************
//        boolean hasHighIncome = true;
//        boolean hasGoodCredit = true;
//        boolean hasCriminalRecord = false;
//        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
//        ***********************************************************************************

        System.out.print("What is your income :");
        int income = sc.nextInt();
        boolean hasHighIncome = (income > 100_000);
        System.out.println(hasHighIncome);
//      The above code can be used rather than writing an if statement

//        ***********************************************************************************

//        int income = 7_000;
//        String className = "Economy";
//        if (income >= 100_000)
//            className = "First";
//        System.out.println(className);
//        ***********************************************************************************

//        TERNARY OPERATOR
//        int income = 7_000;
        System.out.print("What is your income? :");
        int income1 = sc.nextInt();
        String className = income1 > 100_000 ? "First" : "Economy";
        System.out.println(className);


    }
}
