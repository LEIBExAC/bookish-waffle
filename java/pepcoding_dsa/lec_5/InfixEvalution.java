package pepcoding_dsa.lec_5;

import java.util.Scanner;
import java.util.Stack;

public class InfixEvalution {
    static int infixEvalution(String str) {
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();
        int ans = 0;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(') {
                // push
                operands.push(ch - '0');
            } else if(ch == ')') {
                // pop and solve
                while(operators.size() > 0 && operators.peek() != '(') {
                    char op = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();
                    int ans1 = solve(v1, v2, op);
                    operands.push(ans1);
                }
                operators.pop();
            } else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                // push
                operators.push(ch); 
            } else {
                // push
                operands.push(ch - '0');
            }
        }
        while(operators.size() > 0) {
            char op = operators.pop();
            int v2 = operands.pop();
            int v1 = operands.pop();
            int ans1 = solve(v1, v2, op);
            operands.push(ans1);
        }
        ans = operands.pop();

        System.out.println(operands);
        System.out.println(operators);
        return ans;
    }

    static int precedence(char ch) {
        if(ch == '+' || ch == '-') {
            return 1;
        } else {
            return 2;
        }
    }

    static int solve(int v1, int v2, char ch){
        if(ch == '+') {
            return v1 + v2;
        } else if(ch == '-') {
            return v1 - v2;
        } else if(ch == '*') {
            return v1 * v2;
        } else {
            return v1 / v2;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the infix expression: ");
        String str = sc.nextLine();
        sc.close();
        System.out.println("The evaluted answer is: " + infixEvalution(str));
    }
}
