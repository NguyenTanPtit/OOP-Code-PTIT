package zcode;

import java.util.Scanner;

public class TimSoDu {
    static int check(long n){
        if(n%4==0) return 4;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t= s.nextInt();
        while (t-->0){
            long n=0;
            String s1=s.next();
            for(int i=0;i<s1.length();i++){
                n=n*10+(s1.charAt(i)-'0');
            }
            System.out.println(check(n));
        }
    }
}
