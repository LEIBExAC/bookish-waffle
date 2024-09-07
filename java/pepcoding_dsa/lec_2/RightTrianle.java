package pepcoding_dsa.lec_2;

import java.util.Scanner;

public class RightTrianle {
    static void rightPattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= i-1; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();
        rightPattern(n);
    }
}
