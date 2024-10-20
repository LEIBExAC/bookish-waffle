package pepcoding_dsa.lec_5;

import java.util.Scanner;
import java.util.Stack;

public class InfixConversion {
    static String infixToPrefix(String str) {
        Stack<Character> operators = new Stack<>();
        Stack<String> operands = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                // code
                operators.push(ch);
            } else if (ch == ')') {
                // code
                while (operators.size() > 0 && operators.peek() != '(') {
                    char op = operators.pop();
                    String v2 = operands.pop();
                    String v1 = operands.pop();
                    String ans = solvePrefix(v1, v2, op);
                    operands.push(ans);
                }
                operators.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                // code
                while (operators.size() > 0 && operators.peek() != '('
                        && precedence(operators.peek()) >= precedence(ch)) {
                    char op = operators.pop();
                    String v2 = operands.pop();
                    String v1 = operands.pop();
                    String ans = solvePrefix(v1, v2, op);
                    operands.push(ans);
                }
                operators.push(ch);
            } else {
                // code
                operands.push(ch + "");
            }
        }
        while (operators.size() > 0) {
            char op = operators.pop();
            String v2 = operands.pop();
            String v1 = operands.pop();
            String ans = solvePrefix(v1, v2, op);
            operands.push(ans);
        }
        if (operands.size() > 0) {
            return operands.peek();
        } else {
            return "";
        }
    }

    static String solvePrefix(String v1, String v2, char op) {
        return op + v1 + v2;
    }

    static int precedence(char ch) {
        if (ch == '+' || ch == '-') {
            return 1;
        } else {
            return 2;
        }
    }

    static String infixToPostfix(String str) {
        Stack<Character> operators = new Stack<>();
        Stack<String> operands = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                // code
                operators.push(ch);
            } else if (ch == ')') {
                // code
                while (operators.size() > 0 && operators.peek() != '(') {
                    char op = operators.pop();
                    String v2 = operands.pop();
                    String v1 = operands.pop();
                    String ans = solvePostfix(v1, v2, op);
                    operands.push(ans);
                }
                operators.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                // code
                while (operators.size() > 0 && operators.peek() != '('
                        && precedence(operators.peek()) >= precedence(ch)) {
                    char op = operators.pop();
                    String v2 = operands.pop();
                    String v1 = operands.pop();
                    String ans = solvePostfix(v1, v2, op);
                    operands.push(ans);
                }
                operators.push(ch);
            } else {
                // code
                operands.push(ch + "");
            }
        }
        while (operators.size() > 0) {
            char op = operators.pop();
            String v2 = operands.pop();
            String v1 = operands.pop();
            String ans = solvePostfix(v1, v2, op);
            operands.push(ans);
        }
        if (operands.size() > 0) {
            return operands.peek();
        }
        return "";
    }

    static String solvePostfix(String v1, String v2, char op) {
        return v1 + v2 + op;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the infix expression: ");
        String str = sc.nextLine();
        sc.close();
        System.out.println("Prefix: " + infixToPrefix(str));
        System.out.println("Postfix: " + infixToPostfix(str));
    }
}
