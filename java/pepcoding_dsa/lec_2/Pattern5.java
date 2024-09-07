package pepcoding_dsa.lec_2;

import java.util.Scanner;

public class Pattern5 {
    static void pattern5(int n) {
        int nst = 1;
        int nsp = n / 2;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("\t");
            }
            for (int k = 1; k <= nst; k++) {
                System.out.print("*\t");
            }
            System.out.println();
            if (i <= n / 2) {
                nst += 2;
                nsp--;
            } else {
                nst -= 2;
                nsp++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();
        pattern5(n);
    }
}
