package J04014;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        while (t-- > 0) {
            PhanSo A = new PhanSo(s.nextInt(), s.nextInt());
            PhanSo B = new PhanSo(s.nextInt(), s.nextInt());
            PhanSo C = A.add(B);
            C = C.mul(C);
            PhanSo D = A.mul(B).mul(C);
            D = D.rutGon();
            C = C.rutGon();
            System.out.println(C + " " + D);
        }
    }
}
