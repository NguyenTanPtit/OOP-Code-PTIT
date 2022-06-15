package zcode;

import java.math.BigInteger;
import java.util.Scanner;

public class J03012 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            String s1=s.next(),s2=s.next();
            BigInteger A =new BigInteger(s1);
            BigInteger B =new BigInteger(s2);
            BigInteger c=A.add(B).abs();
            System.out.println(c);
        }
    }
}
