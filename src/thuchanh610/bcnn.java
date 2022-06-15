package thuchanh610;

import java.math.BigInteger;
import java.util.Scanner;

public class bcnn {
    public static void main(String[] args) {
        Scanner s= new Scanner( System.in);
        int t= s.nextInt();
        s.nextLine();
        while (t-->0){
            BigInteger A=s.nextBigInteger();
            BigInteger B=s.nextBigInteger();
            System.out.println((A.multiply(B)).divide(A.gcd(B)));
        }
    }
}
