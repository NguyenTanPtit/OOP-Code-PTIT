package zcode;

import java.util.Scanner;

public class gcd_of_2_so_lon {
    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static int giamb(int a,String b){
        int s=0;
        for(int i=0;i<b.length();i++){
            s=(s*10+b.charAt(i)-'0')%a;
        }
        return s;
    }
    public static int gcdLarge(int a,String b){
        int x=giamb(a,b);
        return gcd(a,x);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- >0){
            int a= s.nextInt();
            String b = s.next();
            if (a==0)
                System.out.println(b);
            else
                System.out.println(gcdLarge(a,b));
        }
    }
}
