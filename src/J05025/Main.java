package J05025;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        s.nextLine();
        Giangvien [] gv = new Giangvien[n];
        for(int i=0;i<n;i++){
            int id=i+1;
            String name = s.nextLine();
            String major=s.nextLine();
            gv[i]=new Giangvien(id,name,major);
        }
        int Q=s.nextInt();
        s.nextLine();
        while (Q-->0) {
            String keyword=s.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA "+keyword+":");
            for (Giangvien i : gv) {
                if(i.toString().toLowerCase().contains(keyword.toLowerCase()))
                System.out.println(i);
            }
        }
    }
    public static String standfor(String s){
        StringBuilder res= new StringBuilder();
        res.append(s.charAt(0));
        for(int i=1;i<s.length()-1;i++){
            if(s.charAt(i)==' ')
                res.append(s.charAt(i+1));
        }
        return res.toString().toUpperCase();
    }
}
