package pepcoding_dsa;

import java.util.Scanner;

/**
 * PythagoreanTriplet
 */
public class PythagoreanTriplet {

    static boolean isPythagoreanTriplet(int a, int b, int c){
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        System.out.println("The numbers " + a + ", " + b + " and " + c + " are " + (isPythagoreanTriplet(a, b, c) ? "" : "not ") + "Pythagorean Triplet.");
    }
}