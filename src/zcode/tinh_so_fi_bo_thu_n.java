package zcode;

import java.util.Scanner;

public class tinh_so_fi_bo_thu_n {
    public static long [] f = new long[94];
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        f[1]=f[2]=1;
        for(int i=3;i<=93;i++){
            f[i]=f[i-1]+f[i-2];
        }
        while (t-- >0){
            int n= s.nextInt();
            System.out.println(f[n]);
        }
    }
}


