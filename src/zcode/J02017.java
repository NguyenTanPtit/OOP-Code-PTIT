package zcode;

import java.util.*;

public class J02017 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        int n=s.nextInt();
        Integer [] a= new Integer[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(a));
        while (!check(b)) {
            for (int i = 0; i < b.size()-1; i++) {
                if ((b.get(i) + b.get(i+1)) % 2 == 0) {
                    b.remove(i);
                    b.remove(i++);
                }
            }
        }

        System.out.println(b.size());
    }
    public static boolean check(ArrayList<Integer> a){
        for(int i=0;i< a.size()-1;i++){
            if((a.get(i) + a.get(i + 1))%2==0){
               return false; 
            }
        }
        return true;
    }
}
