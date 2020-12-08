package CodeWithMosh;

import java.text.NumberFormat;

public class Maths {

    public static void main(String[] args) {

        String currency = NumberFormat.getCurrencyInstance().format(12334.34);
        String percent = NumberFormat.getPercentInstance().format(.94);
        System.out.println(currency);
        System.out.println(percent);



    }
}
