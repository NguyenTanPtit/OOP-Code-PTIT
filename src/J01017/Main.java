package J01017;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        while (n-->0){
            boolean check = true;
            String s1 = s.nextLine();
            for (int i =0 ;i<s1.length()-1;i++){
                if(Math.abs((int) s1.charAt(i)-(int) s1.charAt(i+1))!=1){
                    check = false;
                    System.out.println("NO");
                    break;
                }
            }
            if(check) System.out.println("YES");
        }
    }
}
