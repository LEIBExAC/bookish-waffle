package pepcoding_dsa.lec_2;

import java.util.Scanner;

class LeftTriangleUpsideDown {
    static void upsideDownLeft(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();
        upsideDownLeft(n);
    }
}