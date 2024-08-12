import java.util.Scanner;

public class nextGreater {

    static int[] arr (int arr[]) {
        int res[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = -1;
            int j = i + 1;
            while (j < arr.length) {
                {
                    if (res[i] < arr[j] && arr[i] < arr[j]) {
                        res[i] = arr[j];
                    }
                    j++;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the array elements");
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int res[] = arr(arr);
        System.out.println("The next greater element for each element in the array is:");
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
