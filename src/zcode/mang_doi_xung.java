package zcode;

import java.util.Scanner;

public class mang_doi_xung {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- >0){
            int dem=0;
            int n= s.nextInt();
            long [] f= new  long[n+8];
            for (int i=0;i<n;i++){
                f[i]= s.nextLong();
            }
            for (int i=0;i<n/2;i++){
                if(f[i]!=f[n-i-1]){
                    dem++;
                }
            }
            if(dem==0){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
