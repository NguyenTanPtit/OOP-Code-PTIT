package J07018;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String id, name, lop;
    private Date birthday;
    private float gpa;

    public Student(int id,String name, String lop,String birthday, float gpa) throws ParseException {
        this.id = String.format("B20DCCN%03d",id);
        this.name = name;
        this.lop = lop;
        this.birthday = new SimpleDateFormat("dd/MM/yyyy").parse(birthday);
        this.gpa = gpa;
    }
    private String chuanhoa(){
        String [] name  = this.name.trim().toLowerCase().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String s: name ){
            res.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).append(" ");
        }
        return res.toString().trim();
    }

    @Override
    public String toString() {
        return id+" "+chuanhoa()+" "+lop+" "+new SimpleDateFormat("dd/MM/yyyy").format(birthday)+" "+String.format("%.2f",gpa);
    }
}
