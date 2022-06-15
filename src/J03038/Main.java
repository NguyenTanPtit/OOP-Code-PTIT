package J03038;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        Set<Character> set = new HashSet<>();
        for (int i =0 ;i <s1.length();i++){
             set.add(s1.charAt(i));
        }
        System.out.println(set.size());
    }
}
