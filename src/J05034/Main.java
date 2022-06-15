package J05034;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        s.nextLine();
        SinhVien []sv= new SinhVien[n];
        for(int i=0;i<n;i++){
            int stt=i+1;
            String id=s.nextLine();
            String name=s.nextLine();
            String lop=s.nextLine();
            String email=s.nextLine();
            String company=s.nextLine();
            sv[i]=new SinhVien(stt,id,name,lop,email,company);
        }
        Arrays.sort(sv);
        int Q=s.nextInt();
        s.nextLine();
        while (Q-->0){
            String cty=s.nextLine();
            for(SinhVien i :sv){
                if(i.getCompany().equals(cty))
                    System.out.println(i);
            }
        }
    }
}
