package pepcoding_dsa.lec_5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/*
 * 1. You are given a number n, representing the number of time intervals.
 * 2. In the next n lines, you are given a pair of space separated numbers.
 * 3. The pair of numbers represent the start time and end time of a meeting
 * (first number is start time and second number is end time)
 * Complete in O(nlogn) time 
 */

public class MergeOverlappingIntervals {
    static void mergeOverlappingIntervals(int arr[][]) {
        /*
         * System.out.println("The array is: ");
         * for (int i = 0; i < arr.length; i++) {
         * System.out.print(arr[i][0] + " ");
         * System.out.println(arr[i][1]);
         * }
         */

        Pair[] pairs = new Pair[arr.length];
        for (int i = 0; i < arr.length; i++) {
            pairs[i] = new Pair(arr[i][0], arr[i][1]);
        }

        Arrays.sort(pairs);
        Stack<Pair> st = new Stack<>();
        for (int i = 0; i < pairs.length; i++) {
            if (i == 0) {
                st.push(pairs[i]);
            } else {
                Pair top = st.peek();
                if (pairs[i].st > top.et) {
                    st.push(pairs[i]);
                } else {
                    top.et = Math.max(top.et, pairs[i].et);
                }
            }
        }

        Stack<Pair> rs = new Stack<>();
        while (st.size() > 0) {
            rs.push(st.pop());
        }
        System.out.println("The merged intervals are: ");
        while (rs.size() > 0) {
            Pair p = rs.pop();
            System.out.println(p.st + " " + p.et);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of time intervals: ");
        int n = sc.nextInt();
        int arr[][] = new int[n][2];
        System.out.println("Enter the time intervals(space seprated): ");
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        sc.close();
        mergeOverlappingIntervals(arr);
    }

    public static class Pair implements Comparable<Pair> {
        int st;
        int et;

        Pair(int st, int et) {
            this.st = st;
            this.et = et;
        }

        // this > other : +ve
        // this = other : 0
        // this < other : -ve
        @Override
        public int compareTo(Pair other) {
            if (this.st != other.st) {
                return this.st - other.st;
            } else {
                return this.et - other.et;
            }
        }
    }
}
