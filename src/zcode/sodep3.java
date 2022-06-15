package zcode;

import java.util.Scanner;

public class sodep3 {
    public static boolean ngto(int n) {
        if(n<2) return false;
        for (int i=2;i<Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- >0){
            int dem=0;
            String s1= s.next();
            for(int i=0;i<=s1.length()/2;i++){
                if(s1.charAt(i)!=s1.charAt(s1.length()-i-1)|| !ngto(s1.charAt(i) - '0')){
                    dem++;
                    break;
                }
            }
            if (dem==0)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
