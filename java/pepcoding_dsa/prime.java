package pepcoding_dsa;

import java.util.Scanner;

class prime {
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of primes you want to check: ");
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.print("Enter the number you want to check: ");
            int n = sc.nextInt();
            if (isPrime(n)) {
                System.out.println("The number " + n + " is prime.");
            } else {
                System.out.println("The number " + n + " is not prime.");
            }
            System.out.println("-----------------------------");
        }
        sc.close();
    }
}