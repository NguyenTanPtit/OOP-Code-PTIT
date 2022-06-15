package Dat_thuc_hanh;

public class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String id;
    private String name;
    private int sosV;

    public DoanhNghiep(String id, String name, int sosV) {
        this.id = id;
        this.name = name;
        this.sosV = sosV;
    }

    @Override
    public String toString() {
        return id +" "+name+" "+sosV;
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        return this.id.compareTo(o.id);
    }
}
