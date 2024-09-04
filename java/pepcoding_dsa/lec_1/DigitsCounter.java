package pepcoding_dsa.lec_1;

import java.util.Scanner;

//Using long for longer values
public class DigitsCounter {
    static long countDigits(long n) {
        long count = 0;
        while(n != 0){
            n /= 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long n = sc.nextLong();
        sc.close();
        System.out.println("The number of digits in " + n + " are " + countDigits(n) + ".");
    }
}
