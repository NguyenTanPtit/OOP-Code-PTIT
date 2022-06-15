package J05038;

public class Salary implements Comparable<Salary> {
    private String id, name, position;
    private int workTime, ngaycong;

    public Salary(int id, String name, int ngaycong, int workTime, String position) {
        this.id = String.format("NV%02d", id);
        this.name = name;
        this.ngaycong = ngaycong;
        this.position = position;
        this.workTime = workTime;
    }

    private int monthSalary() {
        return ngaycong * workTime;
    }

    private int bonus() {
        if (workTime >= 25) return (int) (monthSalary() * 0.2);
        else if (workTime >= 22) return (int) (monthSalary() * 0.1);
        else return 0;
    }

    private int phucap() {
        int t;
        switch (position) {
            case "GD":
                t = 250000;
                break;
            case "PGD":
                t = 200000;
                break;
            case "TP":
                t = 180000;
                break;
            default:
                t = 150000;
                break;
        }
        return t;
    }

    public int total() {
        return monthSalary() + bonus() + phucap();
    }

    @Override
    public String toString() {
        return id + " " + name + " " + monthSalary() + " " + bonus() + " " + phucap() + " " + total();
    }

    @Override
    public int compareTo(Salary o) {
        return o.total() - this.total();
    }
}
