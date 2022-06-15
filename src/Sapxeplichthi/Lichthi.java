package Sapxeplichthi;



public class Lichthi implements Comparable<Lichthi>{
    private Cathi cathi ;
    private Monthi monthi;
    private String idca,idmon,nhom,soluong;

    public Lichthi(String idca, String idmon, String nhom, String soluong) {
        this.idca = idca;
        this.idmon = idmon;
        this.nhom = nhom;
        this.soluong = soluong;
    }

    public String getIdca() {
        return idca;
    }

    @Override
    public String toString() {
        return cathi+" "+monthi+" "+nhom+" "+soluong;
    }

    public String getIdmon() {
        return idmon;
    }

    public void setCathi(Cathi cathi) {
        this.cathi = cathi;
    }

    public void setMonthi(Monthi monthi) {
        this.monthi = monthi;
    }

    @Override
    public int compareTo(Lichthi o) {
        return this.cathi.compareTo(o.cathi);
    }
}
