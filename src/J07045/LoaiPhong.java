package J07045;

public class LoaiPhong implements Comparable<LoaiPhong>{
    private String phong;

    public LoaiPhong(String phong) {
        this.phong = phong;
    }

    @Override
    public String toString() {
        return phong;
    }
    private String name(){
        String[] t = phong.split(" ");
        return t[1];
    }
    @Override
    public int compareTo(LoaiPhong o) {

        return this.name().compareTo(o.name()) ;
    }
}
