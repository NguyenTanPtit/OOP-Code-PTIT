package J07033_chuanhoa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(s.nextLine());
        Student []student = new Student[n];
        while (s.hasNextLine()){
            for(int i =0;i<n;i++){
                student[i]= new Student(s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine());
            }
        }
        Arrays.sort(student);
        for (Student student1 : student){
            System.out.println(student1);
        }
    }
}
