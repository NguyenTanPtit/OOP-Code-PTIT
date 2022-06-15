package J01025;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] x = new int[4];
        int [] y = new int[4];
        for(int i =0 ;i<4;i++){
            x[i] = s.nextInt();
            y[i] =s.nextInt();
        }
        if(kc(x)>kc(y)) System.out.println(kc(x)*kc(x));
        else System.out.println(kc(y)*kc(y));
    }
    static int kc(int [] a){
        int max=0;
        for(int i =0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(Math.abs(a[i]-a[j])>max){
                    max=Math.abs(a[i]-a[j]);
                }
            }
        }
        return max;
    }
}
