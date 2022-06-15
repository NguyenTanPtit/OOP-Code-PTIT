package zcode;

import java.util.Scanner;

public class Chuan_hoa_ten1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        while (t-- > 0) {
            String s1 = s.nextLine().toLowerCase().trim();
            StringBuilder str = new StringBuilder(s1);
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ' && str.charAt(i + 1) == ' ') {
                    str.deleteCharAt(i);
                    i--;
                }
            }
            String a = new String(str);
            char [] Char=a.toCharArray();
            boolean dc= true;
            for(int i=0;i<a.length();i++){
                if(Character.isLetter(Char[i])){
                    if(dc){
                        Char[i]=Character.toUpperCase(Char[i]);
                        dc=false;
                    }
                }
                else {
                    dc=true;
                }
            }
            a=String.valueOf(Char);
            System.out.println(a);
        }
    }
}
