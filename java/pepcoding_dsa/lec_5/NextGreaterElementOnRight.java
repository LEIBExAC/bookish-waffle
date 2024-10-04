package pepcoding_dsa.lec_5;

import java.util.Scanner;
import java.util.Stack;
import pepcoding_dsa.lec_4.PrintArray;

public class NextGreaterElementOnRight {
    static int[] nextGreaterElementOnRight(int[] arr) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] res = new int[arr.length];
        // Some how works but not perfectly
        stack.push(0);
        for(int i = 1; i < arr.length; i++){
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

        // Main approach
        /*
         * The approach is to push the array in reverse order in stack, for last print
         * -1, and push it in stack
         * now for n-1th element check if any element is smaller than the current
         * element in stack if yes then pop those
         * element till bigger element then current element found, now push the current
         * element in stack too,
         * if pop 'ed all elements of stack and no bigger element found for current
         * element of stack than print -1.
         */

        /*stack.push(arr[arr.length - 1]);
        res[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {// - a + (pop, answer, push)

            // pop
            while (stack.size() > 0 && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // answer
            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }

            // push
            stack.push(arr[i]);
        }*/
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
        PrintArray.printArray(nextGreaterElementOnRight(arr));
    }
}
