package pepcoding_dsa.lec_3;

import java.util.Scanner;

//Using long for longer values
public class AnyBaseToAnyBase {
    static long anyBaseToAnyBase(long num, long base1, long base2) {
        long conNum = 0;
        int c = 0;
        while(num > 0){
            num += ((num % base2) * ((int)Math.pow(base1, c++)));
            num /= base2;
        }
        return conNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be converted: ");
        long num = sc.nextLong();
System.out.print("Enter the base of the given number: ");
long base1 = sc.nextLong();
System.out.print("Enter the base in which to be converted: ");
long base2 = sc.nextLong();
        sc.close();
        System.out.println("The number after converting base of" + num + " of base " + base1 + " to base "+ base2 + " is " + anyBaseToAnyBase(num, base1, base2) + ".");
    }
}