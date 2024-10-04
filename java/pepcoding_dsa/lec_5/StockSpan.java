package pepcoding_dsa.lec_5;

import java.util.Scanner;

public class StockSpan {
    public static int stockSpan(int[] arr) {
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(stockSpan(arr));

    }
}
