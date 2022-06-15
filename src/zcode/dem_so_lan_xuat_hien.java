package zcode;

import java.util.Arrays;
import java.util.Scanner;

public class dem_so_lan_xuat_hien {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int k=1;
        int t= s.nextInt();
        while(t-- >0){
            int n = s.nextInt();
            int [] a= new int[n+8];
            int [] d= new int[100];
            Arrays.fill(d,0);

            for(int i=0;i<n;i++){
                a[i]=s.nextInt();
                d[a[i]]++;
            }
            System.out.println("Test "+k+":");
            for(int i=0;i<n;i++){
                if(d[a[i]]>0){
                    System.out.println(a[i]+" xuat hien "+d[a[i]]+" lan");
                    d[a[i]]=0;
                }
            }
            k++;
        }
    }
}
