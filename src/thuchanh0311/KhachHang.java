package thuchanh0311;

import java.util.*;
import java.text.*;

public class KhachHang implements Comparable<KhachHang>{
    private final String maKH;
    private final String tenKh;
    private final String gioiTinh;
    private final String diaChi;
    private final Date ngaySinh;

    public KhachHang(int id, String tenKh, String gioiTinh, String ngaySinh, String diaChi) throws ParseException {
        this.maKH = "KH" + String.format("%03d",id);
        this.tenKh = tenKh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
    }
    private String chuanHoa(){
        StringBuilder s= new StringBuilder();
        StringTokenizer s1=new StringTokenizer(this.tenKh.toLowerCase());
        while (s1.hasMoreTokens()){
            String str = s1.nextToken();
            s.append(Character.toUpperCase(str.charAt(0)));
            for(int i=1;i<str.length();i++){
                s.append(str.charAt(i));
            }
            s.append(" ");
        }

        return s.toString().trim();
    }
    @Override
    public int compareTo(KhachHang o) {
        if(this.ngaySinh.before(o.ngaySinh)) return -1;
        else if(this.ngaySinh.equals(o.ngaySinh))return 0;
        else return 1;
    }
    @Override
    public String toString(){
        return maKH+" "+ chuanHoa()+" "+gioiTinh+" "+diaChi+" "+new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh);
    }
}
