package stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        if(validParentheses(s.toCharArray()))
            System.out.println(s+" is balanced");
        else
            System.out.println(s+" is not balanced");

    }

    public static boolean validParentheses(char[] s){
        Stack<Character> stack=new Stack<>();

        for(char c:s){
            if(c=='('){
                stack.push(c);
            }
            else if(c==')'){
                if(stack.isEmpty()||stack.peek()==')')
                    return false;
                else
                    stack.pop();
            }
        }

        if(stack.isEmpty())
            return true;
        return false;
    }
}
