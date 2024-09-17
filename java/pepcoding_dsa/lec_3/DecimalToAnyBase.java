package pepcoding_dsa.lec_3;

import java.util.Scanner;

public class DecimalToAnyBase {
    static long decimalToAnyBase(long num, long base) {
        long newNum = 0;
        long c = 0;
        while (num > 0) {
            newNum = newNum + (((long) Math.pow(10, c++)) * (num % base));
            num /= base;
        }
        return newNum;
    }
    
    public static void main(String aargs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal base Number: ");
        long n = sc.nextLong();
        System.out.print("Print the base to be converted to: ");
        long b = sc.nextLong();
        sc.close();
        System.out.println("The decimal number " + n + " in base " + b + " is " + decimalToAnyBase(n, b) + ".");
    }
}
