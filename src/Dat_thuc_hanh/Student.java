package Dat_thuc_hanh;

public class Student {
    private  String id ;
    private String name;
    private String lop;
    private String email;

    public Student(String id, String name, String lop, String email) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public String toString() {
        return "";
    }
}
