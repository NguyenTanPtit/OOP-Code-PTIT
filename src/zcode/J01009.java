package zcode;

import java.util.Scanner;

public class J01009 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        long sum=0;
        for(int i=1;i<=n;i++){
            sum+=factorial(i);
        }
        System.out.println(sum);
    }
    public static  long factorial(int i){
        long fact = 1;
        for (int k = 2; k <= i; k++) {
            fact = fact * k;
        }
        return fact;
    }
}
