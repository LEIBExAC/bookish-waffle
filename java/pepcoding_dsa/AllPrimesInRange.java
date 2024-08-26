package pepcoding_dsa;

import java.util.Scanner;

public class AllPrimesInRange {
    static boolean isPrime(int i) {
        if (i == 1) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower limit of the range: ");
        int low = sc.nextInt();

        System.out.print("Enter the upper limit of the range: ");
        int high = sc.nextInt();
        sc.close();
        for (int i = low; i <= high; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
