package zcode;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class J03009 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t= s.nextInt();
        s.nextLine();
        while (t-->0){
            String [] s1= s.nextLine().split(" ");
            String [] s2=s.nextLine().split(" ");
            SortedSet<String> mystr1 = new TreeSet<>(Arrays.asList(s1));
            SortedSet<String> mystr2 = new TreeSet<>(Arrays.asList(s2));
            for(String ms:mystr1){
                if(!mystr2.contains(ms))
                    System.out.print(ms+" ");
            }
            System.out.println();
        }
    }
}
