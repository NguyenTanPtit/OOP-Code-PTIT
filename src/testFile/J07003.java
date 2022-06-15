package testFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class J07003 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner s = new Scanner(file);
        while (s.hasNext()) {
            BigInteger n = new BigInteger(s.next());
            cutNumber(n);
        }
    }

    public static void cutNumber(BigInteger n) {
        String num = n.toString();
        BigInteger a, b;
        while (num.length() > 1) {
            a = new BigInteger(num.substring(0, num.length() / 2));
            b = new BigInteger(num.substring(num.length() / 2));
            num = String.valueOf(a.add(b));
            System.out.println(num);
        }
    }
}
