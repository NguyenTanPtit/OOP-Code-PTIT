package J05057;

public class Student implements Comparable<Student>{
    private String id ,name;
    private float toan,ly,hoa;

    public Student(String id, String name, float toan, float ly, float hoa) {
        this.id = id;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    private float bonus(){
        switch (id.substring(0,3)){
            case "KV1":
                return 0.5f;
            case "KV2":
                return 1.0f;
            default:return 2.5f;
        }
    }
    private float tongDiem(){
        return toan*2+ly+hoa;
    }
    private float total(){
        return tongDiem()+bonus();
    }
    private String status(){
        if(total()>=24) return "TRUNG TUYEN";
        return "TRUOT";
    }
    private boolean check(){
        return total() % 1 == 0;
    }

    @Override
    public String toString() {
        if(check()){
            if(bonus()==1.0f){
                return id+" "+name+" "+(int)bonus()+" "+(int) total()+" "+status();
            }
            else return id+" "+name+" "+bonus()+" " +(int)total()+" "+status();
        }
        else {
            if(bonus()==1.0f){
                return id+" "+name+" "+(int)bonus()+ " "+total()+" "+status();
            }else return id+" "+name+ " "+bonus()+" "+total()+" "+status();
        }
    }

    @Override
    public int compareTo(Student o) {
        if(o.total()==this.total())
            return this.id.compareTo(o.id);
        return Float.compare(o.total(),this.total());
    }
}
