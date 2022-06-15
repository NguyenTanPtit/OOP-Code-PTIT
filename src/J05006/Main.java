package J05006;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        s.nextLine();
        NhanVien [] nv=new NhanVien[n];
        for(int i=0;i<n;i++){
            int id =i+1;
            String name = s.nextLine();
            String sex=s.nextLine();
            String dob=s.nextLine();
            String add=s.nextLine();
            String tax=s.nextLine();
            String contract=s.nextLine();
            nv[i]=new NhanVien(id,name,sex,dob,add,tax,contract);
        }
        Arrays.sort(nv);
        for(int i=0;i<n;i++){
            System.out.println(nv[i]);
        }
    }
}
