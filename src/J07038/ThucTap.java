package J07038;

public class ThucTap implements Comparable<ThucTap>{
    private Student st;
    private Company cp;

    public ThucTap(Student st, Company cp) {
        this.st = st;
        this.cp = cp;
    }


    public Student getSt() {
        return st;
    }

    public Company getCp() {
        return cp;
    }

    @Override
    public int compareTo(ThucTap o) {
        return this.st.compareTo(o.st);
    }
}
