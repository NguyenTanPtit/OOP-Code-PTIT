package thuchanh0311;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class LoaiBoSoNguyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        List<String> s = new ArrayList<>();
        while (sc.hasNext()) {
            if (!sc.hasNextLong())
                s.add(sc.next());
            else sc.nextLong();
        }
        Collections.sort(s);
        for (String i : s) {
            System.out.print(i + " ");
        }
    }
}
