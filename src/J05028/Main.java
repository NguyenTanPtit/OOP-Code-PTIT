package J05028;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        s.nextLine();
        Doanhnghiep[] dn= new Doanhnghiep[n];
        for(int i=0;i<n;i++){
            String id=s.nextLine();
            String name=s.nextLine();
            int people=s.nextInt();
            s.nextLine();
            dn[i]= new Doanhnghiep(id,name,people);
        }
        Arrays.sort(dn);
        int Q=s.nextInt();
        while (Q-->0) {
            int a=s.nextInt(),b=s.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+a+" DEN "+b+" SINH VIEN:");
            for (Doanhnghiep i : dn) {
                if(i.getPeople()>=a&&i.getPeople()<=b)
                    System.out.println(i);
            }
        }
    }
}
