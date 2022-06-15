package J07052;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("THISINH.in"));
        int t = Integer.parseInt(s.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        while (t-- > 0) {
            students.add(new Student(s.nextLine(), s.nextLine(), Float.parseFloat(s.nextLine()), Float.parseFloat(s.nextLine()), Float.parseFloat(s.nextLine())));
        }
        int chiTieu = Integer.parseInt(s.nextLine());
        Collections.sort(students);
        float diemChuan = students.get(chiTieu - 1).total();
        System.out.printf("%.1f\n", diemChuan);
        for (Student st : students) {
            System.out.print(st);
            if (st.total() >= diemChuan) {
                System.out.println(" TRUNG TUYEN");
            } else {
                System.out.println(" TRUOT");
            }

        }
    }
}
