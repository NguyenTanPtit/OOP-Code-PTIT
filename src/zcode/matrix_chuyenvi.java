package zcode;
import java.util.Scanner;
public class matrix_chuyenvi {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int v = 1; v<=n;v++) {
                int t = sc.nextInt();
                int m = sc.nextInt();
                int[][] arr = new int[t+1][m+1];
                int[][] brr = new int[m+1][t+1];
                int[][] crr = new int[t+1][t+1];
                for (int i = 1; i <= t; i++) {
                    for (int j = 1; j <= m; j++) {
                        arr[i][j] = sc.nextInt();
                        brr[j][i] = arr[i][j];
                    }
                }
                System.out.println("Test " + v+":");
                for (int i = 1; i <= t; i++) {
                    for (int j = 1; j <= t; j++) {
                        for (int k = 1; k <= m; k++) {
                            crr[i][j] += arr[i][k] * brr[k][j];
                        }
                        System.out.print(crr[i][j]+" ");
                    }
                    System.out.println();
                }
            }
            sc.close();
        }
    }

