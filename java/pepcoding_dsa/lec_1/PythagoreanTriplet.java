package pepcoding_dsa.lec_1;

import java.util.Scanner;

/**
 * PythagoreanTriplet
 */
public class PythagoreanTriplet {

    static boolean isPythagoreanTriplet(int a, int b, int c){
        System.out.println("a: " + a + ", b: " + b + ", c: " + c);
        System.out.println( a * a + b * b + " == " + c * c + " : " + (a * a + b * b == c * c));
        System.out.println( a * a + c * c + " == " + b * b + " : " + (a * a + c * c == b * b));
        System.out.println( b * b + c * c + " == " + a * a + " : " + (b * b + c * c == a * a));
        int max = a;
        if (b >= max) {
            max = b;
            return max * max == c * c + a * a;
        }
        if (c >= max) {
            max = c;
            return max * max == b * b + a * a;
        }
        return max * max == b * b + c * c;
    //return a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a;

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