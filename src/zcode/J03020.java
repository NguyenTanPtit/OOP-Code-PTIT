package zcode;

import java.util.Scanner;

public class J03020 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String [] ds= new String[1000];
        int n=0;
        int[] dem =new int[1000];
        while (s.hasNext()){
            String tmp = s.next();
            if(thuanNghich(tmp)){
                int t = tim(tmp, ds, n);
                if(t == -1){
                    ds[n] = tmp;
                    dem[n] = 1;
                    n++;
                } else{
                    dem[t]++;
                }
            }
        }
        int max = 0;
        for(int i=0;i<n;i++){
            if(ds[i].length() > max) max = ds[i].length();
        }
        for(int i=0;i<n;i++){
            if(ds[i].length() == max){
                System.out.println(ds[i] + " " + dem[i]);
            }
        }
    }
    public static boolean thuanNghich(String s){
        StringBuilder rs = new StringBuilder(s);
        rs.reverse();
        return s.equals(rs.toString());
    }
    public static int tim(String s, String[] ds, int n){
        for(int i=0;i<n;i++){
            if(s.equals(ds[i])) return i;
        }
        return -1;
    }
}
