package pepcoding_dsa;

import java.util.Scanner;

public class RotateNumber {
    static int rotate(int n, int k){
        int rev = 0;
        int count = (int)DigitsCounter.countDigits(n);
        k = k % count;
        System.out.println("k: " + k);
        if(k < 0){
            k += count;
            System.out.println("k: " + k);
        }
        int div = (int)Math.pow(10, k);
        System.out.println("div: " + div);
        int mul = (int)Math.pow(10, count - k);
        System.out.println("mul: " + mul);
        int q = n / div;
        System.out.println("q: " + q);
        int rem = n % div;
        System.out.println("rem: " + rem);
        rev = rem * mul + q;
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be rotated: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of rotations: ");
        int k = sc.nextInt();
        sc.close();
        System.out.println("Rotated number is: " + rotate(n, k));
    }
}
