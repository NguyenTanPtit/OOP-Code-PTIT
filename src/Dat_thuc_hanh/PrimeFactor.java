package Dat_thuc_hanh;

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner s= new Scanner( System.in);
        int k=s.nextInt(),p=s.nextInt();
        if(Math.pow(p,k)>Math.pow(10,9)){
            System.out.println(0);
        }
        else System.out.println(Math.pow(p,k));
    }
}
