package J04013;

import java.util.Scanner;

public class J02023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int s = scanner.nextInt();
        System.out.println(findMin(n,s) + " " + findMax(n,s));

    }

    static String findMax(int n, int s) {
        StringBuilder max = new StringBuilder();
        if (s == 0 || s > 9*n)
            return "-1";
        while (s >= 9) {
            max.append("9");
            s-=9;
        }
        max.append(String.valueOf(s));
        while (max.length() < n)
            max.append("0");
        return max.toString();
    }

    static String findMin(int n, int s) {
        StringBuilder min = new StringBuilder();
        if (s == 0 || s > 9*n)
            return "-1";
        s-=1;
        while (s>=9) {
            min.append("9");
            s-=9;
        }
        if(min.length() == n-1)
            min.insert(0, String.valueOf(s + 1));
        else {
            min.insert(0, String.valueOf(s));
            while (min.length() < n - 1)
                min.insert(0, "0");
            min.insert(0, "1");
        }
        return min.toString();
    }
}
