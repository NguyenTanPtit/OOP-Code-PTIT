package J05011;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        player[] pl=new player[n];
        for(int i=0;i<n;i++){
            String id=s.nextLine();
            String name =s.nextLine();
            String begin=s.nextLine();
            String end=s.nextLine();
            pl[i]= new player(id,name,begin,end);
        }
        Arrays.sort(pl);
        for(int i=0;i<n;i++){
            System.out.println(pl[i]);
        }
    }
}
