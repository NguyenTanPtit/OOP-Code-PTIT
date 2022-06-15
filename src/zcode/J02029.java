package zcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J02029 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0) {
            int n = in.nextInt();
            int[] arr = new int[n+1];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            ArrayList<String> al = new ArrayList<>();

            for (int i = 0; i < n-1; i++) {
                for (int j = i+1; j < n; j++) {
                    if(arr[i] > arr[j]) {
                        int tmp = arr[i]; arr[i] = arr[j]; arr[j] = tmp;
                    }
                }
                StringBuilder res = new StringBuilder("Buoc " + (i + 1) + ": ");
                for (int j = 0; j < n; j++) {
                    res.append(arr[j]).append(" ");
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