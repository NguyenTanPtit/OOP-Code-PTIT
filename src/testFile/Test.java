package testFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        FileOutputStream out= new FileOutputStream("So.OUT");
        for(int i=0;i<100;i++){
            out.write(i);
        }
        out.close();
    }
}
