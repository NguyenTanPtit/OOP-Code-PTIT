package J05076;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        ArrayList<Product> products = new ArrayList<>();
        while (t-->0){
            products.add(new Product(s.nextLine(),s.nextLine(),s.nextLine()));
        }
        int q = Integer.parseInt(s.nextLine());
        ArrayList<Hoadon> hoadons =  new ArrayList<>();
        while (q-->0){
            hoadons.add(new Hoadon(s.next(),Integer.parseInt(s.next()),Integer.parseInt(s.next()),Integer.parseInt(s.next())));
            s.nextLine();
        }
        for (Hoadon h : hoadons){
            for (Product p : products){
                if(h.getId().equals(p.getId())){
                    h.setProduct(p);
                }
            }
        }
        for (Hoadon h : hoadons){
            System.out.println(h);
        }
    }
}
