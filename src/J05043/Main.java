package J05043;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        ArrayList<Staff> staff = new ArrayList<>();
        int i = 1;
        while (t-- > 0) {
            staff.add(new Staff(i, s.nextLine(), s.nextLine(), Integer.parseInt(s.nextLine()), Integer.parseInt(s.nextLine())));
            i++;
        }
        Collections.sort(staff);
        for (Staff staff1 : staff) {
            System.out.println(staff1);
        }
    }
}
