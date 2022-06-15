package zcode;

import java.util.Scanner;

public class Tich_luy_thua {
    static int mod = 1000000007;
    static long mul(long a,long b){
        if(b==0) return 1;
        if(b==1) return a%mod;
        long p=mul(a,b/2);
        p=p*p%mod;
        if(b%2==0) return p%mod;
        return p*a%mod;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true){
            long a=s.nextLong(),b= s.nextLong();
            if(a!=0||b!=0){
                System.out.println(mul(a,b));
            }
            else break;
        }


    }
}
