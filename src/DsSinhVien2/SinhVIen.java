package DsSinhVien2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class SinhVIen implements Comparable<SinhVIen>{
    private String  ma;
    private String name;
    private String lop;
    private Date birthday;
    private float gpa;

    public SinhVIen() {
    }

    public SinhVIen(int id,String name, String lop, String birthday, float gpa) throws ParseException {
        this.ma= "B20DCCN"+String.format("%03d",id);
        this.name = name;
        this.lop = lop;
        this.birthday = new SimpleDateFormat("dd/MM/yyyy").parse(birthday);
        this.gpa = gpa;
    }


    private String chuanhoa(){
        StringBuilder s= new StringBuilder();
        StringTokenizer s1=new StringTokenizer(name.toLowerCase());
        while (s1.hasMoreTokens()){
            String str = s1.nextToken();
            s.append(Character.toUpperCase(str.charAt(0)));
            for(int i=1;i<str.length();i++){
                s.append(str.charAt(i));
            }
            s.append(" ");
        }

        return s.toString().trim();
    }
    @Override
    public String toString() {
        return ma+" "+chuanhoa()+" "+lop+" "+new SimpleDateFormat("dd/MM/yyyy").format(birthday)+" "+String.format("%.2f",gpa);
    }

    @Override
    public int compareTo(SinhVIen o) {
        return Float.compare(o.gpa, this.gpa);
    }
}
