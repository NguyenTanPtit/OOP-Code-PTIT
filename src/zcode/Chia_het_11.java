package zcode;

import java.util.Scanner;

public class Chia_het_11 {
    static Scanner s= new Scanner(System.in);
    static String s1 ;
    static void run(){
        long sum1=0,sum2=0;
        for(int  i=0;i<s1.length();i+=2) {
            sum1 += s1.charAt(i) - '0';
        }
        for(int i=1;i<s1.length();i+=2){
            sum2+=s1.charAt(i)-'0';
        }
        if((sum1-sum2)%11==0){
            System.out.println(1);
        }
        else System.out.println(0);
    }

    public static void main(String[] args) {
        int t=s.nextInt();
        while (t-->0){
            s1=s.next();
            run();
        }
    }
}
