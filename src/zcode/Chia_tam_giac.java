package zcode;

import java.util.Scanner;

public class Chia_tam_giac {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- >0){
            int n= s.nextInt(),h=s.nextInt();
            for (int i=1;i<n;i++){
                System.out.printf("%.6f ",h*(Math.sqrt((double) i/n)));
            }
            System.out.println();
        }
    }
}
