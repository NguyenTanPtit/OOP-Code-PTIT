package J05081;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        Product[] products = new Product[t];
        for(int i =0 ;i<t;i++){
            products[i] = new Product(i+1,s.nextLine(),s.nextLine(),Integer.parseInt(s.nextLine()),Integer.parseInt(s.nextLine()));
        }
        Arrays.sort(products);
        for(Product p : products){
            System.out.println(p);
        }
    }
}
