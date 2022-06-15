package J07010;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String id;
    private String name;
    private Date birthday;
    private String lop;
    private float gpa;

    public Student(int id, String name, String lop, String birthday , String gpa) throws ParseException {
        this.id = String.format("%03d",id);
        this.name = name;
        this.birthday = new SimpleDateFormat("dd/MM/yyyy").parse(birthday);
        this.lop = lop;
        this.gpa = Float.parseFloat(gpa);
    }

    @Override
    public String toString() {
        return "B20DCCN"+id+" "+name+" "+lop+" "+new SimpleDateFormat("dd/MM/yyyy").format(birthday)+" "+String.format("%.2f",gpa);
    }
}
