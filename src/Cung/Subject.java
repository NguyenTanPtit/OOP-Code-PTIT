package Cung;

public class Subject implements Comparable<Subject>{
    private String id;
    private String name;
    private int tinChi;

    public Subject(String id, String name, int tinChi) {
        this.id = id;
        this.name = name;
        this.tinChi = tinChi;
    }

    @Override
    public String toString() {
        return id +" "+name+" "+tinChi;
    }

    @Override
    public int compareTo(Subject o) {
        return this.name.compareTo(o.name);
    }
}
