package J07048;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("SANPHAM.in"));
        int n = Integer.parseInt(s.nextLine());
        ArrayList<Product> arrayList = new ArrayList<>();
        while (n-->0){
            arrayList.add(new Product(s.nextLine(),s.nextLine(),Integer.parseInt(s.nextLine()),Integer.parseInt(s.nextLine())));
        }
        Collections.sort(arrayList);
        for(Product i : arrayList){
            System.out.println(i);
        }
    }
}
