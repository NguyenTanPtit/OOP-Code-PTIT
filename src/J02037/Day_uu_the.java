package J02037;

import java.util.Scanner;

public class Day_uu_the {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        while (n-- > 0) {
            String[] str = in.nextLine().trim().split(" ");
            int dem = 0;
            for (String s : str) {
                if (Integer.parseInt(s) % 2 == 0)
                    dem++;
                else dem--;
            }

            if (dem > 0 && str.length % 2 == 0
                    || dem < 0 && str.length % 2 == 1) {
                System.out.println("YES");
            } else System.out.println("NO");
        }
    }
}
