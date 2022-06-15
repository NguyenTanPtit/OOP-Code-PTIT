package J07021;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("DATA.in"));
        while (s.hasNextLine()){
            String name = s.nextLine();
            if(name.equals("END"))
                break;
            System.out.println(chuanHoa(name));
        }
    }
    static String chuanHoa(String s){
        String name = s.trim().toLowerCase();
        String [] tu = name.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String value : tu) {
            res.append(Character.toUpperCase(value.charAt(0))).append(value.substring(1)).append(" ");
        }
        return res.toString();
    }
}
