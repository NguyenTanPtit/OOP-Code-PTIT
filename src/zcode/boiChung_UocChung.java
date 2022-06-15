package zcode;

import java.util.Scanner;

public class boiChung_UocChung {
    public static long  uoc(long a,long b){
        while (a!=b){
            if(a>b){
                a-=b;
            }
            else b-=a;
        }
        return a;
    }
    public static long boi(long a,long b){
        return a*b/uoc(a,b);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t= s.nextInt();
        while (t-- >0){
            long a= s.nextLong();
            long b = s.nextLong();
            System.out.println(boi(a,b)+" "+uoc(a,b));
        }
    }
}
