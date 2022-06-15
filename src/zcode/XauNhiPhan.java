package zcode;

import java.util.Scanner;

public class XauNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] fi = new long [94];
        fi[1]=1;
        fi[2]=1;
        for (int i = 3; i < 93; i++) {
            fi[i] = fi[i-1] + fi[i-2];
        }
        while(t-- >0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(fiboWord(n, k,fi));
        }
        sc.close();
    }

    public static char fiboWord(int n, long k,long[] fi) {
        if(n==1) return '0';
        if(n==2) return '1';
        if(k <= fi[n-2])
            return fiboWord(n-2, k, fi);
        return fiboWord(n-1, k-fi[n-2], fi);
    }
}
