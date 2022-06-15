package zcode;

import java.util.Scanner;

public class sodep2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0){
            int sum=0;
            String s1 = s.next();
            for(int i=0;i<s1.length();i++){
                sum+=s1.charAt(i)-'0';
            }
            if(c(s1)&&sum%10==0&&check(s1)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
    public static boolean c(String n){
        return n.charAt(0)-'0' == 8 && n.charAt(n.length() - 1)-'0' == 8 ;
    }
    public static boolean check(String n){
        for(int i=0;i<=n.length()/2;i++){
            if(n.charAt(i)!=n.charAt(n.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
