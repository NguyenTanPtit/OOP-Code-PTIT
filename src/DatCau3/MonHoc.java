package DatCau3;

public class MonHoc implements Comparable<MonHoc>{
    private String ma, ten, lythuyet, thuchanh;
    private int tin;

    public MonHoc(String ma, String ten, int tin, String lythuyet, String thuchanh) {
        this.ma = ma;
        this.ten = ten;
        this.lythuyet = lythuyet;
        this.thuchanh = thuchanh;
        this.tin = tin;
    }

    public String getThuchanh() {
        return thuchanh;
    }

    @Override
    public int compareTo(MonHoc o) {
        return this.ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+tin+" "+lythuyet+" "+thuchanh;
    }
}
