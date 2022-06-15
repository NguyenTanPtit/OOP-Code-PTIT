package J05042;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        while (t-->0){
            students.add(new Student(s.nextLine(),s.nextInt(), s.nextInt()));
            s.nextLine();
        }
        Collections.sort(students);
        for (Student st : students){
            System.out.println(st);
        }
    }
}
