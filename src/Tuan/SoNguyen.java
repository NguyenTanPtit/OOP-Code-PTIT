package Tuan;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class SoNguyen {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ob1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ob2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>) ob1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) ob2.readObject();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (Integer i : arr1) {
            if (check(i)) {
                if (arr1.contains(1000000 - i) && i < (1000000 - i) && check(1000000-i)&&!arr2.contains(i)&&!arr2.contains(1000000 - i)) {
                    hashMap.put(i, 1000000 - i);
                }
            }
        }
        TreeMap<Integer,Integer> treeMap = new TreeMap<>(hashMap);
        for (Integer i : treeMap.keySet()) {
            System.out.println(i + " " + treeMap.get(i));
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
