package J07015;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;

public class J07015 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ob = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        TreeMap<Integer, Integer> set = new TreeMap<>();
        ArrayList<Integer> arrayList = (ArrayList<Integer>) ob.readObject();
        for (Integer i : arrayList) {
            if (check(i)) {
                if (set.containsKey(i)) {
                    set.put(i, set.get(i) + 1);
                } else {
                    set.put(i, 1);
                }
            }
        }
        for (Integer i : set.keySet()) {
            System.out.println(i + " " + set.get(i));
        }
    }

    static boolean check(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
