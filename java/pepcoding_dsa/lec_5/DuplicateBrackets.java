package pepcoding_dsa.lec_5;

import java.util.*;

public class DuplicateBrackets {
    static boolean duplicateBrackets(String str) {
        Stack<Character> stack = new Stack<>();
        /*for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                if (stack.peek() == '(') {
                    return true;
                } else {
                    while (stack.peek() != '(') {
                        stack.pop();
                    }
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }*/
        for(int i = 0; i < str.length(); i++){
            stack.push(str.charAt(i));
            if(stack.peek() == ')'){
                stack.pop();
                int count = 0;
                while(stack.peek() != '('){
                    stack.pop();
                    count++;
                }
                stack.pop();
                if(count == 0){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Expression: ");
        String str = sc.nextLine();
        sc.close();
        System.out.println("The expression has duplicate/needless brackets: " + duplicateBrackets(str));
    }
}
