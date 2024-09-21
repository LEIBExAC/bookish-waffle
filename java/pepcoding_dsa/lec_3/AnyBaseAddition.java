package pepcoding_dsa.lec_3;

import java.util.Scanner;

public class AnyBaseAddition {
    static long anyBaseAddition(long num1, long num2, long base) {
        // 1st way to convert to Decimal add then convert back
        /*
         * long n1 = AnyBaseToDecimal.anyBaseToDecimal(num1, base);
         * long n2 = AnyBaseToDecimal.anyBaseToDecimal(num2, base);
         * return DecimalToAnyBase.decimalToAnyBase(n1 + n2, base);
         */

        // 2nd way is to go a little hard on Problem
        // Optimization Required --> Now optimized
        long conNum = 0;
        int c = 0;
        int carry = 0;
        while (num1 > 0 || 0 < num2 || carry > 0) {
            long tempSum = 0;
            tempSum = carry == 1 ? (num1 % 10) + (num2 % 10) + 1 : (num1 % 10) + (num2 % 10);
            if (tempSum >= base) {
                conNum += (tempSum % base) * (long) Math.pow(10, c++);
                carry = 1;
            } else {
                conNum += (tempSum) * (long) Math.pow(10, c++);
                carry = 0;
            }
            num1 /= 10;
            num2 /= 10;
        }

        //3rd way a little optimized one
        /*long conNum = 0;
        long carry = 0;
        long power = 1;
        while (num1 > 0 || num2 > 0 || c > 0) {
            long d1 = num1 % 10;
            long d2 = num2 % 10;
            num1 /= 10;
            num2 /= 10;
            long d = d1 + d2 + carry;
            carry = d / base;
            d = d % base;
            conNum += d * power;
            power *= 10;
        }*/
        return conNum;
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
        System.out.println("Addition of " + num1 + " and " + num2 + " in base " + base + " is "
                + anyBaseAddition(num1, num2, base) + ".");
    }
}
