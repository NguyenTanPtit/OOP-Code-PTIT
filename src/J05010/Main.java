package J05010;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =Integer.parseInt(s.nextLine());
        ArrayList<Product> products= new ArrayList<>();
        int i=1;
        while (t-->0){
            products.add(new Product(i,s.nextLine(),s.nextLine(),Float.parseFloat(s.nextLine()),Float.parseFloat(s.nextLine())));
            i++;
        }
        Collections.sort(products);
        for (Product pro: products){
            System.out.println(pro);
        }
    }
}
