package J05046;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        HashMap<String,Integer> hashMap = new HashMap<>();
        ArrayList<Cart> carts = new ArrayList<>();
        while (t-->0){
            carts.add(new Cart(s.nextLine(),Integer.parseInt(s.nextLine()),Integer.parseInt(s.nextLine())));
        }
        for (Cart i : carts){
            if(hashMap.containsKey(i.ID())){
                hashMap.put(i.ID(),hashMap.get(i.ID())+1);
                i.setId(String.format("%02d",hashMap.get(i.ID())));
            }
            else {
                hashMap.put(i.ID(),1);
                i.setId("01");
            }
        }
        Collections.sort(carts);
        for (Cart i :carts){
            System.out.println(i);
        }
    }
}
