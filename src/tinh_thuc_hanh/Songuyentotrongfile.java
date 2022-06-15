package tinh_thuc_hanh;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Songuyentotrongfile {
    public static void main(String[] args) throws IOException {
        DataInputStream s = new DataInputStream(new FileInputStream("DATA.in"));
        int [] a = new int[1000000];
        for(int i =0 ;i<100000;i++){
            int n = s.readInt();
            if(check(n)) {
                a[n]++;
            }
        }
        for (int i = a.length-1;i>=0;i--){
            if(a[i]>0){
                System.out.println(i+ " "+ a[i]);
            }
        }
    }
    static boolean check(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
