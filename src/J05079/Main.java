package J05079;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        ArrayList<LopHocPhan> arrayList = new ArrayList<>();
        while (t-- > 0) {
            arrayList.add(new LopHocPhan(s.nextLine(), s.nextLine(), s.nextLine(), s.nextLine()));
        }
        Collections.sort(arrayList);
        int n = Integer.parseInt(s.nextLine());
        while (n-- > 0) {
            String name = s.nextLine();

            System.out.println("Danh sach cho giang vien " + name + ":");
            for (LopHocPhan p : arrayList) {
                if (p.getProName().equals(name)) {
                    System.out.println(p);
                }
            }
        }
    }
}
