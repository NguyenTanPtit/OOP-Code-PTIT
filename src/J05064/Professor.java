package J05064;

public class Professor {
    private String id, name;
    private int salary;

    public Professor(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    private int bonus() {
        switch (id.substring(0, 2)) {
            case "HT":
                return 2000000;
            case "HP":
                return 900000;
            default:
                return 500000;
        }
    }

    private int bacLuong() {
        return Integer.parseInt(id.substring(2));
    }

    private int total() {
        return salary * bacLuong() + bonus();
    }

    @Override
    public String toString() {
        return id + " " + name + " " + bacLuong() + " " + bonus() + " " + total();
    }
}
