package J05067;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        ArrayList<Product> products= new ArrayList<>();
        while (t-->0){
            products.add(new Product(s.next(),Integer.parseInt(s.next())));
        }
        Collections.sort(products);
        for (Product p:products){
            System.out.println(p);
        }
    }
}
