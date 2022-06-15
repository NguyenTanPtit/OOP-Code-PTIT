package zcode;

import java.util.Scanner;

public class diem_can_bang {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        int []a= new int[100000];
        while (t-- >0){
            int n= s.nextInt();
            for(int i=0;i<n;i++){
                a[i]=s.nextInt();
            }
            System.out.println(cb(a,n));
        }
    }

    public static int cb(int []a,int n ) {
        int sum=0,lsum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        for(int i=0;i<n;i++){
            sum-=a[i];
            if(sum==lsum)
                return i+1;
            lsum+=a[i];
        }
        return -1;
    }

}
