package pepcoding_dsa.lec_5;

import java.util.Scanner;
public class test {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        /*int[] arr = new int[nums1.length + nums2.length];
        int j = 0;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (j < nums1.length && k < nums2.length) {
                if (nums1[j] < nums2[k]) {
                    arr[i] = nums1[j++];
                } else if (nums2[k] < nums1[j]) {
                    arr[i] = nums2[k++];
                } else {
                    arr[i] = nums1[j++];
                    arr[++i] = nums2[k++];
                }
            } else if (j < nums1.length) {
                arr[i] = nums1[j++];
            } else if (k < nums2.length) {
                arr[i] = nums2[k++];
            }
        }
        double median = 0;
        if (arr.length % 2 == 0) {
            median = (arr[arr.length / 2] + arr[(arr.length / 2) - 1]) / 2.0;
        } else {
            median = arr[arr.length / 2];
        }*/

        int n = nums1.length;
        int m = nums2.length;
        int i = 0, j = 0, m1 = 0, m2 = 0;

        for (int count = 0; count <= (n + m) / 2; count++) {
            m2 = m1;
            if (i != n && j != m) {
                if (nums1[i] > nums2[j]) {
                    m1 = nums2[j++];
                } else {
                    m1 = nums1[i++];
                }
            } else if (i < n) {
                m1 = nums1[i++];
            } else {
                m1 = nums2[j++];
            }
        }
        return (m1 + m2 / 2.0 == 0) ? (m1 + m2) / 2.0 : m1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array 1: ");
        int n1 = sc.nextInt();
        int nums1[] = new int[n1];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of the array 2: ");
        int n2 = sc.nextInt();
        int nums2[] = new int[n2];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }
        sc.close();

        //int []arr1 = {1, 3, 8, 9, 15, 17, 20, 25};
        //int []arr2 = {4, 5, 8, 10, 11, 15, 17, 25};
        System.err.println(findMedianSortedArrays(nums1, nums2));
    }

}
