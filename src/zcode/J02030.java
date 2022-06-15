package zcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J02030 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = 1;
        while (t-->0) {
            int n = in.nextInt();
            int[] arr = new int[n+1];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            ArrayList<String> al = new ArrayList<>();
            al.add("Buoc 0: " + arr[0]);
            for (int i = 1; i < n; i++) {
                int key = arr[i];
                int j = i-1;
                while (j>=0 && arr[j] > key) {
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = key;
                StringBuilder res = new StringBuilder("Buoc " + (i) + ": ");
                for (int k = 0; k <= i; k++) {
                    res.append(arr[k]).append(" ");
                }
                al.add(res.toString());
            }
            Collections.reverse(al);
            for (String x : al) {
                System.out.println(x);
            }
        }
    }
}
