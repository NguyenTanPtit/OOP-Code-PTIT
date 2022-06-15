package dinh_thuc_hanh;

import java.util.Scanner;

public class Bo_sung_day_so {
    public static void main(String[] args) {
        Scanner s= new Scanner( System.in);
        int n= s.nextInt();
        int count=0,k=1;
        int [] a= new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        if(k<a[0]){
            count++;
            for(int i=1;i<a[0];i++){
                System.out.println(i);
            }
        }
        for(int i=0;i<n-1;i++){
            if(a[i]+1<a[i+1]){
                count++;
                System.out.println(a[i]+1);
                a[i]+=1;
                i--;
            }
        }
        if(count==0) System.out.println("Excellent!");
    }
}
