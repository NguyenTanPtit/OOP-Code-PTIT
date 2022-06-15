package J07038;

public class Student implements Comparable<Student>{
    private String id, name, lop, email;

    public Student(String id, String name, String lop, String email) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }
    private String chuanhoa(){
        String [] name = this.name.trim().toLowerCase().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String s : name){
            res.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).append(" ");
        }
        return res.toString().trim();
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id+" "+chuanhoa()+" "+lop;
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }
}
