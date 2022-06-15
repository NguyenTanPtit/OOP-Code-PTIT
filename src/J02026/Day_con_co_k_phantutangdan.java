package J02026;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day_con_co_k_phantutangdan {
    static int[] arr = new int[16];
    static int[] brr = new int[16];
    static int n, k;
    static ArrayList<String> set = new ArrayList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- >0) {
            n = in.nextInt();
            k = in.nextInt();
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr, 0, n);
            res(0, n-1, 0);
            for (String s : set)
                System.out.println(s.trim());
            set.clear();
        }
    }

    static void res(int start, int end, int idx) {
        if (idx == k)
        {
            StringBuilder tmp = new StringBuilder();
            for (int i = 0; i < k; i++) {
                tmp.append(brr[i]).append(" ");
            }
            set.add(tmp.toString());
            return;
        }

        for (int i = start; i <=end && end-i+1 >= k-idx; i++) {
            brr[idx] = arr[i];
            res(i+1, end, idx+1);
        }
    }
}
