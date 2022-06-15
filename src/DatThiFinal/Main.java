package DatThiFinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("DANHSACH.in"));
        ArrayList<Name> names = new ArrayList<>();
        while (input.hasNextLine()){
            names.add(new Name(input.nextLine()));
        }
        Collections.sort(names);
        for (Name n : names){
            System.out.println(n);
        }
    }
}
