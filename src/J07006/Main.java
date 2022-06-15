package J07006;

import java.io.*;
import java.util.ArrayList;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream s = new ObjectInputStream(new FileInputStream("DATA.in"));
        TreeMap<Integer, Integer> set = new TreeMap<>();
        ArrayList<Integer> arrayList = (ArrayList<Integer>) s.readObject();
        for (Integer i : arrayList) {

            if (set.containsKey(i)) {
                set.put(i, set.get(i) + 1);
            } else {
                set.put(i, 1);
            }

        }
        for (Integer i : set.keySet()) {
            System.out.println(i + " " + set.get(i));
        }

    }
}
