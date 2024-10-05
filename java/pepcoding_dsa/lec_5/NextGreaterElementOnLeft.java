package pepcoding_dsa.lec_5;

import java.util.Scanner;
import java.util.Stack;
import pepcoding_dsa.lec_4.PrintArray;

public class NextGreaterElementOnLeft {
    static int[] nextGreaterElementOnLeft(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[arr.length];

        // left to right
       /*  res[0] = -1;
        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            while (stack.size() > 0 && stack.peek() <= arr[i]) {
                stack.pop();
            }

            if (stack.size() == 0) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }

            stack.push(arr[i]);
        }*/ 

        // right to left
        stack.push(arr.length - 1);
        for (int i = arr.length - 2; i >= 0; i--) {
            while (stack.size() > 0 && arr[i] >= arr[stack.peek()]) {
                res[stack.peek()] = arr[i];
                stack.pop();
            }

            stack.push(i);
        }

        while (stack.size() > 0) {
            res[stack.peek()] = -1;
            stack.pop();
        }
        return res;
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
        PrintArray.printArray(nextGreaterElementOnLeft(arr));
    }
}
