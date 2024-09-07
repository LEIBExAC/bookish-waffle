package pepcoding_dsa.lec_2;

import java.util.Scanner;

public class Pattern7 {
    static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < (i - 1); j++) {
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
        pattern7(n);
    }
}
