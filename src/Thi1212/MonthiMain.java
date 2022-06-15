package Thi1212;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MonthiMain {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("MONHOC.in"));
        ArrayList<MonThi> monThis= new ArrayList<>();
        int t = Integer.parseInt(s.nextLine());
        while (t-->0){
            monThis.add(new MonThi(s.nextLine(),s.nextLine(),s.nextLine()));
        }
        Collections.sort(monThis);
        for (MonThi m: monThis){
            System.out.println(m);
        }
    }
}
