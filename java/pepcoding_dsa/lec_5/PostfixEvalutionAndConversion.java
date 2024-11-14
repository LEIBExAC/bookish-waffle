package pepcoding_dsa.lec_5;

import java.util.Scanner;
import java.util.Stack;

public class PostfixEvalutionAndConversion {
    static int postfixEvalution(String str) {
        Stack<Integer> evalute = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ')
                continue;
            if (Character.isDigit(ch)) {
                evalute.push(ch - '0');
            } else {
                int k = evalute.pop();
                int j = evalute.pop();
                evalute.push(solve(j, k, ch));
            }
        }
        return evalute.peek();
    }

    static int solve(int i, int j, char c) {
        switch (c) {
            case '+':
                return i + j;
            case '-':
                return i - j;
            case '*':
                return i * j;
            case '/':
                return i / j;
            default:
                return 0;
        }
    }

    static String postfixToInfix(String str) {
        Stack<String> infix = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch == ' ')
                continue;{
            }
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                String k = infix.pop();
                String j = infix.pop();
                infix.push("(" + j + ch + k + ")");
            } else {
                infix.push(ch + "");
            }
        }
        return infix.peek();
    }

    static String postfixToPrefix(String str) {
        Stack<String> prefix = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch == ' ') {
                continue;
            }
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                String k = prefix.pop();
                String j = prefix.pop();
                prefix.push(ch + j + k);
            } else {
                prefix.push(ch + "");
            }
        }
        return prefix.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the postfix expression: ");
        String str = sc.nextLine();
        sc.close();
        System.out.println("Evalution: " + postfixEvalution(str));
        System.out.println("Infix: " + postfixToInfix(str));
        System.out.println("Prefix: " + postfixToPrefix(str));
    }
}
