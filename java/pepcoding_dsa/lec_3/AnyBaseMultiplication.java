package pepcoding_dsa.lec_3;

import java.util.Scanner;

public class AnyBaseMultiplication {
    static long anyBaseMultiplication(long num1, long num2, long base) {
        // Whole code has been rewritten
        // Wrong code and did not checked
        /*
         * int a = 1;
         * long mulValue = 0;
         * int c = 0;
         * while (num2 > 0) {
         * long d2 = num2 % 10;
         * num2 /= 10;
         * long carry = 0;
         * long n1 = num1;
         * while (n1 > 0 || carry > 0) {
         * long d1 = n1 % 10;
         * n1 /= 10;
         * long d = (d1 * d2) + carry;
         * carry = d / base;
         * d = d % base;
         * mulValue += d * (long) Math.pow(10, c++);
         * }
         * c = a++;
         * }
         * return mulValue;
         * }
         */

        long mulValue = 0;
        int c = 0;
        while (num2 > 0) {
            long d2 = num2 % 10;
            num2 /= 10;
            long singleProduct = anyBaseMultiplicationSingleDigit(num1, d2, base);
            mulValue = AnyBaseAddition.anyBaseAddition(mulValue, singleProduct * (long) Math.pow(10, c++), base);
        }
        return mulValue;
    }

    static long anyBaseMultiplicationSingleDigit(long num1, long d2, long base) {
        long singleValue = 0;
        long carry = 0;
        int c = 0;
        while (num1 > 0 || carry > 0) {
            long d1 = num1 % 10;
            num1 /= 10;
            long d = (d1 * d2) + carry;
            carry = d / base;
            d %= base;
            singleValue += d * (long) Math.pow(10, c++);
        }
        return singleValue;
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
        System.out.println("Multipliaction of " + num1 + " and " + num2 + " in base " + base + " is "
                + anyBaseMultiplication(num1, num2, base) + ".");
    }
}
