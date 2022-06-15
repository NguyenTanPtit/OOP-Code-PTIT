package zcode;

import java.util.Scanner;

public class Cat_doi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            long s=sc.nextLong();
            String s1=String.valueOf(s);
            StringBuilder s2=new StringBuilder();
            boolean check=true;
            for(int i=0;i<s1.length();i++){

                if(s1.charAt(i)=='8'||s1.charAt(i)=='9'||s1.charAt(i)=='0'){
                    s2.append('0');
                }
                else if(s1.charAt(i)=='1'){
                    s2.append('1');
                }
                else {
                    check=false;
                    break;
                }
            }
            String s3 =s2.toString();
            if(!check ||Long.parseLong(s3)==0){
                System.out.println("INVALID");
            }
            else {
                System.out.println(Long.parseLong(s3));
            }
        }
    }
}
