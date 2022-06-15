package J03019;

import java.util.Scanner;

public class Xau_con_lon_nhat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inp = s.next();
        int len = inp.length();
        StringBuilder tmp = new StringBuilder();
        char[] maxChar = new char[len+2];
        int[] idx = new int[len+2];
        maxChar[len-1] = inp.charAt(len-1);
        idx[len-1] = len - 1;

        for (int i = len-2; i >= 0; i--) {
            maxChar[i] = (char) (Math.max(inp.charAt(i), maxChar[i+1]));
            if (inp.charAt(i) != maxChar[i])
                idx[i] = idx[i+1];
            else idx[i] = i;
        }

        int count = 0;
        while (count < len) {
            tmp.append(maxChar[count]);
            count = idx[count] + 1;
        }
        System.out.println(tmp);
    }
}
