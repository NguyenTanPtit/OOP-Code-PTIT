package J07016;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream s1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream s2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>) s1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) s2.readObject();
        TreeMap<Integer,Integer> res1= new TreeMap<>();
        TreeMap<Integer,Integer> res2= new TreeMap<>();
        for (Integer i: arr1){
            if(check(i)){
                if(res1.containsKey(i)){
                    res1.put(i,res1.get(i)+1);
                }else res1.put(i,1);
            }
        }
        for (Integer i: arr2){
            if(check(i)){
                if(res2.containsKey(i)){
                    res2.put(i,res2.get(i)+1);
                }else res2.put(i,1);
            }
        }
        ArrayList<Integer> res3 = new ArrayList<>(res1.keySet());
        Collections.sort(res3);
        for (Integer i : res3){
            if(res1.containsKey(i)&&res2.containsKey(i)){
                System.out.println(i+" "+res1.get(i)+" "+res2.get(i));
            }
        }
    }
    public static boolean check(Integer n){
        if(n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n);i++){
            if(n % i ==0)
                return false;
        }
        return true;
    }
}
