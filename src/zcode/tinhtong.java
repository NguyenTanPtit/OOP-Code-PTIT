package zcode;

import java.util.Scanner;

public class tinhtong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t>0&&t<=10){
            long n= s.nextLong();

            System.out.println(n*(n+1)/2);
            t--;
        }
    }
}
