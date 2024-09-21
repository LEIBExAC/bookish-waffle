package pepcoding_dsa.lec_3;

import java.util.Scanner;

//Using long for larger values
public class AnyBaseToAnyBase {
    static long anyBaseToAnyBase(long num, long base1, long base2) {
       // long conNum = 0;
        //My way
      /* int c = 0;
        while (num > 0) {
            conNum += ((num % base2) * ((int) Math.pow(base1, c++)));
            num /= base2;
        }
      */

      
      //Lectures way
      //1st convert to Decimal
      //2nd then decimal to the given base
        long toDecimal = AnyBaseToDecimal.anyBaseToDecimal(num, base1);
        long conNum = DecimalToAnyBase.decimalToAnyBase(toDecimal, base2);
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
        System.out.println("The number " + num + " of base " + base1 + " after converting to base of " + base2
                + " is " + anyBaseToAnyBase(num, base1, base2) + ".");
    }
}