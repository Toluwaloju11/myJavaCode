package UWL.GradedAssignments;
/*
NAME        : Toluwaloju Abisogun
STUDENT ID  : ‭21352848‬
INSTRUCTOR  : Dr Ikram Rehman
COURSE      : Bsc Cyber Security (Intensive)
MODULE      : Programming
TASK        : Write a Java program to print an American flag on the screen
METHOD USED : I created 3 variables for the 3 different lines included in the flag and also one for the number of lines on the flag.
  I then looped through the first 9 lines using the modular operator to switch between the two star variables
*/
public class PracticalTask1 {

    public static void main(String[] args){
        String str1 =  " * * * * *  =============================";
        String str2 =  "* * * * * * =============================";
        String str3 =  "=========================================";
        int i = 15;
        while (i > 0){
            i--;
            if (i > 5 && i % 2 == 0)
                System.out.println(str2);
            else if (i > 5 && i % 2 == 1)
                System.out.println(str1);
            else
                System.out.println(str3);
        }
    }
}
