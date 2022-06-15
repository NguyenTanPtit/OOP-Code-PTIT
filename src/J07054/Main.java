package J07054;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("BANGDIEM.in"));
        int t = Integer.parseInt(s.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        int id=1;
        while (t-->0){
            students.add(new Student(id,s.nextLine(),Float.parseFloat(s.nextLine()),Float.parseFloat(s.nextLine()),Float.parseFloat(s.nextLine())));
            id++;
        }
        for (Student student: students){
            student.setRank(Rank(students,student));
        }
        Collections.sort(students);
        for (Student st: students){
            System.out.println(st);
        }
    }
    static int Rank(ArrayList<Student> s , Student st){
        int rank =1;
        for (Student s1: s ){
            if(!st.equals(s1)){
                if(st.average()< s1.average()){
                    rank++;
                }
            }
        }
        return rank;
    }
}
