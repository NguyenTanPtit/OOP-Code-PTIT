package J07040;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream s1 = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        Scanner s2 = new Scanner(new File("VANBAN.in"));
        ArrayList<String> arr1= (ArrayList<String>) s1.readObject();
        Set<String> set2= new LinkedHashSet<>();
        Set<String> set1= new HashSet<>();
        while (s2.hasNext()){
            set2.add(s2.next().toLowerCase());
        }
        for(String i : arr1){
            String[] strings= i.split("\\s+");
            for (String s:strings){
                set1.add(s.toLowerCase());
            }
        }
        for(String i :set2){
            if(set1.contains(i)){
                System.out.println(i);
            }
        }
    }
}
