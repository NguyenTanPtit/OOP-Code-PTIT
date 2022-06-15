package zcode;

import java.util.Scanner;

public class J02023 {
    public static void largest(int s,int n){
        StringBuilder res= new StringBuilder();
            while (s >= 9 ) {
                res.append('9');
                s -= 9;
                n--;
            }
            res.append(s);
            while (n>1){
                res.append('0');
                n--;
            }
            System.out.println(res);

    }
    public  static void smallest(int s,int n){
        StringBuilder res=new StringBuilder();
        s-=1;
        while (s>=9){
            res.append("9");
            s-=9;
        }
        if(res.length() == n-1)
            res.insert(0, s + 1);
        else {
            res.insert(0,s);
            while (res.length() < n - 1)
                res.insert(0, "0");
            res.insert(0, "1");
        }
        System.out.print(res+" ");
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int sum=s.nextInt();
        if(sum>(9*n)||(sum==0&&n>1) )
            System.out.println(-1+ " "+-1);
        else if(sum==0&&n==1) {
            System.out.println(0 + " " + 0);
        }
        else
            {
                smallest(sum,n);
                largest(sum,n);
            }
    }

}
