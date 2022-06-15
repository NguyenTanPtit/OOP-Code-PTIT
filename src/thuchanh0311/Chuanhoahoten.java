package thuchanh0311;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Chuanhoahoten {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("DATA.in"));
        while (s.hasNextLine()){
            String s1 = s.nextLine();
            if(s1.equals("END")) break;
            System.out.println(chuanHoa(s1));
        }
    }
    static  String chuanHoa(String name){
        StringBuilder s= new StringBuilder();
        StringTokenizer s1=new StringTokenizer(name.toLowerCase());
        while (s1.hasMoreTokens()){
            String str = s1.nextToken();
            s.append(Character.toUpperCase(str.charAt(0)));
            for(int i=1;i<str.length();i++){
                s.append(str.charAt(i));
            }
            s.append(" ");
        }

        return s.toString().trim();
    }
}
