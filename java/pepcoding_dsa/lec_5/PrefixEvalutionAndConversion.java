package pepcoding_dsa.lec_5;

import java.util.Scanner;
import java.util.Stack;

public class PrefixEvalutionAndConversion {
    static int prefixEvalution(String str) {
        Stack<Integer> evalute = new Stack<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                continue;
            }
            if (Character.isDigit(ch)) {
                evalute.push(ch - '0');
            } else {
                int j = evalute.pop();
                int k = evalute.pop();
                evalute.push(solve(j, k, ch));
            }
        }
        return evalute.peek();
    }

    static int solve(int j, int k, char ch) {
        switch (ch) {
            case '+':
                return j + k;
            case '-':
                return j - k;
            case '*':
                return j * k;
            case '/':
                return j / k;
            default:
                return 0;
        }
    }

    static String prefixToInfix(String str) {
        Stack<String> infix = new Stack<>();
        for(int i = str.length() - 1; i >= 0; i--){
            char ch = str.charAt(i);
            if (ch == ' ') {
                continue;
            }
            if (Character.isDigit(ch)) {
                infix.push(ch + "");
            }else{
                String j = infix.pop();
                String k = infix.pop();
                infix.push("(" + j  + ch + k + ")");
            }
        }
        return infix.peek();
    }

    static String prefixToPostfix(String str) {
        Stack<String> postfix = new Stack<>();
        for(int i = str.length() - 1; i >= 0; i--){
            char ch = str.charAt(i);
            if (ch == ' ') {
                continue;
            }
            if (Character.isDigit(ch)) {
                postfix.push(ch + "");
            }else{
                String j = postfix.pop();
                String k = postfix.pop();
                postfix.push(j + k + ch);
            }
        }
        return postfix.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the prefix expression: ");
        String str = sc.nextLine();
        sc.close();
        System.out.println("Evalution: " + prefixEvalution(str));
        System.out.println("Infix: " + prefixToInfix(str));
        System.out.println("Postfix: " + prefixToPostfix(str));
    }
}
