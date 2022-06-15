package zcode;

import java.util.Scanner;

public class phuong_trinh_bac_nhat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float a=s.nextFloat(),b=s.nextFloat();
        if(a==0&&b!=0){
            System.out.println("VN");
        }
         if(a==0&&b==0)
            System.out.println("VSN");
        if(a!=0&&b!=0){
            System.out.printf("%.2f",((-1*b)/a));
        }
    }
}
