package J07028;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s1 = new Scanner(new File("MONHOC.in"));
        Scanner s2 = new Scanner(new File("GIANGVIEN.in"));
        Scanner s3 = new Scanner(new File("GIOCHUAN.in"));
        int t1 = Integer.parseInt(s1.nextLine());
        ArrayList<MonHoc> monHocs = new ArrayList<>();
        while (t1-- > 0) {
            monHocs.add(new MonHoc(s1.next(), s1.next()));
            s1.nextLine();
        }
        int t2 = Integer.parseInt(s2.nextLine());
        ArrayList<GiangVien> giangViens = new ArrayList<>();
        while (t2-- > 0) {
            giangViens.add(new GiangVien(s2.next(), s2.nextLine().trim()));
        }
        int t3 = Integer.parseInt(s3.nextLine());
        ArrayList<GioChuan> gioChuans = new ArrayList<>();
        while (t3-- > 0) {
            gioChuans.add(new GioChuan(searchGV(giangViens, s3.next()), searchMH(monHocs, s3.next()), Float.parseFloat(s3.next())));
            s3.nextLine();
        }
        HashMap<String, Float> res = new LinkedHashMap<>();
        for (GioChuan gc : gioChuans) {
            if (res.containsKey(gc.getPro().getId())) {
                res.put(gc.getPro().getId(), res.get(gc.getPro().getId()) + gc.getTime());
            } else res.put(gc.getPro().getId(), gc.getTime());
        }
        for (String id : res.keySet()) {
            System.out.println(searchGV(giangViens, id) + " " + String.format("%.2f", res.get(id)));
        }
    }

    static MonHoc searchMH(ArrayList<MonHoc> mh, String id) {
        for (MonHoc monHoc : mh) {
            if (monHoc.getId().equals(id))
                return monHoc;
        }
        return null;
    }

    static GiangVien searchGV(ArrayList<GiangVien> gv, String id) {
        for (GiangVien giangVien : gv) {
            if (giangVien.getId().equals(id))
                return giangVien;
        }
        return null;
    }
}
