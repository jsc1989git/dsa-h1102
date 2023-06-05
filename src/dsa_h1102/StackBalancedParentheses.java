package dsa_h1102;

import java.util.Stack;

public class StackBalancedParentheses {
    public static boolean isBalanced(String parentheses) {
        //Create a stack to check open parentheses
        Stack<Character> stack = new Stack<Character>();

        //Loop through each character in the string
        for (int i = 0; i < parentheses.length(); i++) {
            char c = parentheses.charAt(i);

            //if the character is an open parenthesis, push it to the stack
            if (c == '(') {
                stack.push(c);
            }

            //If the character is a closing parenthesis, check if the stack is empty
            //or if the top of the stack matches an open parenthesis
            else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false;
                }
                else {
                    stack.pop();
                }
            }
        }
        //After looping through all characters, if the stack is empty, the parentheses are balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        //Test
        String parentheses1 = "(((())))";
        String parentheses2 = "()()()";
        String parentheses3 = "(";
        String parentheses4 = ")";

        //Check if each string of parentheses is balanced and print the result
        System.out.println(isBalanced(parentheses1));
        System.out.println(isBalanced(parentheses2));
        System.out.println(isBalanced(parentheses3));
        System.out.println(isBalanced(parentheses4));
    }
}
