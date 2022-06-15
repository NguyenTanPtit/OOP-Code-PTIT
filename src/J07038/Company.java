package J07038;

public class Company {
    private String id, name;
    private int num;

    public Company(String id, String name, int num) {
        this.id = id;
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getNum() {
        return num;
    }
}
