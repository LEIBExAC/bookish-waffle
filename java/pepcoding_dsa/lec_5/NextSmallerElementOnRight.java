package pepcoding_dsa.lec_5;

import java.util.Scanner;
import java.util.Stack;
import pepcoding_dsa.lec_4.PrintArray;

public class NextSmallerElementOnRight {
    static int[] nextSmallerElementOnRight(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[arr.length];

        // From left to right traverse
        /*stack.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (stack.size() > 0 && arr[i] <= arr[stack.peek()]) {
                res[stack.peek()] = arr[i];
                stack.pop();
            }
            stack.push(i);
        }

        while (stack.size() > 0) {
            res[stack.peek()] = -1;
            stack.pop();
        }*/

        // From right to left traverse
        res[arr.length - 1] = -1;
        stack.push(arr[arr.length - 1]);
        for(int i = arr.length - 2; i >= 0; i--){
            while (stack.size() > 0 && arr[i] <= stack.peek()) {
                stack.pop();
            }
            if (stack.size() == 0) {
                res[i] = -1;
            }else{
                res[i] = stack.peek();
            }
            stack.push(arr[i]);
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
        PrintArray.printArray(nextSmallerElementOnRight(arr));
    }
}
