package pepcoding_dsa.lec_5;

import java.util.Scanner;
import java.util.Stack;

public class SmallestNumberPattern {
    public static String smallestNumberPattern(String str) {
        String sb = "";
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i <= str.length(); i++){
            stack.push(i + 1);
            if (i == str.length() || str.charAt(i) == 'i') {
                while (!stack.isEmpty()) {
                    sb += stack.pop();
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the pattern: ");
        String str = sc.next();
        sc.close();
        System.out.print("Smallest Number Pattern: " + smallestNumberPattern(str));
    }
}
