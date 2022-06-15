package J05018;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        s.nextLine();
        HocSinh []hs= new HocSinh[n];
        for(int i=0;i<n;i++){
            int id=i+1;
            String name =s.nextLine();
            float toan=s.nextFloat(),van=s.nextFloat(),anh=s.nextFloat(),ly=s.nextFloat(),hoa=s.nextFloat(),sinh=s.nextFloat(),su=s.nextFloat(),dia=s.nextFloat(),congdan=s.nextFloat(),congnghe=s.nextFloat();
            s.nextLine();
            hs[i]=new HocSinh(id,name,toan,van,anh,ly,hoa,sinh,su,dia,congdan,congnghe);
        }
        Arrays.sort(hs);
        for(int i=0;i<n;i++){
            System.out.println(hs[i]);
        }
    }
}
