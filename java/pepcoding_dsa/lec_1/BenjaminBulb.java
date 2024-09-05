package pepcoding_dsa.lec_1;

/*
* The problem is to count the number of bulbs on if N bulbs toggle on N number of voltages, but each voltage only toggle it's multiple
Example Voltage 2 will only toggle bulbs of 2's multiple, Voltage 3 will only toggle multiple of 3 and Voltage N will only toggle the bulb number multiple of N.

So after N voltage toggles' print the bulb which are on.*/

import java.util.Scanner;

public class BenjaminBulb {
    static void benjaminBulb(int n) {
        //inefficient solution
       /* for (int i = 1; i <= n; i++) {
            boolean a = false;
            for (int j = 1; j <= n; j++) {
                if (a == false && i % j == 0) {
                    a = true;
                } else if (a == true && i % j == 0) {
                    a = false;
                }
                if (j == n && a == true) {
                    System.out.println(i);
                   // a = false;
                }
            }
        }*/

        //efficient solution
       for (int i = 1; i * i <= n; i++) {
            System.out.println(i * i);
        }

        //efficient solution 2
        /*for(int i = 1; i <= n; i++){
            int c = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    c++;
                }
            }
            if(c % 2 == 1){
                System.out.println("Sq. root: "+ Math.sqrt(i) + " of " + i);
            }
        }*/
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of bulbs: ");
        int n = sc.nextInt();
        sc.close();
        benjaminBulb(n);
    }
}
