package J07046;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Customer implements Comparable<Customer>{
    private String id,name,roomId;
    private Date ngayden,ngaydi;

    public Customer(int id, String name, String roomId, String ngayden,String ngaydi) throws ParseException {
        this.id = String.format("%02d",id);
        this.name = name;
        this.roomId = roomId;
        this.ngayden = new SimpleDateFormat("dd/MM/yyyy").parse(ngayden);
        this.ngaydi = new SimpleDateFormat("dd/MM/yyyy").parse(ngaydi);
    }
    private int SoNgayLuuTru(){
        long day=ngaydi.getTime()-ngayden.getTime();
        TimeUnit timeUnit = TimeUnit.DAYS;
        return (int) timeUnit.convert(day,TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Customer o) {
        return o.SoNgayLuuTru()-this.SoNgayLuuTru();
    }

    @Override
    public String toString() {
        return "KH"+id+" "+name+" "+roomId+" "+SoNgayLuuTru();
    }
}
