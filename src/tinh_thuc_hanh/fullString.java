package tinh_thuc_hanh;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class fullString {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        while (n-->0){
            boolean check=false;
            String s1=s.next();
            int k= s.nextInt();
            s.nextLine();
            Set<Character> set=new LinkedHashSet<>();
            for(int i=0;i<s1.length();i++){
                set.add(s1.charAt(i));
                if(k+set.size()>=26){
                    System.out.println("YES");
                    check=true;
                    break;
                }
            }
            if(!check){
                System.out.println("NO");
            }
        }
    }
}
