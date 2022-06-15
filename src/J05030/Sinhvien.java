package J05030;

public class Sinhvien implements Comparable<Sinhvien>{
    private String id;
    private String name;
    private String lop;
    private float diem1,diem2,diem3;

    public Sinhvien(String id, String name, String lop, float diem1, float diem2, float diem3) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.diem1 = (float) Math.round(diem1*10)/10;
        this.diem2 = (float) Math.round(diem2*10)/10;
        this.diem3 = (float) Math.round(diem3*10)/10;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+lop+" "+String.format("%.1f",diem1)+" "+String.format("%.1f",diem2)+" "+String.format("%.1f",diem3);
    }

    @Override
    public int compareTo(Sinhvien o) {
        return this.name.compareTo(o.name);
    }
}
