package pepcoding_dsa.lec_5;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
    public static int[] stockSpan(int[] arr, int n) {
        Stack<Integer> stack = new Stack<>();
        int []span = new int[arr.length];

        //Misunderstood the question actualy had to find difference of index and not the value itself
        /*stack.push(arr[0]);
        for (int i = 1; i < n; i++) {
            while (stack.size() > 0 && arr[i] >= stack.peek()) {
                stack.pop();
            }
            if (stack.size() == 0) {
                span = i + 1;
            } else {
                span = stack.peek() - arr[i];
            }
            stack.push(arr[i]);
        }*/

        //Fixed version
        span[0] = 1;
        stack.push(0);
        for(int i = 1; i < arr.length; i++){
            while (stack.size() > 0 && arr[i] > arr[stack.peek()]) {
                stack.pop();
            }
            if (stack.size() == 0) {
                span[i] = i + 1;
            }else{
                span[i] = i - stack.peek();
            }

            stack.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n1 = sc.nextInt();
        int arr[] = new int[n1];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n1; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the day whose span to be find: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("The stock span is: " + stockSpan(arr, n));

    }
}
