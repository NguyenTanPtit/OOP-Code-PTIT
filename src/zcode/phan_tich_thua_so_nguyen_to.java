package zcode;

import java.util.Scanner;

public class phan_tich_thua_so_nguyen_to {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int k=1;
        while (t-- >0){

            long n = s.nextLong();
            System.out.print("Test "+k+": ");
            for(int i=2;i<=Math.sqrt(n);i++){
                int dem=0;
                while (n%i==0){
                    n/=i;
                    dem++;
                }
                if(dem>0)
                    System.out.print(i+"("+dem+") ");
            }
            if(n>2) System.out.println(n+"("+1+")");
            k++;
            System.out.println();
        }
    }
}
