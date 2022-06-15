package Thi1212;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class Sokhonggiam {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream s1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream s2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>) s1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) s2.readObject();
        TreeMap<Integer, Integer> treeMap1 = new TreeMap<>();
        TreeMap<Integer, Integer> treeMap2 = new TreeMap<>();
        for (Integer i : arr1) {
            if (treeMap1.containsKey(i)) {
                treeMap1.put(i, treeMap1.get(i) + 1);
            } else treeMap1.put(i, 1);
        }
        for (Integer i : arr2) {
            if (treeMap2.containsKey(i)) {
                treeMap2.put(i, treeMap2.get(i) + 1);
            } else treeMap2.put(i, 1);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (Integer i : treeMap1.keySet()) {
            if (check(i) && treeMap2.containsKey(i)) {
                res.add(i);
            }
        }
        Collections.sort(res);
        for (Integer i : res) {
            System.out.println(i + " " + treeMap1.get(i) + " " + treeMap2.get(i));

        }

    }

    static boolean check(int n) {
        String s = String.valueOf(n);
        if (s.length() < 2)
            return false;
        for (int i = 0; i < s.length() - 1; i++) {
            if (Integer.parseInt(String.valueOf(s.charAt(i))) > Integer.parseInt(String.valueOf(s.charAt(i + 1))))
                return false;
        }
        return true;
    }
}
