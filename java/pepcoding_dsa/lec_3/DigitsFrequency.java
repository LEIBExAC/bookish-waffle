package pepcoding_dsa.lec_3;

import java.util.Scanner;

public class DigitsFrequency {
    static long getDigitFrequency(long n, long d) {
        long count = 0;
        while (n > 0) { 
            if (n % 10 == d) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long n = sc.nextLong();
        System.out.print("Enter the digit to find its frequency: ");
        long d = sc.nextLong();
        sc.close();
        System.out.println(getDigitFrequency(n, d));
    }
}