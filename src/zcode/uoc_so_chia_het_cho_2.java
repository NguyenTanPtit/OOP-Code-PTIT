package zcode;

import java.util.Scanner;

public class uoc_so_chia_het_cho_2 {
    public static long  soUoc(long n){
        long  dem=0,i;
        for( i=1;i<=Math.sqrt(n);i++){
            if (n%i==0){
                if(i%2==0){
                    dem++;
                }
                if((n/i)%2==0){
                    dem++;
                }
            }
        }
        i--;
        if(i*i==n&&i%2==0){
            dem--;
        }
        return dem;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t = s.nextInt();
        while (t-- >0){
            long n = s.nextLong();
            System.out.println(soUoc(n));
        }
    }
}
