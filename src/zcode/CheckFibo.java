package zcode;

import java.util.Scanner;

public class CheckFibo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t= s.nextInt();
        long [] f= new long[100];
        f[0]=0;
        f[1]=1;
        for (int i=2;i<100;i++){
            f[i]=f[i-1]+f[i-2];
        }
        while (t-->0){
            long n= s.nextLong(),dem=0;
            for (int i=0;i<100;i++){
                if(n==f[i]){
                    dem++;
                    System.out.println("YES");
                    break;
                }
            }
            if(dem==0){
                System.out.println("NO");
            }
        }
    }
}
