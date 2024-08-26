//document.write('<script type="text/javascript" src="https://cdn.mathjax.org/mathjax/latest/MathJax.js?config=TeX-AMS-MML_HTMLorMML"></script>');
/*
 * The whole idea is to merge the two arrays and then find the median of the merged array.
 * but has to do in log(m + n) time complexity.
 * still failed to do so.
 * 
 * The below approach is wrong.
 */

 
import java.util.Scanner;
import java.util.Arrays;

public class medianTwoSortedArrays {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of array 1: ");
            int k = sc.nextInt();
            double arr1[] = new double[k];
            System.out.println("Enter array 1 elements: ");
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = sc.nextDouble();
            }
            Arrays.sort(arr1);

            System.out.print("Enter size of array 2: ");
            int l = sc.nextInt();
            double arr2[] = new double[l];
            System.out.println("Enter array 2 elements: ");
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = sc.nextDouble();
            }
            Arrays.sort(arr2);

            // print
            System.out.println("Array 1:");
            for (double i : arr1) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("Array 2:");
            for (double i : arr2) {
                System.out.print(i + " ");
            }
            System.out.println();

            Median med = new Median();
            double m = med.findMedian(arr1, arr2);
            System.out.print("The median is: " + m);
            System.out.println();

            double temp[] = new double[arr1.length + arr2.length];
            for (int i = 0; i < temp.length; i++) {
                int j = 0;
                while (j < arr1.length) {
                    temp[i] = arr1[j];
                    i++;
                    j++;
                }
                j = 0;
                while (j < arr2.length) {
                    temp[i] = arr2[j];
                    i++;
                    j++;
                }
            }
            System.out.print("Temp array: ");
            Arrays.sort(temp);
            for (double o : temp) {
                System.out.print(o + " ");
            }
            System.out.println();
            if (temp.length % 2 == 0) {
                System.out.println("Med: " + (temp[temp.length / 2 - 1] + temp[temp.length / 2]) / 2);
            } else {
                int size = (int) Math.floor(temp.length / 2);
                System.out.println("Med: " + temp[size]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/**
 * InnermedianTwoSortedArrays
 */
class Median {
    @SuppressWarnings("unused")
    private double findInnerMedian(double[] arr) {
        double k = 0;
        int size = (int) Math.floor((arr.length / 2));
        if (arr.length % 2 == 0) {
            k = ((arr[(arr.length / 2) - 1] + arr[(arr.length / 2)]) / 2);
        } else {
            k = arr[size];
        }
        return k;
    }

    public double findMedian(double[] arr1, double[] arr2) {
        /*double m1 = findInnerMedian(arr1);
        double m2 = findInnerMedian(arr2);
        System.out.println("m1 " + m1);
        System.out.println("m2 " + m2);
        if (arr1.length + arr2.length % 2 == 0) {
            return ((m1 + m2) / 2);
        } else {
            if (m1 > m2) {
                return m1;
            } else {
                return m2;
            }
        }*/

        if ((arr1.length + arr2.length) % 2 == 0) {
            double mid1 = arr1[(arr1.length / 2 - 1)];
            double mid2 = arr2[(arr2.length / 2)];
            System.out.println("mid1: " + mid1);
            System.out.println("mid2: " + mid2);
            return (mid1 + mid2) / 2;
        } else {
            double mid1 = arr1[(arr1.length / 2)];
            double mid2 = arr2[(arr2.length / 2)];
            return Math.min(mid1, mid2);
        }
    }
}
