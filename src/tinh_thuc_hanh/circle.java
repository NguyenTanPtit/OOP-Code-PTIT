package tinh_thuc_hanh;

import java.util.Scanner;
import java.util.Stack;

public class circle {
    public static void main(String[] args) {
        Scanner s= new Scanner( System.in);
        String s1=s.nextLine();
        Stack<Character> c= new Stack<>();
        c.push(s1.charAt(0));
        for(int i=1;i<s1.length();i++){
            if(c.peek()==s1.charAt(i))
                c.pop();
            else c.push(s1.charAt(i));
        }
        System.out.println(c.size()/2);
    }
}
