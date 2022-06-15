package J01016;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count4 = 0, count7=0;
        String s1 = s.nextLine();
        for (int i =0;i<s1.length();i++){
            if(s1.charAt(i)=='4') count4++;
            if(s1.charAt(i)=='7') count7++;
        }
        if(count4+count7==4||count7+count4==7){
            System.out.println("YES");
        }else System.out.println("NO");
    }
}
