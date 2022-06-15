package DatCau3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(input.nextLine());
        ArrayList <MonHoc> ds = new ArrayList<>();
        while (t-->0){
            ds.add(new MonHoc(input.nextLine(),input.nextLine(),Integer.parseInt(input.nextLine()),input.nextLine(),input.nextLine()));
        }
        ArrayList<MonHoc> res = new ArrayList<>();
        for (MonHoc mh : ds){
            String s = mh.getThuchanh();
            if(s.equals("Truc tuyen")|| s.contains(".ptit.edu.vn")){
                res.add(mh);
            }
        }
        Collections.sort(res);
        for (MonHoc mh : res){
            System.out.println(mh);
        }
    }
}
