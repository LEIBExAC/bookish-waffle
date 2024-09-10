package pepcoding_dsa.lec_2;

import java.util.Scanner;

public class Pattern14 {
    static void pattern14(int n){
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Multiplication table of: ");
        int n = sc.nextInt();
        sc.close();
        pattern14(n);
    }
}
