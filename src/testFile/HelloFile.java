package testFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HelloFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Hello.txt");
        Scanner s= new Scanner(file);
        while (s.hasNext()){
                String p = s.next();
            System.out.println(p);
        }
    }
}
