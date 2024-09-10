package pepcoding_dsa.lec_2;

import java.util.Scanner;

public class Pattern18 {
    static void pattern18(int n) {
        // Way 1
        /*
         * int st = n;
         * int sp = 0;
         * int sp2 = n - 4;
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= sp; j++) {
         * System.out.print("\t");
         * }
         * if (i <= n / 2 && i != 1) {
         * System.out.print("*\t");
         * for (int j = 1; j <= sp2; j++) {
         * System.out.print("\t");
         * }
         * sp2 -= 2;
         * System.out.print("*\t");
         * } else {
         * for (int j = 1; j <= st; j++) {
         * System.out.print("*\t");
         * }
         * }
         * System.out.println();
         * if (i <= n / 2) {
         * sp++;
         * st -= 2;
         * } else {
         * sp--;
         * st += 2;
         * }
         * }
         */

        // Way 2
        int sp = 0;
        int st = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                if (i > 1 && i <= n / 2 && j > 1 && j < st) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }
            System.out.println();
            if (i <= n / 2) {
                sp++;
                st -= 2;
            } else {
                sp--;
                st += 2;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();
        pattern18(n);
    }
}