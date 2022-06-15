package J05032;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        People []pp= new People[n];
        for(int i=0;i<n;i++){
            String name=s.next();
            String dob=s.nextLine();
            pp[i]=new People(name,dob);
        }
        Arrays.sort(pp);
        System.out.println(pp[0]);
        System.out.println(pp[pp.length-1]);
    }
}
