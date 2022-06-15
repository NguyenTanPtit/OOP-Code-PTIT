package J07033_chuanhoa;

public class Student implements Comparable<Student>{
    private String id, name,lop,email;

    public Student(String id, String name, String lop, String email) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }
    private String chuanHoa(String s){
        String name = s.trim().toLowerCase();
        String [] tu = name.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String value : tu) {
            res.append(Character.toUpperCase(value.charAt(0))).append(value.substring(1)).append(" ");
        }
        return res.toString().trim();
    }
    @Override
    public String toString() {
        return id+" "+chuanHoa(name)+" "+lop+" "+email;
    }
    @Override
    public int compareTo(Student o){
        return this.id.compareTo(o.id);
    }
}
