package pepcoding_dsa.lec_5;

import java.util.Scanner;
import java.util.Stack; 
import pepcoding_dsa.lec_4.PrintArray;

public class SlidingWindowMaximum {
    static int[] slidingWindowMaximum(int arr[], int k) {
        Stack<Integer> stack = new Stack<>();
        int nge[] = new int[arr.length];
        int[] max = new int[arr.length - k + 1];
        stack.push(arr.length - 1);
        nge[arr.length - 1] = arr.length;
        for (int i = arr.length - 2; i >= 0; i--) {
            while (stack.size() > 0 && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            if (stack.size() == 0) {
                nge[i] = arr.length;
            } else {
                nge[i] = stack.peek();
            }
            stack.push(i);
        }

        for (int i = 0, j = i; i <= arr.length - k; i++) {
            if (j < i) {
                j = i;
            }
            while (nge[j] < i + k) {
                j = nge[j];
            }
            max[i] = arr[j];
        }
        return max;
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
