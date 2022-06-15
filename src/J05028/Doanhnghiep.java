package J05028;

public class Doanhnghiep implements Comparable<Doanhnghiep> {
    private String id;
    private String name;
    private int people;

    public Doanhnghiep(String id, String name, int people) {
        this.id = id;
        this.name = name;
        this.people = people;
    }

    public int getPeople() {
        return people;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+people;
    }

    @Override
    public int compareTo(Doanhnghiep o) {
        if(o.people==this.people)
            return this.id.compareTo(o.id);
        return o.people-this.people;
    }
}
