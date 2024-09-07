package pepcoding_dsa.lec_2;

import java.util.Scanner;

public class Pattern6 {
    static void pattern6(int n) {
        int sp = 1;
        int st = (n / 2) + 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            for (int k = 1; k <= sp; k++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }

            System.out.println();

            if (i <= (n / 2)) {
                st--;
                sp += 2;
            } else {
                st++;
                sp -= 2;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();
        pattern6(n);
    }
}
