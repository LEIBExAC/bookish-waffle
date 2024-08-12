package pepcoding_dsa;
import java.util.Scanner;
public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n1 = sc.nextInt();
        System.out.println("Enter another number");
        int n2 = sc.nextInt();
        sc.close();
        if (n1 == n2) {
            System.out.println("Both numbers are equal");
        } else if (n1 > n2) {
            System.out.println(n1 + " is greater than " + n2);
        } else {
            System.out.println(n1 + " is smaller then " + n2);   
        }
    }
}
