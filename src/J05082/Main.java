package J05082;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        ArrayList<Customer> customers = new ArrayList<>();
        int id =1;
        while (t-->0){
            customers.add(new Customer(id,s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine()));
            id++;
        }
        Collections.sort(customers);
        for (Customer c : customers){
            System.out.println(c);
        }
    }
}
