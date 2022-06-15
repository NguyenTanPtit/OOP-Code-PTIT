package J06003;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt(),m=s.nextInt();
        s.nextLine();
        Student[] st= new Student[n];
        for(int i=0;i<n;i++){
            String id=s.nextLine();
            String name=s.nextLine();
            String phone=s.nextLine();
            int groupid=s.nextInt();
            s.nextLine();
            st[i]= new Student(id,name,phone,groupid);
        }
        Group[] gr=new Group[m];
        for(int i=0;i<m;i++){
            int id=i+1;
            String namegroup=s.nextLine();
            gr[i]= new Group(id,namegroup);
        }
        Arrays.sort(st);
        for(Student i:st) {
            System.out.print(i+" ");
            for (Group k : gr) {
                if (i.getGroup()==k.getId()){
                    System.out.println(k.getName());
                }
            }
        }
    }
}
