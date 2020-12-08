package UWL.GradedAssignments;
/*
NAME      : Tolu Abisogun
Student ID: ‭21352001
Instructor: Dr Ikram Rehman
Course    : Bsc Cyber Security (Intensive)
Module    : Programming
Task      : Write a Java program to print an American flag on the screen
Method    : I created 3 variables for the 3 different lines included in the flag
            I then created a loop for each line
            I then used the modular operator to stagger the first 9 lines due to the number of stars being different in every other line
*/

public class american_Flag {
    public static void main(String[] args){
        String str1 =  "* * * * * * =============================";
        String str2 =  " * * * * *  =============================";
        String str3 =  "=========================================";
       for (int i = 0;i < 15; i++){
           if (i < 9){
               if (i % 2 == 0){
                   System.out.println(str1);
               }else
                   System.out.println(str2);
           }
           else
               System.out.println(str3);
       }
    }
}