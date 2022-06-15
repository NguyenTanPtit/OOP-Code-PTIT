package J04018;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t= Integer.parseInt(s.nextLine());
        while (t-->0){
            SoPhuc A = new SoPhuc(Integer.parseInt(s.next()),Integer.parseInt(s.next()));
            SoPhuc B = new SoPhuc(Integer.parseInt(s.next()),Integer.parseInt(s.next()));
            SoPhuc res1= A.add(B);
            res1=res1.mul(A);
            SoPhuc res2=A.add(B);
            res2=res2.mul(res2);
            System.out.println(res1+", "+res2);
        }
    }
}
