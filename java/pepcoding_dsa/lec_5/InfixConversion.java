package pepcoding_dsa.lec_5;

import java.util.Scanner;
import java.util.Stack;

public class InfixConversion {
    /*
     * static void infixConversion(String str){
     * Stack<Character> operators = new Stack<>();
     * Stack<String> postfix = new Stack<>();
     * Stack<String> prefix = new Stack<>();
     * for(int i = 0; i < str.length(); i++){
     * char ch = str.charAt(i);
     * if (ch == ' ') {
     * continue;
     * }
     * if (ch == '(') {
     * operators.push(ch);
     * }else if (ch == ')') {
     * while (operators.size() > 0 && operators.peek() != '(') {
     * char op = operators.pop();
     * String pov2 = postfix.pop();
     * String pov1 = postfix.pop();
     * postfix.push(pov1 + pov2 + op);
     * 
     * String prev2 = prefix.pop();
     * String prev1 = prefix.pop();
     * prefix.push(op + prev1 + prev2);
     * }
     * operators.pop();
     * }else if (ch == '+' || ch == '-' || ch == '/' || ch == '*') {
     * while (operators.size() > 0 && operators.peek() != '(' &&
     * precedence(operators.peek()) >= precedence(ch)) {
     * char op = operators.pop();
     * String pov2 = postfix.pop();
     * String pov1 = postfix.pop();
     * postfix.push(pov1 + pov2 + op);
     * 
     * String prev2 = prefix.pop();
     * String prev1 = prefix.pop();
     * prefix.push(op + prev1 + prev2);
     * }
     * operators.push(ch);
     * }else{
     * postfix.push(ch + "");
     * prefix.push(ch + "");
     * }
     * }
     * 
     * while (operators.size() > 0) {
     * char op = operators.pop();
     * String pov2 = postfix.pop();
     * String pov1 = postfix.pop();
     * postfix.push(pov1 + pov2 + op);
     * 
     * String prev2 = prefix.pop();
     * String prev1 = prefix.pop();
     * prefix.push(op + prev1 + prev2);
     * }
     * 
     * System.out.println(postfix.peek());
     * System.out.println(prefix.peek());
     * }
     */
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
                    operands.push(op + v1 + v2);
                }
                operators.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                // code
                while (operators.size() > 0 && operators.peek() != '('
                        && precedence(operators.peek()) >= precedence(ch)) {
                    char op = operators.pop();
                    String v2 = operands.pop();
                    String v1 = operands.pop();
                    operands.push(op + v1 + v2);
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
            operands.push(op + v1 + v2);
        }
        if (operands.size() > 0) {
            return operands.peek();
        } else {
            return "";
        }
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
                    operands.push(v1 + v2 + op);
                }
                operators.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                // code
                while (operators.size() > 0 && operators.peek() != '('
                        && precedence(operators.peek()) >= precedence(ch)) {
                    char op = operators.pop();
                    String v2 = operands.pop();
                    String v1 = operands.pop();
                    operands.push(v1 + v2 + op);
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
            operands.push(v1 + v2 + op);
        }
        if (operands.size() > 0) {
            return operands.peek();
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the infix expression: ");
        String str = sc.nextLine();
        sc.close();
        // infixConversion(str);
        System.out.println("Prefix: " + infixToPrefix(str));
        System.out.println("Postfix: " + infixToPostfix(str));
    }
}
