package pepcoding_dsa;

import java.util.Scanner;

public class GCDandLCM {
    static int gcd(int a, int b){
        //int gcd = (a * b) / lcm(a, b);
        /*int gcd = 0;
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
            gcd = a + b;
        }*/
        
        //int gcd = b == 0 ? a : gcd(b, a % b);
        while (a % b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
            
        }
        return b;
    }

    static int lcm(int a, int b){
        int lcm = (a * b) / gcd(a, b);
        return lcm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        sc.close();
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm(a, b));
    }
}
