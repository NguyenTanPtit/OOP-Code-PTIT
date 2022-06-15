package zcode;

import java.util.Scanner;

public class TichMatixChuyenVi {
    static Scanner s= new Scanner(System.in);
    static int n,m;
    static int[][] a= new int[100][100];
    static int [][] b = new int[100][100];
    static int [][] c=new int[100][100];
    static void nhap(){
        n=s.nextInt();
        m=s.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                a[i][j]=s.nextInt();
            }
        }
    }
    static void in(int [][] c){
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void chuyenvi(int [][]a,int [][]b,int n,int m){
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                b[i][j]=a[j][i];
            }
        }
    }
    static void nhan(int [][]a,int [][]b,int n,int m){

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                c[i][j]=0;
                for(int k=0;k<m;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
    }
    public static void main(String[] args) {
        int k=1;
        int t= s.nextInt();
        while (t-->0){
            nhap();
            chuyenvi(a,b,n,m);
            nhan(a,b,n,m);
            System.out.println("Test "+k+":");
            in(c);
            k++;
        }
    }
}
