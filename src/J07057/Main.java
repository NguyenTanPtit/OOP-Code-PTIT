package J07057;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("THISINH.in"));
        int t = Integer.parseInt(s.nextLine());
        int id = 1;
        ArrayList<Student> students = new ArrayList<>();
        while (t-- > 0) {
            students.add(new Student(id, s.nextLine(), Float.parseFloat(s.nextLine()), s.nextLine(), Integer.parseInt(s.nextLine())));
            id++;
        }
        Collections.sort(students);
        for (Student st : students) {
            System.out.println(st);
        }
    }
}
