package zcode;

import java.util.Arrays;
import java.util.Scanner;

public class tong_uoc_so {
    public static boolean [] f= new boolean[2000005];
    public static void snt(){
        Arrays.fill(f,true);
        for (int i = 2; i <= 2000004; i++) {
            if (f[i]) {
                for (int j = 2 * i; j <= 2000004; j += i) {
                    f[j] = false;
                }
            }
        }
    }
    public static long sum(int n){
        int s=0;
        while (n%2==0){
            s+=2;
            n/=2;
        }
        for (int i=3;i<=Math.sqrt(n);i+=2){
            if(n%i==0){
                while (n%i==0){
                    s+=i;
                    n/=i;
                }
            }
        }
        if(n>2) s+=n;
        return s;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k=0;
        int [] a= new int[n+9];
        snt();
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
            if(f[a[i]])
                k+=a[i];
            else
                k+=sum(a[i]);
        }
        System.out.println(k);
        s.close();
    }
}
