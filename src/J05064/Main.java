package J05064;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        ArrayList<Professor> professors = new ArrayList<>();
        while (t-- > 0) {
            Professor p = new Professor(s.nextLine(), s.nextLine(), Integer.parseInt(s.nextLine()));
            int HT = countHT(professors);
            int HP = countHP(professors);
            if (HT < 1 && HP < 2) {
                professors.add(p);
            } else if (HT == 1 && HP < 2) {
                if (!p.getId().startsWith("HT"))
                    professors.add(p);
            } else if (HT == 1 && HP == 2) {
                if (!p.getId().startsWith("HT") && !p.getId().startsWith("HP"))
                    professors.add(p);
            }
        }
        for (Professor p : professors) {
            System.out.println(p);
        }

    }

    private static int countHT(ArrayList<Professor> professors) {
        int count = 0;
        for (Professor p : professors) {
            if (p.getId().startsWith("HT")) {
                count++;
            }
        }
        return count;
    }

    private static int countHP(ArrayList<Professor> professors) {
        int count = 0;
        for (Professor p : professors) {
            if (p.getId().startsWith("HP")) {
                count++;
            }
        }
        return count;
    }
}
