package Cung;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("MONHOC.in"));

        int t =s.nextInt();
        s.nextLine();
        Subject [] subjects = new Subject[t];
        for(int i =0 ;i < t ;i++){
            subjects[i] = new Subject(s.nextLine(), s.nextLine(), s.nextInt());
            s.nextLine();
        }
        Arrays.sort(subjects);
        for(Subject i : subjects){
            System.out.println(i);
        }
    }
}
