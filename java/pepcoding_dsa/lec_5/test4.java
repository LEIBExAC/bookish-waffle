package pepcoding_dsa.lec_5;

import java.util.Scanner;
import java.util.Stack;

import pepcoding_dsa.lec_4.PrintArray;

public class test4 {
    static int[] slidingWindowMaximum(int arr[], int k) {
        Stack<Integer> stack = new Stack<>();
        int nge[] = new int[arr.length - k + 1];
        int m = arr.length - k;

        for (int i = arr.length - 1; i >= 0; i--) {
            while (stack.size() > 0 && arr[i] >= arr[stack.peek()]) {
                stack.pop();
            }
            if (i <= arr.length - k) {
                nge[i] = arr[stack.size() == 0 ? i : stack.peek()];
            }
            stack.push(i);
        }

        for (int i = 0; i <= m; i++) {
            nge[i] = arr[stack.peek()];
            if (stack.peek() == i) {
                stack.pop();
            }
        }

        return nge;
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
        System.out.print("Enter the Window size: ");
        int k = sc.nextInt();
        sc.close();
        PrintArray.printArray(slidingWindowMaximum(arr, k));
    }
}