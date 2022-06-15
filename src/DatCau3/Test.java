package DatCau3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        ArrayList<String> ds1 = (ArrayList<String>) in1.readObject();
        ArrayList<Integer> ds2 = (ArrayList<Integer>) in2.readObject();

        SortedSet<String> set1 = new TreeSet<>();
        set1.addAll(ds1);
        SortedSet<Integer> set2 = new TreeSet<>();
        set2.addAll(ds2);
        SortedSet<String> res = new TreeSet<>();
        for (String i : set1) {
            for (Integer j : set2) {
                res.add(i + j);
            }
        }

        for (String i : res)
            System.out.println(i);
    }
}
