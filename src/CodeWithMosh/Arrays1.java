package CodeWithMosh;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
//        Arrays are used to store list of items.
//        int[] numbers = new int [5];// [] to store the size of the Array
//        numbers[0] = 33;
//        numbers[1] = 24;// Using an index that is bigger than the
//          size of the array generates a Runtime error


        int[] numbers = {2, 2, 5, 6, 33};


        System.out.println(java.util.Arrays.toString(numbers));
//***********************************************************************************************
//Multi Dimensional Arrays

//        int[][] numbers1 = new int [2][3];
//        numbers1[0][0] = 1;
        int[][] numbers1 = {{1,2,3}, {6, 7, 4}};
        System.out.println(java.util.Arrays.deepToString(numbers1));//Multi dimensional Arrays

    }
}
