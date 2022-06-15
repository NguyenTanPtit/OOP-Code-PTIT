package J05009;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        int i=1;
        ArrayList <Student> students = new ArrayList<>();
        while (t-->0){
            students.add( new Student(i,s.nextLine(),s.nextLine(),Float.parseFloat(s.nextLine()),Float.parseFloat(s.nextLine()),Float.parseFloat(s.nextLine())));
            i++;
        }
        Collections.sort(students);
        float max=top(students);
        for (Student st: students){
            if(st.tongDiem()==max){
                System.out.println(st);
            }
        }
    }
    private static float top(ArrayList<Student> st){
        float top=0;
        for (Student student:st){
            if(student.tongDiem()>=top){
                top=student.tongDiem();
            }
        }
        return top;
    }
}
