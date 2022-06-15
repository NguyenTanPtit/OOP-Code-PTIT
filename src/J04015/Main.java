package J04015;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner( System.in);
        Professor professor = new Professor(s.nextLine(),s.nextLine(),Long.parseLong(s.nextLine()));
        System.out.println(professor);
    }
}
