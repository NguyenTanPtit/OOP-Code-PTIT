package J02009;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        ArrayList<Customer> arrayList= new ArrayList<>();
        while (t-- > 0) {
            arrayList.add(new Customer(s.nextInt(), s.nextInt()));
        }
        Collections.sort(arrayList);
        long time = 0;
        for (Customer i : arrayList) {
            if (time >= i.getStart())
                time += i.getEnd();
            else
                time = i.getStart() + i.getEnd();
        }
        System.out.println(time);
    }
}
