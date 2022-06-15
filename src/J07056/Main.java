package J07056;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("KHACHHANG.in"));
        int t = Integer.parseInt(s.nextLine());
        ArrayList<Customer> customers = new ArrayList<>();
        int id = 1;
        while (t-->0){
            customers.add(new Customer(id, s.nextLine(),s.next(),Integer.parseInt(s.next()),Integer.parseInt(s.next())));
            s.nextLine();
            id++;
        }
        Collections.sort(customers);
        for (Customer c : customers){
            System.out.println(c);
        }
    }
}
