package CodeWithMosh;

public class Operators {
    public static void main(String[] args) {
        int x = 1;
        short y = 2;
        long z = 3;
        long result = x + y + z;
        x += 2;//Augmented or compound assignment operator


//Implicit Casting ***********************************************************************************************************
        //byte > short > int > long > float > double

        double num2 = 1.1;
        int num1 = (int)num2 + 3; // Explicit casting


        String j = "1";
        double num3 = Double.parseDouble(j) + 4.0;//Wrapper class to covert and int to a primitive type
        System.out.println(x);

    }
}
