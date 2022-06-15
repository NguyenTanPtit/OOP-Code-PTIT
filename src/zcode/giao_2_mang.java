package zcode;

import java.util.*;

public class giao_2_mang {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [] a= new int[n+1];
        int []b=new  int[m+1];
        SortedSet<Integer>s= new TreeSet<>();
        SortedSet<Integer>k=  new TreeSet<>();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            s.add(a[i]);
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
            k.add(b[i]);
        }
        for(int i:s){
            if(k.contains(i)){
                System.out.print(i+" ");
            }
        }

    }
}
