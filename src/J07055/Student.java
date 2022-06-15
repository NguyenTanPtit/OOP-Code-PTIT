package J07055;

public class Student implements Comparable<Student>{
    private String id , name ;
    private float luyentap,thuchanh,thi;

    public Student(int id, String name, float luyentap, float thuchanh, float thi) {
        this.id = String.format("SV%02d",id);
        this.name = name;
        this.luyentap = luyentap;
        this.thuchanh = thuchanh;
        this.thi = thi;
    }
    private float total(){
        return (float) (luyentap*0.25+thuchanh*0.35+thi*0.4);
    }
    private String xepLoai(){
        if(total()>=8)
            return "GIOI";
        else if(total()>=6.5)
            return "KHA";
        else if(total()>=5)
            return "TRUNG BINH";
        else return "KEM";
    }
    private String chuanHoa(){
        String name = this.name.trim().toLowerCase();
        String [] tu = name.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String value : tu) {
            res.append(Character.toUpperCase(value.charAt(0))).append(value.substring(1)).append(" ");
        }
        return res.toString().trim();
    }
    @Override
    public int compareTo(Student o) {
        return Float.compare(o.total(),this.total());
    }

    @Override
    public String toString() {
        return id+" "+chuanHoa()+" "+String.format("%.2f",total())+" "+xepLoai();
    }
}
