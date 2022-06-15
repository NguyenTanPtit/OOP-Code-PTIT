package J03032;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        while (t-->0){
            String s1 =s.nextLine();
            String[] strings = s1.split(" ");
            for (String string : strings) {
                StringBuilder stringBuilder = new StringBuilder(string);
                System.out.print(stringBuilder.reverse()+" ");
            }
            System.out.println();
        }
    }
}
