package J05020;

public class Sinhvien implements Comparable<Sinhvien>{
    private String id;
    private String name;
    private String grade;
    private String email;

    public Sinhvien(String id, String name, String grade, String email) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+grade+" "+email;
    }

    @Override
    public int compareTo(Sinhvien o) {
            return this.id.compareTo(o.id);
    }
}
