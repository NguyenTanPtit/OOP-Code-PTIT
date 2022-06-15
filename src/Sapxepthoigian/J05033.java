package Sapxepthoigian;

import java.util.Arrays;
import java.util.Scanner;

public class J05033 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        thoigian[] t=new thoigian[n];
        while (n-->0){
            int gio=sc.nextInt(),phut=sc.nextInt(),giay=sc.nextInt();
            t[i]=new thoigian(gio,phut,giay);
            i++;
        }
        Arrays.sort(t);
        for (thoigian thoigian : t) {
            System.out.println(thoigian);
        }
    }
}
