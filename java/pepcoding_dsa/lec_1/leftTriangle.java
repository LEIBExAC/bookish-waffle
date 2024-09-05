package pepcoding_dsa.lec_1;

import java.util.Scanner;

public class leftTriangle {
    static void leftPattern(int n) {
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("1st Method Left Triangle");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.err.println();
        System.out.println("2nd Method");
        System.out.println("*\n**\n***\n****\n*****");
        System.err.println();
        System.out.println("3rd Method");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();
        leftPattern(n);
    }
}
