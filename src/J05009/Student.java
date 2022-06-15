package J05009;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Comparable<Student>{
    private  int id;
    private String name,birthday;
    private float diem1,diem2,diem3;

    public Student(int id, String name,String birthday, float diem1, float diem2, float diem3) throws ParseException {
        this.id = id;
        this.name = name;
        this.birthday= birthday;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    public float tongDiem(){
        return diem1+diem2+diem3;
    }

    @Override
    public int compareTo(Student o) {
        if(this.tongDiem()==o.tongDiem()){
            return this.id-o.id;
        }
        return Float.compare(o.tongDiem(),this.tongDiem());
    }

    @Override
    public String toString() {
        return id+" "+name+" "+birthday+" "+tongDiem();
    }
}
