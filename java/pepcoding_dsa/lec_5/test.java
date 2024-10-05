package pepcoding_dsa.lec_5;

import pepcoding_dsa.lec_4.PrintArray;

public class test {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int j = 0; // nums1
        int k = 0; // nums2
        for (int i = 0; i < arr.length; i++) {
            if (j < nums1.length || k < nums2.length) {
                PrintArray.printArray(arr);
                System.out.println();
                if (j < nums1.length && k < nums2.length && nums1[j] < nums2[k]) {
                    arr[i] = nums1[j++];
                } else if (j < nums1.length && k < nums2.length && nums2[k] < nums1[j]) {
                    arr[i] = nums2[k++];
                } else {
                    if (j < nums1.length && k < nums2.length) {
                        arr[i] = nums1[j++];
                        arr[++i] = nums2[k++];
                    }
                }

                
            }
        }
        PrintArray.printArray(arr);
        return 0;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 5, 6, 7, 7, 9, 12 };
        int[] nums2 = { 2, 3, 4, 5, 8, 10, 15 };
        System.err.println(findMedianSortedArrays(nums1, nums2));
    }

}
