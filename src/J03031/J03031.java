package J03031;

import java.util.HashSet;
import java.util.Scanner;

public class J03031 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        while (t-->0){
            String str = s.nextLine();
            int k = Integer.parseInt(s.nextLine());
            System.out.println(check(str,k));
        }
    }
    static String check(String s,int k){
        HashSet<Character> characters = new HashSet<>();
        for (int i =0;i<s.length();i++){
            characters.add(s.charAt(i));
        }
        if(characters.size()+k>=26){
            return "YES";
        }
        return "NO";
    }
}
