package pepcoding_dsa.lec_5;

import java.util.Scanner;
import java.util.Stack;

public class LargestAreaHistogram {
    static int largestAreaHistogram(int arr[]) {
        //int area[] = new int[arr.length];
       /* for (int i = arr.length - 1; i >= 0; i--) {

            Stack<Integer> stack = new Stack<>();
            int j = i;
            int k = i;

            if (stack.isEmpty()) {
                stack.push(arr[i]);
            }
            while (--j >= 0 && !(arr[i] > arr[j]) && !(stack.peek() > arr[j])) {
                stack.push(arr[j]);
            }

            while (++k <= arr.length - 1 && !(arr[i] > arr[k]) && !(stack.peek() > arr[k])) {
                stack.push(arr[k]);
            }
            area[i] = stack.size() * arr[i];
        }*/
        int []rb = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(arr.length - 1);
        rb[arr.length - 1] = arr.length;
        for(int i = arr.length - 2; i>=0; i--){
            while (stack.size() > 0 && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }
            if (stack.size() == 0) {
                rb[i] = arr.length;
            } else {
                rb[i] = stack.peek();
            }
            stack.push(i);
        }

        int []lb = new int[arr.length];
        stack = new Stack<>();
        stack.push(0);
        lb[0] = -1;
        for(int i = 1; i < arr.length; i++){
            while (stack.size() > 0 && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }
            if (stack.size() == 0) {
                lb[i] = -1;
            } else {
                lb[i] = stack.peek();
            }
            stack.push(i);
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int area = (rb[i] - lb[i] - 1) * arr[i];
            if (max < area) {
                max = area;
            }
        }
        return max;
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
        sc.close();

        System.out.println("Largest area Histogram is: " + largestAreaHistogram(arr));
    }
}
