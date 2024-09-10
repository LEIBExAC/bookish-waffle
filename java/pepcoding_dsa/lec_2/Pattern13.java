package pepcoding_dsa.lec_2;

import java.util.Scanner;

public class Pattern13 {
    static void pattern13(long n) {
        /*
         * for (long i = 0; i < n; i++) {
         * for (long j = 0; j <= i; j++) {
         * System.out.print(fact(i) / (fact(j) * fact(i - j)) + "\t");
         * }
         * System.out.println();
         * }
         */

        // Using the formula nCr = n! / (r! * (n - r)!)
        // iCj+1 = (iCj * (i - j)) / (j + 1)
        for (long i = 0; i < n; i++) {
            long val = 1;
            for (long j = 0; j <= i; j++) {
                System.out.print(val + "\t");
                val = (val * (i - j)) / (j + 1);
            }
            System.out.println();
        }
    }

    /*
     * static long fact(long n) {
     * if (n == 0)
     * return 1;
     * return n * fact(n - 1);
     * }
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        long n = sc.nextLong();
        sc.close();
        pattern13(n);
    }
}

// Output:
/*
 * Enter the number of rows: 5
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 */