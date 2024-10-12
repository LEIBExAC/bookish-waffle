package pepcoding_dsa.lec_5;

import java.util.Scanner;

public class test2 {
    public static String gcdOfStrings(String str1, String str2) {
        if ((str1 + str2).equals(str2 + str1)) {
            int gcd = gcd(str1.length(), str2.length());
            String str = str1.length() > str2.length() ? str1.substring(0, gcd) : str2.substring(0, gcd);
            return str;
          
        } else {
            return "";
        }
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string 1: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the string 2: ");
        String str2 = sc.nextLine();
        sc.close();
        System.out.print("The String is: " + gcdOfStrings(str1, str2));
    }
}
