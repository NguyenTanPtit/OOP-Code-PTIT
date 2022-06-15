package testFile;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class J07003VU {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("DATA.in"));
        while (in.hasNext()) {
            BigInteger num = new BigInteger(in.next());
            BigInteger check = BigInteger.valueOf(10L);
            while (num.compareTo(check) != -1) {
                String res = num.toString();
                BigInteger num1 = new BigInteger(res.substring(0,res.length()/2));
                BigInteger num2 = new BigInteger(res.substring(res.length()/2));
                num = num1.add(num2);
                System.out.println(num);
            }
        }
    }
}
