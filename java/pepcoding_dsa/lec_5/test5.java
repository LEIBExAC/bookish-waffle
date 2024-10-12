package pepcoding_dsa.lec_5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

import pepcoding_dsa.lec_4.PrintArray;

public class test5 {

    static long solve(int[] arr, int n, int k) {
        Arrays.sort(arr);
        long s1 = 0;
        long s2 = 0;
        k = k <= arr.length / 2 ? k : arr.length - k;
        for (int i = 0; i < arr.length; i++) {
            if (i < k) {
                s1 += arr[i];
            } else {
                s2 += arr[i];
            }
        }
        return Math.abs(s1 - s2);
    }

    static ArrayList<Integer> nextGreatest(int arr[]) {
        // code here
        ArrayList<Integer> arr1 = new ArrayList<>();
        int greaterElement = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr1.add(0, greaterElement);
            greaterElement = Math.max(greaterElement, arr[i]);
        }
        return arr1;
    }

    static boolean check_elements(int arr[], int n, int A, int B) {
        for(int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) >= A && Math.abs(arr[i]) <= B) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 9, 2, 9, 3, 6, 5, 3, 7, 8, 1, 2, 9, 2, 9, 9, 6, 4, 3, 10, 10, 8, 9, 10, 3, 5, 9, 3, 4, 4, 5, 5,
                6, 10, 5, 2, 5, 6, 8, 4, 5, 5, 7, 4 };
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        // System.out.println(solve(arr, arr.length, 3));
        // System.out.println(nextGreatest(arr));
        System.out.println(check_elements(arr, arr.length, 5, 7));
        PrintArray.printArray(arr);
    }
}
