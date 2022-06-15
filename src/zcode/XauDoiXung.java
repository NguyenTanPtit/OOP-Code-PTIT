package zcode;

import java.util.Scanner;

public class XauDoiXung {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0) {
            String s1 = s.next();
            int dem = 0;
            if (s1.length() % 2 == 0) {
                for (int i = 0; i < s1.length() / 2; i++) {
                    if (s1.charAt(i) != s1.charAt(s1.length() - 1 - i)) {
                        dem++;
                    }
                }
                if (dem ==1)
                    System.out.println("YES");
                else System.out.println("NO");
            }
            else {
                for (int i = 0; i < s1.length() / 2; i++) {
                    if (s1.charAt(i) != s1.charAt(s1.length() - 1 - i)) {
                        dem++;
                    }
                }
                if (dem >=2)
                    System.out.println("NO");
                else System.out.println("YES");
            }
        }
    }
}
