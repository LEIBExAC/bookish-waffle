package pepcoding_dsa.lec_3;

import java.util.Scanner;

public class AnyBaseToDecimal {
    static long anyBaseToDecimal(long num, long base){
        int decimalNum = 0;
        int c = 0;
        while (num > 0) {
            decimalNum += ((num % 10) * ((long) Math.pow(base, c++)));
            num /= 10;
        }
        return decimalNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long num = sc.nextLong();
        System.out.print("Enter the base of number: ");
        long base = sc.nextLong();
        sc.close();
        System.out.println("The decimal representation of " + num + " of base " + base + " is " + anyBaseToDecimal(num, base) + ".");
    }
}
