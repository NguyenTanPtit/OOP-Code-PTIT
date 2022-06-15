package zcode;

import java.math.BigInteger;
import java.util.Scanner;

public class J03015 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        String s1=s.next(),s2=s.next();
        BigInteger A =new BigInteger(s1);
        BigInteger B =new BigInteger(s2);
        BigInteger c=A.subtract(B);
        System.out.println(c);

    }
}
