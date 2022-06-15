package Dat_thuc_hanh;

import java.util.Scanner;

public class SquareNumber {
    static boolean checkPerfectSquare(long x)
    {
        double sq = Math.sqrt(x);
        return ((sq - Math.floor(sq)) == 0);
    }

    public static void main(String[] args) {
        Scanner s= new Scanner( System.in);
        int t=s.nextInt();
        while (t-->0){
            long n=s.nextLong();
            if(checkPerfectSquare(n)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
