package zcode;

import java.util.Scanner;

public class so_dep1 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0){
            String s1 = s.next();
            int dem=0;
            for(int i=0;i<=(s1.length())/2;i++){
                if(s1.charAt(i)!=s1.charAt(s1.length()-1-i)||(s1.charAt(i)-'0')%2!=0){
                    dem++;
                    break;
                }
            }
            if(dem==0){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
    }
}
