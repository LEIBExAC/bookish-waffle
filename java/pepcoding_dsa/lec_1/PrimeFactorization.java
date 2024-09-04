package pepcoding_dsa.lec_1;

import java.util.Scanner;

public class PrimeFactorization {
    static void primefactors(int n) {
        int a = 2;
        while (n != 1 && a <= Math.sqrt(n)){
            if (n % a == 0) {
                System.out.println(a);
                n /= a;
            } else {
                a++;
            }
        }
        if (n != 1) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        primefactors(n);
    }
}