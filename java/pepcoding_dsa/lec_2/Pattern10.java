package pepcoding_dsa.lec_2;

import java.util.Scanner;

public class Pattern10 {
    static void pattern10(int n) {
        // inefficient way
        /*
         * int sp1 = n / 2;
         * int sp2 = -1;
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= sp1; j++) {
         * System.out.print("\t");
         * }
         * System.out.print("*\t");
         * for (int j = 1; j <= sp2; j++) {
         * System.out.print("\t");
         * }
         * if(i != 1 && i != n){
         * System.out.print("*\t");}
         * System.out.println();
         * if (i <= n / 2) {
         * sp1--;
         * sp2 += 2;
         * } else {
         * sp1++;
         * sp2 -= 2;
         * }
         * }
         */

        // efficient way
        int sp1 = n / 2;
        int sp2 = -1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp1; j++) {
                System.out.print("\t");
            }
            System.out.print("*\t");
            for (int j = 1; j <= sp2; j++) {
                System.out.print("\t");
            }
            if (1 < i && i < n) {
                System.out.print("*\t");
            }
            System.out.println();
            if (i <= n / 2) {
                sp1--;
                sp2 += 2;
            } else {
                sp1++;
                sp2 -= 2;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();
        pattern10(n);
    }
}
