package Vu_thuc_hanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= Integer.parseInt(s.nextLine());
        Subject []subjects= new Subject[n];
        for(int i=0;i<n;i++){
            subjects[i]= new Subject(s.next(),s.nextLine());
        }
        int t=Integer.parseInt(s.nextLine());
        Professor [] professors= new Professor[t];
        for(int i=0;i<t;i++){
            String id = s.next();
            String name =s.nextLine();
            professors[i]= new Professor(id ,name);
        }
        int q=Integer.parseInt(s.nextLine());
        Classroom [] classrooms= new Classroom[q];
        for(int i=0;i<q;i++) {
            classrooms[i]= new Classroom(s.next(),s.next(),s.nextFloat());
        }
        String id=s.next();
        for(int i=0;i<q;i++){
            if(classrooms[i].getIdprof().equals(id)){
                for(int j=0;j<t;j++){
                    if(professors[j].getId().equals(id)){
                        System.out.println("Giang vien:"+professors[i].getName());
                    }
                }
                for(int k=0;k<n;k++){
                    if(subjects[k].getId().equals(classrooms[i].getIdsub())){
                        System.out.println(subjects[k].getName().substring(1)+" "+classrooms[i].getTime());
                    }
                }
                System.out.println("Tong: "+String.format("%.2f",classrooms[i].getTime()));
            }
        }
    }
}
