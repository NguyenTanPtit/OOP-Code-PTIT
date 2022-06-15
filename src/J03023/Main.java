package J03023;

import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    static Hashtable<Character, Integer> hashtable = new Hashtable<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        hashtable.put('I', 1);
        hashtable.put('V', 5);
        hashtable.put('X', 10);
        hashtable.put('L', 50);
        hashtable.put('C', 100);
        hashtable.put('D', 500);
        hashtable.put('M', 1000);

        int t = in.nextInt();
        while (t-- > 0) {
            String str = in.next();
            System.out.println(convert(str));
        }
    }

    private static int convert(String s) {
        int sum = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {

            if (i != n - 1 && hashtable.get(s.charAt(i)) < hashtable.get(s.charAt(i + 1))) {
                sum += hashtable.get(s.charAt(i + 1)) - hashtable.get(s.charAt(i));
                i++;
            } else {
                sum += hashtable.get(s.charAt(i));
            }
        }
        return sum;
    }

}
