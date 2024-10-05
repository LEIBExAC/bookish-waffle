package pepcoding_dsa.lec_5;

import java.util.Scanner;
import java.util.Stack;

import pepcoding_dsa.lec_4.PrintArray;

public class LargestAreaHistogram {
    static int largestAreaHistogram(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int[] area = new int[arr.length];
        stack.push(arr[arr.length - 1]);
        for (int i = arr.length - 2; i >= 0; i--) {
            int count = 1;
            int j = i;
            int k = i;

            while ((--j >= 0 && arr[j] >= stack.peek()) || (arr[k] >= stack.peek() && (++k) < arr.length)) {
                PrintArray.printArray(area);
                System.out.println(" " + i + " " + j + " " + k);
                if (j >= 0) {
                    stack.push(arr[j]);
                    count++;
                }
                if (k < arr.length) {
                    stack.push(arr[k]);
                    count++;
                }
            }
            stack.pop();
            stack.push(arr[i]);
            area[i + 1] = count * arr[i + 1];
            System.out.println(" i " + i);
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < area.length; i++) {
            if (max < area[i]) {
                max = area[i];
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
