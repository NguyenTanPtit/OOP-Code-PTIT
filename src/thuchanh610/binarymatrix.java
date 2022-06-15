package thuchanh610;

import java.util.Scanner;

public class binarymatrix {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int [][]a= new int[n][3];
        int dem1,dem=0;
        for(int i=0;i<n;i++){
            dem1=0;
            for(int j=0;j<3;j++){
                a[i][j]=s.nextInt();
                if(a[i][j]==1) dem1++;
            }
            if(dem1>=2) dem++;
        }
        System.out.println(dem);
    }
}
