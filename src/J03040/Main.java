package J03040;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        while (t-- > 0) {
            String s1 = s.nextLine();
            String id = s1.substring(5);
            String[] strings = id.split("\\.");
            String string = strings[0] + strings[1];
            if (checktangdan(string)) {
                System.out.println("YES");
            } else if (checkbangnhau(strings[0]) && checkbangnhau(strings[1])) {
                System.out.println("YES");
            } else if (checklocphat(string)) {
                System.out.println("YES");
            } else System.out.println("NO");


        }
    }

    static boolean checktangdan(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) - '0' >= s.charAt(i + 1) - '0')
                return false;
        }
        return true;
    }

    static boolean checkbangnhau(String s) {
        int n = s.charAt(0) - '0';
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) - '0' != n)
                return false;
        }
        return true;
    }

    static boolean checklocphat(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '6' && s.charAt(i) != '8')
                return false;
        }
        return true;
    }
}
