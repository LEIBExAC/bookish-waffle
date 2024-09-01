package pepcoding_dsa;

import java.util.*;

class CodesCollection {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        /*
        * Using Scanner class to take int and String input from user will give some problem
        * int n = sc.nextInt();
        * String str = sc.nextLine();
        * To address this we use Integer.parseInt(sc.nextLine()) to take int input
        */
        int n = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();
        sc.close();
        System.out.println("Hey " + str + ". You entered " + n);
        for (int i = 1; i >= n; i++) {
            System.out.println(i);
        }
    }
}