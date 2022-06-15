package J07054;

public class Student implements Comparable<Student>{
    private String id,name;
    private float diem1,diem2,diem3;
    private int rank;

    public Student(int id, String name, float diem1, float diem2, float diem3) {
        this.id = String.format("SV%02d",id);
        this.name = name;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    private String chuanHoa(){
        String name =this.name.trim().toLowerCase();
        String [] tu = name.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String value : tu) {
            res.append(Character.toUpperCase(value.charAt(0))).append(value.substring(1)).append(" ");
        }
        return res.toString().trim();
    }
    public float average(){
        return (diem1*3+diem2*3+diem3*2)/8;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public int compareTo(Student o) {
        if(this.rank==o.rank)
            return this.id.compareTo(o.id);
        return this.rank-o.rank;
    }

    @Override
    public String toString() {
        return id+" "+chuanHoa()+" "+String.format("%.2f",average())+" "+rank;
    }
}
