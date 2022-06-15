package J05036;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t=Integer.parseInt(s.nextLine());
        ArrayList<Product> products= new ArrayList<>();
        int i=1;
        while (t-->0){
            products.add(new Product(i,s.nextLine(),s.nextLine(),Integer.parseInt(s.nextLine()),Integer.parseInt(s.nextLine())));
            i++;
        }
        Collections.sort(products);
        for (Product p : products){
            System.out.println(p);
        }
    }
}
