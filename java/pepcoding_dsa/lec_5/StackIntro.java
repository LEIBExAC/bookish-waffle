package pepcoding_dsa.lec_5;

import java.util.Stack;

public class StackIntro {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        System.out.println(stack);
        stack.push(30);
        System.out.println(stack.pop());
        stack.push(40);
        System.out.println(stack);

        // peek
        System.out.println(stack + "->" + stack.peek() + " " + stack.size());
        stack.pop();
        System.out.println(stack + "->" + stack.peek() + " " + stack.size());
        stack.pop();
        System.out.println(stack + "->" + stack.peek() + " " + stack.size());
        stack.pop();
        System.out.println(stack + "->" + " " + stack.size());
    }
}
