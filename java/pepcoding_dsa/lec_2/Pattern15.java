package pepcoding_dsa.lec_2;

import java.util.Scanner;

public class Pattern15 {
    static void pattern15(int n) {
        // sp = space, st = stars, row = row number
        // Might be inefficient but it works
        /*int sp = n / 2;
        int st = 1;
        int row = 1;
        for (int i = 1; i <= n; i++) {
            int k = 0;
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print(row + k + "\t");
                if (j <= st / 2) {
                    k++;
                } else {
                    k--;
                }
            }
            System.out.println();
            if (i <= n / 2) {
                sp--;
                st += 2;
                row++;
            } else {
                sp++;
                st -= 2;
                row--;
            }
        }*/

        // Efficient way
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();
        pattern15(n);
    }
}
