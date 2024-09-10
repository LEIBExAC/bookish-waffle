package pepcoding_dsa.lec_2;

import java.util.Scanner;

public class Pattern12 {
    static void pattern12(long n) {
        long a = 0, b = 1, c = 0;
        for (long i = 1; i <= n; i++) {
            for (long j = 1; j <= i; j++) {
                System.out.print(a + "\t");
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        long n = sc.nextLong();
        sc.close();
        pattern12(n);
    }
}

// Output:
/*
 * Enter the number of rows: 5
 * 0
 * 1 1
 * 2 3 5
 * 8 13 21 34
 * 55 89 144 233 377
 */