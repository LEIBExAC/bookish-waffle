package pepcoding_dsa.lec_2;

import java.util.Scanner;

public class Pattern20 {
    static void pattern20(int n) {

        // Method 1
        /*int k = n / 2 + 1;
        int l = k;

        for (int i = 1; i <= n; i++) {
            if (i <= n / 2) {
                for (int j = 1; j <= n; j++) {
                    if (j == 1 || j == n) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }
            } else {
                for (int j = 1; j <= n; j++) {
                    if (j == 1 || j == n || j == k || j == l) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }
                k--;
                l++;
            }
            System.out.println();
        }*/

        // Method 2
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n){
                    System.out.print("*\t");
                } else if (i > n / 2 && ( i == j || i + j == n + 1)) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
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
        pattern20(n);
    }
}
