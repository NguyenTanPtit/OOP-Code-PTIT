package zcode;

import java.util.Scanner;

public class J03026 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        while (t-->0) {
            String s1 = s.nextLine(), s2 = s.nextLine();
            if (s1.equals(s2)) {
                System.out.println(-1);
            } else System.out.println(Math.max(s1.length(), s2.length()));
        }
    }
}
