package zcode;

import java.util.Scanner;

public class hinh_chu_nhat {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a= s.nextInt(),b= s.nextInt();
        if(a<=0||b<=0){
            System.out.println(0);
        }
        else
            System.out.println(2*(a+b)+" "+ a*b);
    }
}
