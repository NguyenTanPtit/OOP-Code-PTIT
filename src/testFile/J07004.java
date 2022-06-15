package testFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07004 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("DATA.in"));
        HashMap<Integer,Integer> map = new HashMap<>();
        while (s.hasNextInt()){
            int u = s.nextInt();
            if(map.containsKey(u)){
                map.put(u,map.get(u)+1);
            }
            else {
                map.put(u,1);
            }
        }
        TreeMap<Integer, Integer> treeMap = new TreeMap<>(map);
        for ( Integer i : treeMap.keySet()){
            System.out.println(i+" "+treeMap.get(i));
        }
    }
}
