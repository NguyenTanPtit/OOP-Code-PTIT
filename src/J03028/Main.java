package J03028;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner  s = new Scanner( System.in);
        int t = Integer.parseInt(s.nextLine());
        while (t-->0){
            String str = s.nextLine();
            String s1 = str.substring(0,str.length()/2);
            String s2 = str.substring(str.length()/2);
            String res1= rotate(s1);
            String res2= rotate(s2);
            System.out.println(merge(res1,res2));
        }
    }
    static int sum(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - 'A';
        }
        return sum;
    }

    static String rotate(String str) {
        int sum = sum(str);
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            res.append((char) ((str.charAt(i) + sum) % 26 + 'A'));
        }
        return res.toString();
    }

    static String merge(String r1, String r2) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < r1.length(); i++) {
            res.append((char) ((r1.charAt(i) + r2.charAt(i)) % 26 + 'A'));
        }
        return res.toString();
    }
}
