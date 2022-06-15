package J05042;

public class Student implements Comparable<Student>{
    private String name ;
    private int ac, sub;

    public Student(String name, int ac, int sub) {
        this.name = name;
        this.ac = ac;
        this.sub = sub;
    }

    @Override
    public int compareTo(Student o) {
        if(this.ac==o.ac){
            if(this.sub==o.sub)
                return this.name.compareTo(o.name);
            return this.sub-o.sub;
        }
        return o.ac-this.ac;
    }

    @Override
    public String toString() {
        return name+" "+ac+" "+sub;
    }
}
