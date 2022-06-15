package J07018;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner s = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(s.nextLine());
        ArrayList<Student> st = new ArrayList<>();
        int id = 1;
        while (t -- >0){
            st.add(new Student(id,s.nextLine(),s.nextLine(),s.nextLine(),Float.parseFloat(s.nextLine())));
            id++;
        }
        for (Student student: st){
            System.out.println(student);
        }
    }
}
