package J07046;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner s = new Scanner(new File("KHACH.in"));
        int n = Integer.parseInt(s.nextLine());
        ArrayList<Customer> arrayList = new ArrayList<>();
        int i =1;
        while (n-->0){
            arrayList.add(new Customer(i,s.nextLine(),s.nextLine(),s.nextLine(), s.nextLine()));
            i++;
        }
        Collections.sort(arrayList);
        for (Customer c: arrayList){
            System.out.println(c);
        }
    }
}
