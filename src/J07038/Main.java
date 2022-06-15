package J07038;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s1 = new Scanner(new File("SINHVIEN.in"));
        Scanner s2 = new Scanner(new File("DN.in"));
        Scanner s3 = new Scanner(new File("THUCTAP.in"));
        int t1 = Integer.parseInt(s1.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        while (t1-->0){
            students.add(new Student(s1.nextLine(),s1.nextLine(),s1.nextLine(),s1.nextLine()));
        }
        int t2 = Integer.parseInt(s2.nextLine());
        ArrayList<Company> companies = new ArrayList<>();
        while (t2-->0){
            companies.add(new Company(s2.nextLine(),s2.nextLine(),Integer.parseInt(s2.nextLine())));
        }
        int t3 = Integer.parseInt(s3.nextLine());
        ArrayList<ThucTap> thucTaps= new ArrayList<>();
        while (t3-->0){
            thucTaps.add(new ThucTap(searchSt(students,s3.next()),searchCom(companies,s3.next())));
            s3.nextLine();
        }
        Collections.sort(thucTaps);
        int t = Integer.parseInt(s3.nextLine());
        while (t-->0){
            String id = s3.nextLine();
            int num = 0;
            for (Company c : companies){
                if(c.getId().equals(id)){
                    System.out.println("DANH SACH THUC TAP TAI "+c.getName()+":");
                    num = c.getNum();
                }
            }
            for (ThucTap thucTap : thucTaps){
                if(id.equals(thucTap.getCp().getId()) && num >0){
                    num --;
                    System.out.println(thucTap.getSt());
                }
            }
        }
    }
    static Student searchSt(ArrayList<Student> s, String id){
        for (Student student: s){
            if(student.getId().equals(id)){
                return student;
            }
        }
        return null;
    }
    static Company searchCom(ArrayList<Company> companies, String id){
        for (Company c : companies){
            if(c.getId().equals(id)){
                return c;
            }
        }
        return null;
    }
}
