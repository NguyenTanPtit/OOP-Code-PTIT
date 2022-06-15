package Sapxeplichthi;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner s1 = new Scanner(new File("MONTHI.in"));
        Scanner s2 = new Scanner(new File("CATHI.in"));
        Scanner s3 = new Scanner(new File("LICHTHI.in"));
        ArrayList<Monthi> monthis = new ArrayList<>();
        ArrayList<Cathi> cathis= new ArrayList<>();
        ArrayList<Lichthi> lichthis = new ArrayList<>();
        int t1 = Integer.parseInt(s1.nextLine());
        while (t1-->0){
            monthis.add(new Monthi(s1.nextLine(),s1.nextLine(),s1.nextLine()));
        }
        int idca = 1;
        int t2 = Integer.parseInt(s2.nextLine());
        while (t2-->0){
            cathis.add(new Cathi(idca,s2.nextLine(),s2.nextLine(),s2.nextLine()));
            idca++;
        }
        int t3 =Integer.parseInt(s3.nextLine());
        while (t3-->0){
            lichthis.add(new Lichthi(s3.next(), s3.next(), s3.next(), s3.next()));
        }
        for (Lichthi l : lichthis){
            for (Cathi c: cathis){
                if(l.getIdca().equals(c.getId()))
                    l.setCathi(c);
            }
            for (Monthi m : monthis){
                if(l.getIdmon().equals(m.getId())){
                    l.setMonthi(m);
                }
            }
        }
        Collections.sort(lichthis);
        for (Lichthi l : lichthis){
            System.out.println(l);
        }
    }
}
