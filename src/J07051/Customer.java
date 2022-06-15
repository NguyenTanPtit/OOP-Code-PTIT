package J07051;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class Customer implements Comparable<Customer> {
    private String id, name, roomId;
    private Date ngayden, ngaydi;
    private int service;

    public Customer(int id, String name, String roomId, String ngayden, String ngaydi,int service) throws ParseException {
        this.id = String.format("%02d", id);
        this.name = name;
        this.roomId = roomId;
        this.ngayden = new SimpleDateFormat("dd/MM/yyyy").parse(ngayden);
        this.ngaydi = new SimpleDateFormat("dd/MM/yyyy").parse(ngaydi);
        this.service= service;
    }
    private int price(){
        switch (roomId.charAt(0)){
            case '1':
                return 25;
            case '2':
                return 34;
            case '3':
                return 50;
            default:
                return 80;
        }
    }
    private int SoNgayLuuTru() {
        long day = ngaydi.getTime() - ngayden.getTime();
        TimeUnit timeUnit = TimeUnit.DAYS;
        return (int) timeUnit.convert(day, TimeUnit.MILLISECONDS);
    }
    private int total(){
        return price()*(SoNgayLuuTru()+1)+service;
    }
    private String chuanHoa(){
        String name = this.name.trim().toLowerCase();
        String [] tu = name.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String value : tu) {
            res.append(Character.toUpperCase(value.charAt(0))).append(value.substring(1)).append(" ");
        }
        return res.toString().trim();
    }
    @Override
    public int compareTo(Customer o) {
        return o.total() - this.total();
    }

    @Override
    public String toString() {
        return "KH" + id + " " + chuanHoa() + " " + roomId + " " + (SoNgayLuuTru()+1)+" "+total();
    }
}

