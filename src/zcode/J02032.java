package zcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J02032 {
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
            for (int i = 0; i < n; i++) {
                boolean check = false;
                for (int j = 0; j < n-i-1; j++) {
                    if(arr[j] > arr[j+1]) {
                        int tmp = arr[j]; arr[j] = arr[j+1]; arr[j+1] = tmp;
                        check = true;
                    }
                }
                if(!check) break;
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