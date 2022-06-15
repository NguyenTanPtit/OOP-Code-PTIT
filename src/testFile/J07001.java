package testFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07001 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner( new File("DATA.in"));
        while (s.hasNextLine()){
            System.out.println(s.nextLine());
        }
    }
}
