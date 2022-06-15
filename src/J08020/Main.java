package J08020;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-->0){
            String s = input.next();
            System.out.println(kiemtra(s));
        }
    }
    static String kiemtra(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if (s.charAt(i)=='(' || s.charAt(i)=='{'||s.charAt(i) =='['){
                stack.push(s.charAt(i));
            }
            else {
                if (stack.empty()){
                    return "NO";
                }
                char c = stack.peek();
                if((s.charAt(i)==')' && c =='(') || (s.charAt(i)=='}'&& c=='{') ||(s.charAt(i)==']'&& c =='[')){
                    stack.pop();
                }
                else {
                    return "NO";
                }
            }
        }
        if(stack.empty()){
            return "YES";
        }
        else {
            return "NO";
        }
    }
}
