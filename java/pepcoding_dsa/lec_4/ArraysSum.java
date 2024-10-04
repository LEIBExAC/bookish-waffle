package pepcoding_dsa.lec_4;

import java.util.Scanner;

public class ArraysSum {
    static void sum(int arr1[], int arr2[]) {
        int[] sum = new int[arr1.length > arr2.length ? arr1.length: arr2.length];
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;
        int c = 0;
        while (k >= 0) {
            int d = c;
            if (i >= 0) {
                d += arr1[i];
            }
            if (j >= 0) {
                d += arr2[j];
            }

            c = d / 10;
            d %= 10;

            //if (k == 0 && c > 0) {
                //sum[k] = c;
            //} else {
                sum[k] = d;
            //}

            i--;
            j--;
            k--;
        }

        System.out.println("Sum of two arrays: ");
        if (c > 0) {
            System.out.print(c + " ");
        }
        for (int l = 0; l < sum.length; l++) {
            System.out.print(sum[l] + " ");
        }

        // I misunderstood the question, I thought we have to add the elements of the
        // same index of two arrays.
        /*
         * int maxArr = arr1.length > arr2.length ? arr1.length : arr2.length;
         * int arr3[] = new int[maxArr];
         * int j = 0;
         * for (int i = 0; i < maxArr; i++) {
         * if (arr1.length == arr2.length) {
         * arr3[i] = arr1[i] + arr2[i];
         * continue;
         * }
         * if (arr1.length > arr2.length && i < maxArr - arr2.length) {
         * arr3[i] = arr1[i];
         * } else if (arr2.length > arr1.length && i < maxArr - arr1.length) {
         * arr3[i] = arr2[i];
         * } else {
         * arr3[i] = arr1.length > arr2.length ? arr1[i] + arr2[j++] : arr1[j++] +
         * arr2[i];
         * }
         * }
         */
        //return sum;
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

        sum(arr1, arr2);
        //PrintArray.printArray(sum(arr1, arr2));
    }
}
