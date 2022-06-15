package zcode;

import java.util.Scanner;
import java.util.ArrayList;
public class helloworld {
    static ArrayList<String> arr=new ArrayList<String>();
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0){
            String s1=sc.nextLine().toLowerCase().trim();
            s1=s1.replaceAll("\\s\\s+", " ");
            bd(s1);
        }
        for (int i=0; i<arr.size(); i++) {
            int dem=1;
            for(int j=0;j<i;j++){
                if (arr.get(i).equals(arr.get(j))) dem++;
            }
            if (dem==1) System.out.println(arr.get(i)+"@ptit.edu.vn");
            else System.out.println(arr.get(i)+dem+"@ptit.edu.vn");
        }
    }
    public static void bd(String s){
        StringBuilder ans=new StringBuilder();
        for (int i=s.length()-1; i>=0; i--){
            if (s.charAt(i)==' '){
                break;
            }
            else{
                ans.append(s.charAt(i));
            }


            for (int j=1;j<i;j++){
                if (s.charAt(j)==' '){
                    ans.append(s.charAt(j+1));
                }
            }
            arr.add(ans.toString());
        }
    }
}
