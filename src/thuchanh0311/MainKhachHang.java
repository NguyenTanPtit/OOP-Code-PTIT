package thuchanh0311;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

public class MainKhachHang {

        public static void main(String[] args) throws ParseException, FileNotFoundException {
            Scanner sc =new Scanner(new File("KHACHHANG.in"));
            int t=sc.nextInt();
            sc.nextLine();
            KhachHang[] a= new KhachHang[t];
            while(sc.hasNext()){
                for(int i=0;i<t;i++){
                    a[i]=new KhachHang(i+1,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
                }
            }
            Arrays.sort(a);
            for (KhachHang k:a) {
                System.out.println(k);
            }
        }

}
