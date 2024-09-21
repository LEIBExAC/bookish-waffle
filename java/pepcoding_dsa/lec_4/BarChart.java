package pepcoding_dsa.lec_4;

import java.util.Scanner;

public class BarChart {
    static void barChart(int arr[]) {
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        barChart(arr);
    }
}
