package pepcoding_dsa.lec_3;

import java.util.Scanner;

public class AnyBaseSubtraction {
    static long anyBaseSubtraction(long num1, long num2, long base) {
        long subValue = 0;
        /*int c = 0;
        int borrow = 0;
        // Taking num2 always bigger
        if (num1 > num2) {
            num2 += num1;
            num1 = num2 - num1;
            num2 = num2 - num1;
        }
        while (num1 > 0 || num2 > 0) {
            long d1 = num1 % 10;
            long d2 = num2 % 10;
            num1 /= 10;
            num2 /= 10;
            if (d2 < d1) {
                borrow = 1;
                d2 += base;
            }
            d2 = d2 - d1;
            subValue += d2 * (long) Math.pow(10, c++);
        }*/
        if (num1 > num2) {
            num2 += num1;
            num1 = num2 - num1;
            num2 = num2 - num1;
        }
        long carry = 0; 
        int c = 0;
        while (num2 > 0) {
            long d2 = (num2 % 10) + carry;
            long d1 = num1 % 10;
            num1 /= 10;
            num2 /= 10;
            long d;
            if (d2 < d1) {
                d = (d2 + base) - d1;
                carry = -1;
            }else{
                d = d2 - d1;
                carry = 0;
            }
            subValue += d * (long) Math.pow(10, c++);
        }
        return subValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        long num1 = sc.nextLong();
        System.out.print("Enter the second number: ");
        long num2 = sc.nextLong();
        System.out.print("Enter the base: ");
        long base = sc.nextLong();
        sc.close();
        System.out.println("Subtraction of " + num1 + " and " + num2 + " in base " + base + " is "
                + anyBaseSubtraction(num1, num2, base) + ".");
    }
}