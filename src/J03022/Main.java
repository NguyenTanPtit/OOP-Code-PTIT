package J03022;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder res = new StringBuilder();
        while (s.hasNext()){
            res.append(s.nextLine());
        }
        String[] ans = res.toString().trim().replaceAll("\\s+"," ").toLowerCase().split("[.?!]");
        for (String s1:ans){
            String t= s1.trim();
            System.out.println(t.toUpperCase().charAt(0)+t.substring(1)+" ");
        }
    }
}
