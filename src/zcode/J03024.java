package zcode;

import java.util.Scanner;

public class J03024 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t= s.nextInt();
        s.nextLine();
        while (t-->0) {
            int demchan = 0, demle = 0;
            boolean check = true;
            String s1 = s.next();
            for (int i = 0; i < s1.length(); i++) {
                if (Character.isLetter(s1.charAt(i))) {
                    check = false;
                    break;
                }
                if ((s1.charAt(i) - '0') % 2 == 0) {
                    demchan++;
                }
                if ((s1.charAt(i) - '0') % 2 == 1) {
                    demle++;
                }
            }
            if (!check) {
                System.out.println("INVALID");
            } else {
                if ((demchan > demle && s1.length() % 2 == 0) ||(demle>demchan&&s1.length()%2==1)){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
        }
    }
}
