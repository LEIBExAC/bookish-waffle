package pepcoding_dsa.lec_5;

import java.util.Scanner;
import java.util.Stack;

public class CelebrityProblem {
    static boolean knows(int a, int b, int arr[][]){
        return arr[a][b] == 1;
    }
    static int celebrityProblem(int arr[][]){
        Stack<Integer> celebrity = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            celebrity.push(i);
        }
        
        while(celebrity.size() > 1){
            int a = celebrity.pop();
            int b = celebrity.pop();
            if(knows(a, b, arr)){
                //if a knows b, then a is not a celebrity
                celebrity.push(b);
            }else{
                //if a does not knows b, then b is not a celebrity
                celebrity.push(a);
            }
        }

        int c = celebrity.pop();
        for(int i = 0; i < arr.length; i++){
            if ((i != c) && (!knows(i, c, arr) || knows(c, i, arr))) {
                return -1;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of matrix: ");
        int n = sc.nextInt();
        System.out.println("Enter the Celebrity matrix: ");
        int arr[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int j = celebrityProblem(arr);
        System.out.println(j != -1? "The celebrity is: " +  celebrityProblem(arr): "No celebrity.");;
    }
}
