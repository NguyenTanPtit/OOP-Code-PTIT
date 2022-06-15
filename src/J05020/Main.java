package J05020;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        s.nextLine();
        Sinhvien[] sv= new Sinhvien[n];
        for(int i=0;i<n;i++){
            String id =s.nextLine();
            String name =s.nextLine();
            String grade=s.nextLine();
            String email= s.nextLine();
            sv[i]= new Sinhvien(id,name,grade,email);
        }
        int Q=s.nextInt();
        s.nextLine();
        while (Q-->0){
            String nganh=s.nextLine();
            System.out.println("DANH SACH SINH VIEN NGANH "+nganh.toUpperCase()+":");
            switch (nganh){
                case "Ke toan":
                    for(Sinhvien i:sv){
                        if(i.getId().startsWith("DCKT", 3))
                            System.out.println(i);
                    }
                    break;
                case "Cong nghe thong tin":
                    for(Sinhvien i:sv){
                        if(i.getId().startsWith("DCCN", 3)&&i.getGrade().charAt(0)!='E')
                            System.out.println(i);
                    }
                    break;
                case "An toan thong tin":
                    for(Sinhvien i:sv){
                        if(i.getId().startsWith("DCAT", 3)&&i.getGrade().charAt(0)!='E')
                            System.out.println(i);
                    }
                    break;
                case "Vien thong":
                    for(Sinhvien i:sv){
                        if(i.getId().startsWith("DCVT", 3))
                            System.out.println(i);
                    }
                    break;
                case "Dien tu":
                    for(Sinhvien i:sv){
                        if(i.getId().startsWith("DCDT", 3))
                            System.out.println(i);
                    }
                    break;
            }
        }

    }
}
