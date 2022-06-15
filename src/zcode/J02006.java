package zcode;

import java.util.Arrays;
import java.util.Scanner;

public class J02006 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt(),m= s.nextInt();
        int [] a= new int[n];
        int [] b= new int[m];
        int [] d= new int [1000];
        Arrays.fill(d,0);
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
            d[a[i]]++;
        }
        for(int i=0;i<m;i++){
            b[i]=s.nextInt();
            d[b[i]]++;
        }
        for(int i=0;i<1000;i++){
            if(d[i]>=1){
                System.out.print(i+" ");
            }
        }
    }
}
