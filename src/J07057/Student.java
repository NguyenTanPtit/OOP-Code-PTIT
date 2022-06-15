package J07057;

public class Student implements Comparable<Student> {
    private String id, name, dantoc;
    private float diemthi;
    private int khuvuc;

    public Student(int id, String name, float diemthi, String dantoc, int khuvuc) {
        this.id = String.format("TS%02d", id);
        this.name = name;
        this.dantoc = dantoc;
        this.khuvuc = khuvuc;
        this.diemthi = diemthi;
    }

    private float bonus() {
        if (dantoc.equals("Kinh")) {
            switch (khuvuc) {
                case 1:
                    return 1.5f;
                case 2:
                    return 1;
                default:
                    return 0;
            }
        } else {
            switch (khuvuc) {
                case 1:
                    return 3;
                case 2:
                    return 2.5f;
                default:
                    return 1.5f;
            }
        }
    }

    private float total() {
        return diemthi + bonus();
    }

    private String status() {
        if (total() >= 20.5) {
            return "Do";
        }
        return "Truot";
    }

    private String chuanHoa() {
        String name = this.name.trim().toLowerCase();
        String[] tu = name.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String value : tu) {
            res.append(Character.toUpperCase(value.charAt(0))).append(value.substring(1)).append(" ");
        }
        return res.toString().trim();
    }

    @Override
    public String toString() {
        return id + " " + chuanHoa() + " " + total() + " " + status();
    }

    @Override
    public int compareTo(Student o) {
        if (this.total() == o.total())
            return this.id.compareTo(o.id);
        return Float.compare(o.total(), this.total());
    }
}
