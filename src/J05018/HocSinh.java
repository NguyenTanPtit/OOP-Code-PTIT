package J05018;

public class HocSinh implements Comparable<HocSinh>{
    private String id;
    private String name;
    private float toan,van,anh,ly,hoa,sinh,su,dia,congdan,congnghe;

    public HocSinh(int id, String name, float toan, float van, float anh, float ly, float hoa, float sinh, float su, float dia, float congdan, float congnghe) {
        this.id = String.format("%02d",id);
        this.name = name;
        this.toan = toan;
        this.van = van;
        this.anh = anh;
        this.ly = ly;
        this.hoa = hoa;
        this.sinh = sinh;
        this.su = su;
        this.dia = dia;
        this.congdan = congdan;
        this.congnghe = congnghe;
    }


    private float average(){
        return (float) Math.round((((toan*2+van*2+anh+ly+hoa+sinh+su+dia+congdan+congnghe)/12)*10))/10;
    }
    private String rank(){
        if(average()>=9){
            return "XUAT SAC";
        }
        if (average()>=8)
            return "GIOI";
        if (average()>=7)
            return "KHA";
        if(average()>=5)
            return "TB";
        return "YEU";
    }
    @Override
    public String toString() {

        return "HS"+id+" "+name+" "+String.format("%.1f",average())+" "+rank();
    }

    @Override
    public int compareTo(HocSinh o) {
        if(this.average()==o.average()){
         return this.id.compareTo(o.id);
        }
        return Float.compare(o.average(),this.average());
    }
}
