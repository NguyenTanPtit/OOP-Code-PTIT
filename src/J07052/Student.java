package J07052;

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
    public float total(){
        return tongDiem()+bonus();
    }

    private boolean check(){
        return total() % 1 == 0;
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
    public String toString() {
        if(check()){
            if(bonus()==1.0f){
                return id+" "+chuanHoa()+" "+(int)bonus()+" "+(int) total();
            }
            else return id+" "+chuanHoa()+" "+bonus()+" " +(int)total();
        }
        else {
            if(bonus()==1.0f){
                return id+" "+chuanHoa()+" "+(int)bonus()+ " "+total();
            }else return id+" "+chuanHoa()+ " "+bonus()+" "+total();
        }
    }

    @Override
    public int compareTo(Student o) {
        if(o.total()==this.total())
            return this.id.compareTo(o.id);
        return Float.compare(o.total(),this.total());
    }
}
