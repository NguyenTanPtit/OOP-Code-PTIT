package J01015;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        while (n-->0){
            boolean check=true;
            String s1 =s.nextLine();
            for (int i =0 ; i<s1.length();i++){
                if(s1.charAt(i)!='1'&&s1.charAt(i)!='0'&&s1.charAt(i)!='2'){
                    check= false;
                    break;
                }
            }
            if(check) System.out.println("YES");
            else System.out.println("NO");
        }
    }

}
