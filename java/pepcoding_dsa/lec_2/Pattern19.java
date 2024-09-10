package pepcoding_dsa.lec_2;

import java.util.Scanner;

public class Pattern19 {
    static void pattern19(int n) {
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                for (int j = 1; j <= n; j++) {
                    if (j == n || j <= n / 2 + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }
            } else if (i <= n / 2) {
                for (int j = 1; j <= n; j++) {
                    if (j == n || j == n / 2 + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }
            } else if (i == n / 2 + 1) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*\t");
                }
            } else if (i < n) {
                for (int j = 1; j <= n; j++) {
                    if (j == 1 || j == n / 2 + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }
            } else if (i == n) {
                for (int j = 1; j <= n; j++) {
                    if (j >= n / 2 + 1 || j == 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();
        pattern19(n);
    }
}
