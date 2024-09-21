package pepcoding_dsa.lec_4;

import java.util.Scanner;

public class IndexofAnElementArray {
    static int indexofAnElementArray(int arr[], int element){
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if (element == arr[i]) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be searched: ");
        int element = sc.nextInt();
        sc.close();
        System.out.println("The index of the element is " + indexofAnElementArray(arr, element));
    }
}
