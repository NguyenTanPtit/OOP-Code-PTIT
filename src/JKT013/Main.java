package JKT013;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            int n = in.nextInt();
            Queue<String> qu = new LinkedList<>();
            Stack<String> st = new Stack<>();
            qu.add("6");
            qu.add("8");
            while (!qu.isEmpty()) {
                String top = qu.remove();
                if (top.length() > n)
                    break;
                st.add(top);
                qu.add(top + "6");
                qu.add(top + "8");
            }
            System.out.println(st.size());
            while (!st.empty()) {
                System.out.print(st.pop() + " ");
            }
            System.out.println();
        }
    }
}
