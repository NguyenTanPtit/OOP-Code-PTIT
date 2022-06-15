package J05030;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        s.nextLine();
        Sinhvien [] sv= new Sinhvien[n];
        for(int i=0;i<n;i++){
            String id= s.nextLine();
            String name=s.nextLine();
            String lop=s.nextLine();
            float diem1=s.nextFloat(),diem2=s.nextFloat(),diem3=s.nextFloat();
            s.nextLine();
            sv[i]=new Sinhvien(id,name,lop,diem1,diem2,diem3);
        }
        Arrays.sort(sv);
        for(int i=0;i<n;i++){
            System.out.println((i+1)+" "+sv[i]);
        }
    }
}
