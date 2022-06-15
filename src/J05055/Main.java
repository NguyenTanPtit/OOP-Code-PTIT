package J05055;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        ArrayList<Athlete> athletes= new ArrayList<>();
        int i=1;
        while (t-->0){
            athletes.add(new Athlete(i,s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine()));
            i++;
        }
        for (Athlete a : athletes){
            a.setRank(rank(athletes,a));
        }
        Collections.sort(athletes);
        for (Athlete a : athletes){
            System.out.println(a);
        }
    }
    static int rank(ArrayList<Athlete> list,Athlete a) {
        int count=1;
        for (Athlete athlete:list){
            if(!a.equals(athlete)){
                if(a.achievement().compareTo(athlete.achievement())>0){
                    count++;
                }
            }
        }
        return count;
    }
}
