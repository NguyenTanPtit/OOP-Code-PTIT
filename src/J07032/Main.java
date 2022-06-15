package J07032;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream s = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream s1 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        TreeMap<Integer, Integer> treeMap2 = new TreeMap<>();
        ArrayList<Integer> arr1 = (ArrayList<Integer>) s.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) s1.readObject();
        for (Integer i : arr1) {
            if (checkThuanNghich(i) && checkLe(i)) {
                if (treeMap.containsKey(i)) {
                    treeMap.put(i, treeMap.get(i) + 1);
                } else treeMap.put(i, 1);
            }
        }
        for (Integer i : arr2) {
            if (checkThuanNghich(i) && checkLe(i)) {
                if (treeMap2.containsKey(i)) {
                    treeMap2.put(i, treeMap2.get(i) + 1);
                } else treeMap2.put(i, 1);
            }
        }
        int k = 0;
        for (Integer i : treeMap.keySet()) {
            if (treeMap2.containsKey(i)) {
                if (k == 10) break;
                System.out.println(i + " " + (treeMap.get(i) + treeMap2.get(i)));
                k++;
            }
        }
    }

    static boolean checkThuanNghich(int a) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(a));
        String s = String.valueOf(a);
        stringBuilder.reverse();
        return s.equals(stringBuilder.toString());
    }

    static boolean checkLe(int a) {
        String s = String.valueOf(a);
        if (s.length() % 2 == 0) return false;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) - '0') % 2 == 0) {
                return false;
            }
        }
        return true;
    }

}
