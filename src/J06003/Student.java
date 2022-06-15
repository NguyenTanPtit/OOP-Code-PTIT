package J06003;

public class Student implements Comparable<Student>{
    private String id;
    private String name;
    private String phone;
    private int group;

    public Student(String id, String name, String phone, int group) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.group =group;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+phone+" "+group;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }
}
