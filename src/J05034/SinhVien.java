package J05034;

public class SinhVien implements Comparable<SinhVien>{
    private int stt;
    private String id;
    private String name;
    private String lop;
    private String email;
    private String company;

    public SinhVien(int stt, String id, String name, String lop, String email, String company) {
        this.stt = stt;
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return stt+" "+id+" "+name+" "+lop+" "+email+" "+company;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.id.compareTo(o.id);
    }
}
