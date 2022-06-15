package J05050;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        ArrayList<Bill> bills= new ArrayList<>();
        int i=1;
        while (t-->0){
            bills.add(new Bill(i,s.nextLine(),Integer.parseInt(s.nextLine()),Integer.parseInt(s.nextLine())));
            i++;
        }
        Collections.sort(bills);
        for (Bill b: bills){
            System.out.println(b);
        }
    }
}
