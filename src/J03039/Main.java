package J03039;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        while (t-->0){
            BigInteger a = s.nextBigInteger();
            BigInteger b = s.nextBigInteger();
            if(a.mod(b).equals(BigInteger.ZERO)||b.mod(a).equals(BigInteger.ZERO)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
