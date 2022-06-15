package DsSinhVien2;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner s= new Scanner(System.in);
        int t= s.nextInt();
        s.nextLine();
        SinhVIen [] sinhVIens=new SinhVIen[t];
        for(int i=0;i<t;i++){
            int id=i+1;
            String name=s.nextLine();
            String lop=s.next();
            s.nextLine();
            String ngaysinh=s.nextLine();
            float gpa=s.nextFloat();
            s.nextLine();
            sinhVIens[i]=new SinhVIen(id,name,lop,ngaysinh,gpa);
        }
        Arrays.sort(sinhVIens);
        for (int i=0;i<t;i++){
            System.out.println(sinhVIens[i]);
        }
    }
}
