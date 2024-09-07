package pepcoding_dsa.lec_2;

import java.util.Scanner;

public class Pattern8 {
    static void pattern8(int n) {
        /*
         * for(int i = 1; i <= n; i++){
         * for(int j = n; j > i; j--){
         * System.out.print("\t");
         * }
         * System.out.println("*");
         * }
         */

        /*
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= n; j++) {
         * if (j + i == n + 1) {
         * System.out.print("*\t");
         * } else {
         * System.out.print("\t");
         * }
         * }
         * System.out.println();
         * }
         */

        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("\t");
            }
            System.out.println("*");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();
        pattern8(n);
    }
}
