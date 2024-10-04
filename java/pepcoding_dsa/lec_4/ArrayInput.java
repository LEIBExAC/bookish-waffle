package pepcoding_dsa.lec_4;

import java.util.Scanner;
/**
 * ArrayInput
 */
public class ArrayInput {
    static int[] input(){ 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array 1: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Enter elements of first array: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        sc.close();
        return arr1;
    }

    public static void main(String[] args) {
        System.out.println(input()); //Prints 1st elements address
    }
}