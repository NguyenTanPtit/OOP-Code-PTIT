package zcode;

import java.util.Scanner;

public class LietKeToHop1 {
    static int [] a= new int[100];
    static int n,k,dem=0;
    public static void in(){
        for(int i=1;i<=k;i++){
            System.out.print(a[i]);
        }
        System.out.print(" ");
    }
    public static void tri (int i){
        for(int j=a[i-1]+1;j<=n-k+i;j++){
            a[i]=j;
            if(i==k){
                in();
                dem++;
            }
            else tri(i+1);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        k=s.nextInt();
        a[0]=0;
        tri(1);
        System.out.println();
        System.out.println("Tong cong co "+dem+" to hop");
    }
}
