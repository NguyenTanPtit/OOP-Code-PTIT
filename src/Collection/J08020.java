package Collection;

import java.util.Scanner;
import java.util.Stack;

public class J08020 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t =s.nextInt();
        s.nextLine();
        while (t-->0){
            String s1 = s.nextLine();
            Stack<Character> stack = new Stack<>();
            for(int i = 0; i <s1.length() ;i++){
                if(s1.charAt(i)== '{'||s1.charAt(i)=='('||s1.charAt(i)=='['){
                    stack.push(s1.charAt(i));
                }
                else {
                    if (!stack.empty()) {
                        char c = stack.peek();
                        if ((s1.charAt(i) == '}' && c=='{')||(s1.charAt(i)=='('&& c == ')')||(s1.charAt(i)=='['&&c==']')){
                            stack.pop();
                        }
                        else {
                            break;
                        }
                    }
                }
            }
            if(stack.empty()){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
}
