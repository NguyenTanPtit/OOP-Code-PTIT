package Dat_thuc_hanh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("DN.in"));
        int n = s.nextInt();
        s.nextLine();
        List<DoanhNghiep> doanhNghieps = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            doanhNghieps.add( new DoanhNghiep(s.nextLine(), s.nextLine(), Integer.parseInt(s.nextLine())));
        }
        Collections.sort(doanhNghieps);
        for (DoanhNghiep i : doanhNghieps) {
            System.out.println(i);
        }
    }
}
