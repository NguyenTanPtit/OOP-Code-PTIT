package thuchanh0311;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordSet {
    private final String nameFile;

    public WordSet(String nameFile) {
        this.nameFile = nameFile;
    }


    public String difference(WordSet n) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(this.nameFile));
        Scanner sc1 = new Scanner(new File(n.nameFile));
        Set<String> a1 = new TreeSet<>(), a2 = new TreeSet<>();
        while (sc.hasNext()) {
            a1.add(sc.next().toLowerCase());
        }
        while (sc1.hasNext()) {
            a2.add(sc1.next().toLowerCase());
        }
        StringBuilder res = new StringBuilder();
        for (String i : a1) {
            if (!a2.contains(i)) {
                res.append(i).append(" ");
            }
        }
        return res.toString().trim();
    }
}

