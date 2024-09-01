package pepcoding_dsa;

import java.util.Scanner;

public class PrintDigits {
    static void digits(long n){
        System.out.println("Digits are: ");
        if(n == 0){
            System.out.println(n);
            return;
        }
        long count = DigitsCounter.countDigits(n);
        long div = (long)Math.pow(10, count - 1); //Math.pow returns double so typecasted to long
        while(div != 0){
            long q = n / div;
            System.out.println(q);
            n %= div;
            div /= 10;
        }

    }
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        digits(n);
    }
}
