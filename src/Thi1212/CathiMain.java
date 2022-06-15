package Thi1212;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CathiMain {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner s = new Scanner(new File("CATHI.in"));
        int t = Integer.parseInt(s.nextLine());
        ArrayList<Cathi> cathis = new ArrayList<>();
        int id=1;
        while (t-->0){
            cathis.add(new Cathi(id,s.nextLine(),s.nextLine(),s.nextLine()));
            id++;
        }
        Collections.sort(cathis);
        for (Cathi c: cathis){
            System.out.println(c);
        }
    }
}
