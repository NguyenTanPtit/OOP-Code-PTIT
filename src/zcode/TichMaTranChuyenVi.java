package zcode;

import java.util.Scanner;

public class TichMaTranChuyenVi {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t=s.nextInt(), k=1;
        while (t-->0){

            Matrix mt1=new Matrix();
            Matrix mt2;
            Matrix mtcv;
            mt1.nhap(s);
            mtcv=mt1.chuyenVi();
            mt2=mt1.nhan(mtcv);
            System.out.println("Test "+k+":");
            mt2.in();
            k++;
        }
    }
}
