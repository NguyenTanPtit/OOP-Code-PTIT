package Dat_thuc_hanh;

import java.util.Scanner;

public class DatNgu {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0){
            int n =s.nextInt();
            if(check(n))
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }
    public static boolean check(int n){
        if(n<2) return false;
        for(int i =2;i<Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
