package pepcoding_dsa;

import java.util.Scanner;

public class PrintRevNumber {
    static void revNumber(long n) {
        System.out.println("Reverse number is:");
        while (n != 0) {
            long q = n % 10;
            System.out.println(q);
            n /= 10;
        }
    }

    static int reversedNumber(int n){
        int rev = 0;
        while(n != 0){
            int q = n % 10;
            rev = rev * 10 + q;
            n /= 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println("1. Print reverse number line by line");
        System.out.println("2. Return reverse number in a single integer");
        System.out.print("Choose the way to print reverse number: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.print("Enter a number: ");
            long n = sc.nextLong();
            sc.close();
            revNumber(n);
        } else if (choice == 2) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            sc.close();
            System.out.println("Reverse number is: " + reversedNumber(n));
        } else {
            System.out.println("Invalid choice");
        }

    }
}
