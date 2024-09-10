package pepcoding_dsa.lec_2;

import java.util.Scanner;

public class Pattern17 {
    static void pattern17(int n) {
        // Little ovreboard but works
        /*
         * int st = 1;
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= n / 2; j++) {
         * if (i != n / 2 + 1) {
         * System.out.print("\t");
         * }
         * }
         * if (i == n / 2 + 1) {
         * for (int j = 1; j <= n; j++) {
         * System.out.print("*\t");
         * }
         * } else {
         * for (int j = 1; j <= st; j++) {
         * System.out.print("*\t");
         * }
         * }
         * System.out.println();
         * if (i <= n / 2) {
         * st++;
         * } else {
         * st--;
         * }
         * }
         */

        // Optimized
        int st = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n / 2; j++) {
                if (i != n / 2 + 1) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            if (i <= n / 2) {
                st++;
            } else {
                st--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();
        pattern17(n);
    }
}
