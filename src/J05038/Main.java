package J05038;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        ArrayList<Salary> salaries= new ArrayList<>();
//        salaries.add(new Salary(1,s.nextLine(),Integer.parseInt(s.nextLine()),Integer.parseInt(s.nextLine()),s.nextLine()));
        int i=1;
        while (t-->0){
            salaries.add(new Salary(i,s.nextLine(),Integer.parseInt(s.nextLine()),Integer.parseInt(s.nextLine()),s.nextLine()));
            i++;
        }
        Collections.sort(salaries);
//        int total = 0;
        for (Salary sa:salaries){
            System.out.println(sa);
//            total+=sa.total();
        }
//        System.out.println("Tong chi phi tien luong: "+total);
    }
}
