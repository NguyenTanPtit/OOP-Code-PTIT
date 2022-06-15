package zcode;

import java.math.BigInteger;
import java.util.Scanner;

public class HieuSoNguyenLon {


    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        int t= s.nextInt();
        while (t-->0){

            String s1 =s.next();
            String s2=s.next();
            int len = Math.max(s1.length(), s2.length());
            BigInteger a=new BigInteger(s1);
            BigInteger b = new BigInteger(s2);
            BigInteger c= a.subtract(b);
            c= c.abs();
            String sub= String.valueOf(c);
            StringBuilder s3= new StringBuilder(sub);
            s3.reverse();
            while (s3.length()<len){
                s3.append('0');
            }
            s3.reverse();
            System.out.println(s3);
        }
    }
}
