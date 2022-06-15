package Sapxeplichthi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cathi implements Comparable<Cathi>{
    private String id,room;
    private Date ngaythi,giothi;

    public Cathi(int id, String ngaythi, String giothi,String room) throws ParseException {
        this.id = String.format("C%03d",id);
        this.room = room;
        this.ngaythi = new SimpleDateFormat("dd/MM/yyyy").parse(ngaythi);
        this.giothi = new SimpleDateFormat("HH:mm").parse(giothi);
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return new SimpleDateFormat("dd/MM/yyyy").format(ngaythi)+" "+new SimpleDateFormat("HH:mm").format(giothi)+" "+room;
    }

    @Override
    public int compareTo(Cathi o) {
        if(this.ngaythi.equals(o.ngaythi)){
            if(this.giothi.equals(o.giothi)){
                return this.id.compareTo(o.id);
            }
            else if(this.giothi.before(o.giothi))
                return -1;
            else return 1;
        }else if(this.ngaythi.before(o.ngaythi))
            return -1;
        else return 1;
    }
}
