package pepcoding_dsa.lec_2;

import java.util.Scanner;

public class Pattern16 {
    static void pattern16(int n) {
        int sp = (2 * n) - 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "\t");
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = i; j >= 1; j--) {
                if (j != n) {
                    System.out.print(j + "\t");
                }

            }
            System.out.println();
            sp -= 2;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();
        pattern16(n);
    }
}
