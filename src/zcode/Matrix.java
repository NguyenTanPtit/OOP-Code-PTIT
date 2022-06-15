package zcode;

import java.util.Scanner;

public class Matrix {
    private  int hang;
    private int cot;
    private int[][] a;




    public Matrix(int hang, int cot) {
        this.cot = cot;
        this.hang = hang;
        a = new int[hang][cot];
    }



    public Matrix() {
        cot = 0;
        hang = 0;
        a = new int[hang][cot];
    }
    public void in() {
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public Matrix chuyenVi() {
        Matrix mtTran = new Matrix(cot,hang );

        for (int i = 0; i < cot; i++) {
            for (int j = 0; j < hang; j++) {
                mtTran.a[i][j] = a[j][i];
            }
        }

        return mtTran;
    }
    public Matrix nhan(Matrix mt2) {
        Matrix mtTich = new Matrix(hang, mt2.cot);

        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < mt2.cot; j++) {
                mtTich.a[i][j] = 0;
                for (int k = 0; k < cot; k++) {
                    mtTich.a[i][j] += a[i][k] * mt2.a[k][j];
                }
            }
        }

        return mtTich;
    }
    public void  nhap(Scanner s){
        hang=s.nextInt();
        cot=s.nextInt();
        a = new int[hang][cot];
        for (int i=0;i<hang;i++){
            for (int j=0;j<cot;j++){
                a[i][j]=s.nextInt();
            }
        }
    }

}
