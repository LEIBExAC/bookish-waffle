package pepcoding_dsa;

//import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciNumber {
    static void fibonacci(long i) {
        long a = 0, b = 1, c = 0;
        for (long j = 0; j < i; j++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long n = sc.nextLong();
        sc.close();
        fibonacci(n);
        /*
         * for(long i = 0; i <= n; i++){
         * System.out.println(fibonacci(i));
         * }
         */

    }
}
