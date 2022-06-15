package zcode;
import java.util.Scanner;

public class J2022 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int test = scanner.nextInt();
        while (test-- > 0) {
            int n = scanner.nextInt();
            Integer[] arr = new Integer[n+1];
            Boolean[] visit = new Boolean[n+1];
            for (int i = 1; i <=n ; i++) {
                arr[0] = i;
                init(n, visit);
                visit[i] = false;
                quayLui(1, n, arr, visit);
            }
        }
    }

    static  void init(int n, Boolean[] visit) {
        for (int i = 1; i <= n ; i++) {
            visit[i] = true;
        }
    }

    static void quayLui(int i, int n, Integer[] arr, Boolean[] visit) {
        if(i >= n)
            return;
        for (int j = 1; j <= n; j++) {
            if(visit[j] && Math.abs(j - arr[i-1]) != 1) {
                visit[j] = false;
                arr[i] = j;
                if(i==n-1)
                    in(n, arr);
                quayLui(i+1, n, arr, visit);
                visit[j] = true;
            }
        }
    }

    static void in(int n, Integer[] arr) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
