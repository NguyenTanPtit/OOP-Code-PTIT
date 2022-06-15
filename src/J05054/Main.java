package J05054;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t= Integer.parseInt(s.nextLine());
        ArrayList<Student> students= new ArrayList<>();
        int i=1;
        while (t-- > 0) {
            students.add(new Student(i,s.nextLine(),Float.parseFloat(s.nextLine())));
            i++;
        }
        for (Student st : students){
            System.out.println(st+" "+rank(students,st));
        }

    }
    private static int rank(ArrayList<Student> st,Student hs){
        int count=1;
        for (Student i: st){
            if(!i.equals(hs)){
                if(hs.getScore()<i.getScore())
                    count++;
            }
        }
        return count;
    }
}
