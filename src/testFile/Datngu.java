package testFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Datngu {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s=  new Scanner( new File("DATA.in"));
        if(s.hasNextLine()){
            String a = s.nextLine();
            System.out.println(a);
        }
    }
}
