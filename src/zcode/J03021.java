package zcode;

import java.util.Scanner;

public class J03021 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        while (t-- > 0) {
            String s1 = s.nextLine().toUpperCase();
            StringBuilder s2 = new StringBuilder("");
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == 'A' || s1.charAt(i) == 'B' || s1.charAt(i) == 'C')
                    s2.append('2');
                if (s1.charAt(i) == 'D' || s1.charAt(i) == 'E' || s1.charAt(i) == 'F')
                    s2.append('3');
                if (s1.charAt(i) == 'H' || s1.charAt(i) == 'G' || s1.charAt(i) == 'I')
                    s2.append('4');
                if (s1.charAt(i) == 'M' || s1.charAt(i) == 'N' || s1.charAt(i) == 'O')
                    s2.append('6');
                if (s1.charAt(i) == 'J' || s1.charAt(i) == 'K' || s1.charAt(i) == 'L')
                    s2.append('5');
                if (s1.charAt(i) == 'P' || s1.charAt(i) == 'Q' || s1.charAt(i) == 'R' || s1.charAt(i) == 'S')
                    s2.append('7');
                if (s1.charAt(i) == 'T' || s1.charAt(i) == 'U' || s1.charAt(i) == 'V')
                    s2.append('8');
                if (s1.charAt(i) == 'W' || s1.charAt(i) == 'X' || s1.charAt(i) == 'Y' || s1.charAt(i) == 'Z')
                    s2.append('9');
            }
            String s4 = s2.toString();
            String s3 = s2.reverse().toString();
            if (s4.equals(s3)) {
                System.out.println("YES");
            } else System.out.println("NO");
        }
    }
}
