/*
 * Question: Inverse of a number
 * The constraints are: 1 <= n <= 10^9
 * Any number can only have digit for the size of the number(eg. 1234 can have digits 1, 2, 3, 4)
 * The digits of the number are unique and are not repeated
 * The inverse the reverse of index with the number at that index(eg. 1234 -> 4321)
 * Explanation for 53214 -> 51432
 * (From rigth to left)
 * 5 is at 5th index so 5 remains at 5th index
 * 3 is at 4th index so 3rd index will have 4
 * 2 is at 3rd index so 2nd index will have 3
 * 1 is at 2nd index so 1st index will have 2
 * 4 is at 1st index so 4th index will have 1
 */

package pepcoding_dsa;

import java.util.Scanner;

public class Inverse {
    static int inverse(int n) {
        int inv = 0;
        int count = 1;
        while (n != 0) {
            int q = n % 10;
            inv += inv + count * (int) Math.pow(10, q - 1);
            n /= 10;
            count++;
        }
        return inv;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println("Inverse of the number is: " + inverse(n));
    }
}