package J07023;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream s1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream s2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>) s1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) s2.readObject();
        TreeMap<Integer, Integer> t1 = new TreeMap<>();
        TreeMap<Integer, Integer> t2 = new TreeMap<>();
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        for (Integer i : arr1) {
            if (checkngto(i) && checkthuannghich(i)) {
                if (t1.containsKey(i)) {
                    t1.put(i, t1.get(i) + 1);
                } else t1.put(i, 1);
                treeSet1.add(i);
            }
        }
        for (Integer i : arr2) {
            if (checkngto(i) && checkthuannghich(i)) {
                if (t2.containsKey(i)) {
                    t2.put(i, t2.get(i) + 1);
                } else t2.put(i, 1);
                treeSet1.add(i);
            }
        }
        for (Integer i : treeSet1) {
            if (t1.containsKey(i)&&t2.containsKey(i)) {
                System.out.println(i + " " + t1.get(i) + " " + t2.get(i));
            }
        }
    }

    static boolean checkthuannghich(Integer n) {
        StringBuilder s = new StringBuilder(String.valueOf(n));
        String s1 = String.valueOf(n);
        return s.reverse().toString().equals(s1);
    }

    static boolean checkngto(Integer n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
