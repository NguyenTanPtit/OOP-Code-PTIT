package thuchanh0311;

import java.io.IOException;

public class Hieu2TapTu {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}
