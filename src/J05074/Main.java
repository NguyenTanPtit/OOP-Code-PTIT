package J05074;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        int n =t;
        ArrayList<Student> students = new ArrayList<>();
        while (t-- > 0) {
            students.add(new Student(s.nextLine(), s.nextLine(), s.nextLine()));
        }
        while (n-- > 0) {
            String id = s.next();
            String dd = s.next();
            for (Student st : students) {
                if (st.getId().equals(id))
                    st.setDiemCC(scoreFinal(dd));
            }
            s.nextLine();
        }
        String lop = s.nextLine();
        for (Student st : students) {
            if(st.getLop().equals(lop))
                System.out.println(st);
        }
    }

    public static int scoreFinal(String s) {
        int diemCC = 10;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'v')
                diemCC -= 2;
            if (s.charAt(i) == 'm')
                diemCC -= 1;
        }
        if (diemCC <= 0)
            diemCC = 0;
        return diemCC;
    }
}
