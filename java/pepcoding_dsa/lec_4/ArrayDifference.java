package pepcoding_dsa.lec_4;

import java.util.Scanner;

public class ArrayDifference {
    static void arrayDifference(int arr1[], int arr2[]) {
        int[] diff = new int[arr2.length];
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = diff.length - 1;
        int c = 0;

        while (k >= 0) {
            int d = 0;
            int arr1v = i >= 0 ? arr1[i] : 0;
            if (arr2[j] + c >= arr1v) {
                d = arr2[j] + c - arr1v;
                c = 0;
            } else {
                d = arr2[j] + c + 10 - arr1v;
                c = -1;
            }

            diff[k] = d;
            i--;
            j--;
            k--;
        }

        int idx = 0;
        while (diff[idx] == 0 && idx < diff.length) {
            idx++;
        }

        while (idx < diff.length) {
            System.out.print(diff[idx] + " ");
            idx++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array 1: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Enter elements of first array: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of array 2: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.print("Enter elements of second array: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        sc.close();
        arrayDifference(arr1, arr2);
    }
}
