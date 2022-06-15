package J04022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class WordSet {
    private String s;

    public WordSet(String s) {
        this.s = s;
    }
    public String intersection(WordSet b){
        String[] a1;
        a1 = this.s.toLowerCase().split(" ");
        String[] a2;
        a2= b.s.toLowerCase().split(" ");
        ArrayList< String> arrayList1= new ArrayList<>();
        Collections.addAll(arrayList1, a1);
        ArrayList< String> arrayList2= new ArrayList<>();
        Collections.addAll(arrayList2, a2);
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
    public String union (WordSet b ){
        String[] a1;
        a1 = this.s.toLowerCase().split(" ");
        String[] a2;
        a2= b.s.toLowerCase().split(" ");
        ArrayList< String> arrayList1= new ArrayList<>();
        Collections.addAll(arrayList1, a1);
        ArrayList< String> arrayList2= new ArrayList<>();
        Collections.addAll(arrayList2, a2);
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
