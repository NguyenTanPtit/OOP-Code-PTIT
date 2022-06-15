package J01018;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        while (n-->0){
            String s1 = s.nextLine();
            if(check(s1))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
    static boolean check(String s){
        int sum =0;
        for(int i =0;i< s.length();i++){
            sum+=  s.charAt(i)-'0';
        }
        if(sum%10!=0) return false;
        for(int i =0;i< s.length()-1;i++){
            if(Math.abs((int) s.charAt(i)-(int) s.charAt(i+1))!=2)
                return false;
        }
        return true;
    }
}
