package J04021;

import java.util.TreeSet;

public class IntSet {
    private int[] a;

    public IntSet(int[] a) {
        this.a = a;
    }

    public IntSet union(IntSet b) {
        TreeSet<Integer> res = new TreeSet<>();
        for (Integer i : this.a) {
            res.add(i);
        }
        for (Integer i : b.a) {
            res.add(i);
        }
        int[] re = new int[res.size()];
        int j = 0;
        for (Integer i : res) {
            re[j++] = i;
        }
        return new IntSet(re);
    }
    public IntSet intersection(IntSet b){
        TreeSet<Integer> set1= new TreeSet<>();
        TreeSet<Integer> set2 =  new TreeSet<>();
        TreeSet<Integer> res = new TreeSet<>();
        for (Integer i : this.a) {
            set1.add(i);
        }
        for (Integer i : b.a) {
            set2.add(i);
        }
        for (Integer i : set1){
            if(set2.contains(i)){
                res.add(i);
            }
        }
        int[] re = new int[res.size()];
        int j = 0;
        for (Integer i : res) {
            re[j++] = i;
        }
        return new IntSet(re);
    }
    @Override
    public String toString() {
        for (Integer i : a){
            System.out.print(i +" ");
        }
        return "";
    }
}
