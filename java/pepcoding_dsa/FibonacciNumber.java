package pepcoding_dsa;

import java.util.Scanner;

public class FibonacciNumber {
    static void fibonacci(int i) {
        int a = 0, b = 1, c = 0;
        for (int j = 0; j < i; j++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        fibonacci(n);
        /*
         * for(int i = 0; i <= n; i++){
         * System.out.println(fibonacci(i));
         * }
         */

    }
}
