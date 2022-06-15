package tinh_thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        s.nextLine();
        Club[]clubs= new Club[n];
        for(int i=0;i<n;i++){
            String id=s.nextLine();
            String name=s.nextLine();
            int price=s.nextInt();
            clubs[i]= new Club(id,name,price);
            s.nextLine();
        }
        int Q=s.nextInt();
        s.nextLine();
        Match[] matches=new Match[Q];
        for(int i=0;i<Q;i++){
            String id=s.next();
            int people =s.nextInt();
            s.nextLine();
            for(int k=0;k<n;k++){
                if(id.substring(1,3).equals(clubs[k].getId())){
                    matches[i]= new Match(id,clubs[k].getName(),people*clubs[k].getPrice());
                }
            }
        }
        Arrays.sort(matches);
        for(Match i:matches){
            System.out.println(i);
        }
    }
}
