package J07014;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
    private String fileName;

    public WordSet(String fileName) {
        this.fileName = fileName;
    }
    public String intersection(WordSet b) throws FileNotFoundException {
        Scanner s1 = new Scanner(new File(this.fileName));
        Scanner s2 = new Scanner(new File(b.fileName));
        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2= new ArrayList<>();
        while (s1.hasNext()){
            arrayList1.add(s1.next().toLowerCase());
        }
        while (s2.hasNext()){
            arrayList2.add(s2.next().toLowerCase());
        }
        TreeSet<String> res = new TreeSet<>();
        for (String str: arrayList1){
            if(arrayList2.contains(str)){
                res.add(str);
            }
        }
        StringBuilder res1 = new StringBuilder();
        for (String str: res){
            res1.append(str).append(" ");
        }
        return res1.toString();
    }
    public String union (WordSet b ) throws FileNotFoundException {
        Scanner s1 = new Scanner(new File(this.fileName));
        Scanner s2 = new Scanner(new File(b.fileName));
        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2= new ArrayList<>();
        while (s1.hasNext()){
            arrayList1.add(s1.next().toLowerCase());
        }
        while (s2.hasNext()){
            arrayList2.add(s2.next().toLowerCase());
        }
        TreeSet<String> res = new TreeSet<>();
        res.addAll(arrayList1);
        res.addAll(arrayList2);
        StringBuilder res1 = new StringBuilder();
        for (String str: res){
            res1.append(str).append(" ");
        }
        return res1.toString();
    }
}
