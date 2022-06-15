package J05060;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner s = new Scanner(new File("XETTUYEN.in"));
        int t = Integer.parseInt(s.nextLine());
        int i =1;
        ArrayList<PhuHo> phuHos= new ArrayList<>();
        while (t-->0){
            phuHos.add(new PhuHo(i,s.nextLine(),s.nextLine(),Float.parseFloat(s.nextLine()),Float.parseFloat(s.nextLine())));
            i++;
        }
        for (PhuHo p :phuHos){
            System.out.println(p);
        }
    }
}
