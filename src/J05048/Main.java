package J05048;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        ArrayList<Product> products= new ArrayList<>();
        for (int i =0;i<t;i++){
            products.add(new Product(s.nextLine(),Integer.parseInt(s.nextLine())));
        }
        Collections.sort(products);
        String query= s.nextLine();
        char id=query.charAt(0);
        for (Product i : products){
            if(i.getId().charAt(0)==id)
                System.out.println(i);
        }
    }
}
