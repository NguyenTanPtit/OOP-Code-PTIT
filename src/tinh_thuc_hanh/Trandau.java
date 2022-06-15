package tinh_thuc_hanh;

public class Trandau implements Comparable<Trandau>{
    private String ma;
    private String name;
    private int doanhthu;

    public String getMa() {
        return ma;
    }

    public String getName() {
        return name;
    }


    public Trandau(String ma, String name, int doanhthu) {
        this.ma = ma;
        this.name = name;
        this.doanhthu = doanhthu;
    }

    @Override
    public int compareTo(Trandau o) {
        if(this.doanhthu==o.doanhthu){
            return this.ma.compareTo(o.ma);
        }
        return o.doanhthu-this.doanhthu;
    }
}
