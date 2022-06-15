package thuchanh610;

import java.text.ParseException;
import java.util.Scanner;

public class Billing {
    public static void main(String[] args) throws ParseException {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        City[] cities = new City[t];
        for (int i = 0; i < t; i++) {
            int id = s.nextInt();
            s.nextLine();
            String name = s.nextLine();
            int price = s.nextInt();
            cities[i] = new City(id, name, price);
        }
        int q = s.nextInt();
        s.nextLine();
        Call[] calls = new Call[q];
        for (int i = 0; i < q; i++) {
            String id = s.next();
            String start = s.next();
            String end = s.next();
            calls[i] = new Call(id, start, end);
        }
        for (int i = 0; i < q; i++) {
            if (calls[i].getId().charAt(0) == '0') {
                for (int j = 0; j < t; j++) {

                    if (calls[i].getId().substring(1, 3).equals(String.valueOf(cities[j].getId()))) {
                        System.out.println(calls[i].getId() + " " + cities[j].getName() + " " + calls[i].counttime() + " " + calls[i].counttime() * cities[j].getPrice());
                    }

                }

            } else
                System.out.println(calls[i].getId() + " Noi mang " + calls[i].counttime() + " " + 800 * calls[i].counttime());
        }
    }
}
