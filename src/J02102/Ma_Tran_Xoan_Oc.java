package J02102;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ma_Tran_Xoan_Oc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < n * n; i++) {
            integers.add(s.nextInt());
        }
        Collections.sort(integers);
        int[][] arr = new int[n][n];
        spiralPrint(n, n, arr, integers);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void spiralPrint(int m, int n, int[][] a, ArrayList<Integer> b) {
        int i, k = 0, l = 0, dem = 0;
        while (k < m && l < n) {
            for (i = l; i < n; ++i) {
                a[k][i] = b.get(dem);
                dem++;
            }
            k++;
            for (i = k; i < m; ++i) {
                a[i][n - 1] = b.get(dem);
                dem++;
            }
            n--;
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    a[m - 1][i] = b.get(dem);
                    dem++;
                }
                m--;
            }
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    a[i][l] = b.get(dem);
                    dem++;
                }
                l++;
            }
        }
    }
}
