package J07022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("DATA.in"));
        List<String> list = new ArrayList<>();
        while (s.hasNext()){
            if(s.hasNextInt())
                s.nextInt();
            else list.add(s.next());
        }
        Collections.sort(list);
        for (String s1 : list){
            System.out.print(s1+" ");
        }
    }
}
