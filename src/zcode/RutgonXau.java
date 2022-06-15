package zcode;

import java.util.Scanner;
import java.util.Stack;

public class RutgonXau {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String s1 =s.next();
        StringBuilder s2= new StringBuilder("");
        Stack<Character> stack =new Stack<>();
        stack.push(s1.charAt(0));
        for(int i=1;i<s1.length();i++) {
            if(stack.empty()) {
                stack.push(s1.charAt(i));
                continue;
            }

            if(stack.peek()==s1.charAt(i)){
                stack.pop();

            }
            else {
                stack.push(s1.charAt(i));
            }
        }
        if(stack.empty()){
            System.out.println("Empty String");
        }
        else {
            while (!stack.empty()){

                s2.append(stack.peek());
                stack.pop();
            }
            System.out.println(s2.reverse());
        }
    }
}
