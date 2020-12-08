package UWL;
public class Session2 {

    public static void main(String[] args) {
//        long l = 10000;
//        int i = (int) l;
//        System.out.println(i);

//        float f = 3.14f;
//        int i = (int)f;
//
//        long l = 123456789;
//        int i = (int)l;
//        System.out.println(i);
//
//        int num1 = 2;
//        int num2 = 3;
//
//        System.out.println(num2 += num1); //Augmented Assignment

        int x = 10;
        int y = x++;  //10 is assigned to y before the one is added
//        int y = ++x;  //The value of 1 is added before the compiler gets to x. Y = 11
        System.out.println(x);
        System.out.println(y);
    }
}
