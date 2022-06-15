package J05052;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        ArrayList <Order> orders = new ArrayList<>();
        while (t-- > 0) {
            orders.add(new Order(s.nextLine(),s.nextLine(),Integer.parseInt(s.nextLine()),Integer.parseInt(s.nextLine())));
        }
        Collections.sort(orders);
        for (Order i : orders){
            System.out.println(i);
        }
    }
}
