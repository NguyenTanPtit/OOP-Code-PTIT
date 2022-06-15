package J07050;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("MATHANG.in"));
        int t = Integer.parseInt(s.nextLine());
        ArrayList<Product> products = new ArrayList<>();
        int i=1;
        while (t-->0){
            products.add(new Product(i,s.nextLine(),s.nextLine(),Float.parseFloat(s.nextLine()),Float.parseFloat(s.nextLine())));
            i++;
        }
        Collections.sort(products);
        for (Product p: products){
            System.out.println(p);
        }
    }
}
