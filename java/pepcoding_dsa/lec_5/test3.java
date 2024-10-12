package pepcoding_dsa.lec_5;

import java.util.Stack;

public class test3 {
        public static int longestValidParentheses(String s) {
        if(s.length() == 0){
            return 0;
        }
        Stack<Character> stack = new Stack<>();
        int count = 0;
        stack.push(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            if(stack.size() > 0 && s.charAt(i) == '('){
                stack.push(s.charAt(i));
            } else if(s.charAt(i) == ')'){
                if(stack.peek() == '('){
                    stack.pop();
                    count = count + 2;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(longestValidParentheses("(()"));
    }
}
