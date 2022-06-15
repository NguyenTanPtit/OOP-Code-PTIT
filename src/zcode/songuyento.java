package zcode;

import java.util.Scanner;

public class songuyento {
    public static boolean check(long n){
        if (n<2)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        t=s.nextInt();
        while (t>0){
            long n;
            n= s.nextLong();
            if(check(n)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            t--;
        }
    }
}
