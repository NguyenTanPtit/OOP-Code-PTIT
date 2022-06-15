package J07010;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner s = new Scanner(new File("SV.in"));
        int t = s.nextInt();
        s.nextLine();
        int i=0;
        while (s.hasNextLine()) {
                Student st = new Student(i+1, s.nextLine(), s.nextLine(), s.nextLine(), s.nextLine());
                System.out.println(st);
                i++;
        }

    }
}
