package J05006;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class NhanVien implements Comparable<NhanVien> {
    private String id;
    private String name;
    private String sex;
    private Date dob;
    private String add;
    private String tax;
    private Date contract;

    public NhanVien(int id, String name, String sex, String dob, String add, String tax, String contract) throws ParseException {
        this.id = String.format("%05d",id);
        this.name = name;
        this.sex = sex;
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
        this.add = add;
        this.tax = tax;
        this.contract = new SimpleDateFormat("dd/MM/yyyy").parse(contract);
    }

    @Override
    public String toString() {
        return id+" "+name+" "+sex+" "+new SimpleDateFormat("dd/MM/yyyy").format(dob)+" "+add+" "+tax+" "+new SimpleDateFormat("dd/MM/yyyy").format(contract);
    }
    @Override
    public int compareTo(NhanVien o)  {
        if(this.dob.before(o.dob))
                return -1;
        else if(this.dob.equals(o.dob))
            return 0;
        else return 1;
    }
}
