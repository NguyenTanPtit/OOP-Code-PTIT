package J05060;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PhuHo implements Comparable<PhuHo>{
    private String id, name;
    private Date birthday;
    private float lyThuyet, thucHanh;

    public PhuHo(int id, String name, String birthday, float lyThuyet, float thucHanh) throws ParseException {
        this.id = String.format("PH%02d", id);
        this.name = name;
        this.birthday = new SimpleDateFormat("dd/MM/yyyy").parse(birthday);
        this.lyThuyet = lyThuyet;
        this.thucHanh = thucHanh;
    }

    private float bonus() {
        if (lyThuyet >= 8 && thucHanh >= 8) return 1;
        else if (lyThuyet >= 7.5 && thucHanh >= 7.5) return 0.5F;
        else return 0;
    }

    private float average() {
        return (float) ((lyThuyet + thucHanh) / 2.0);
    }

    private int total() {
        int s = Math.round(average() + bonus());
        return Math.min(s, 10);
    }

    private String rank() {
        if (total() < 5) return "Truot";
        else if (total() <= 6) return "Trung binh";
        else if (total() == 7) return "Kha";
        else if (total() == 8) return "Gioi";
        else return "Xuat sac";
    }

    private int age() {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(birthday);
        int year = calendar.get(Calendar.YEAR);
        return 2021 - year;
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
    public String toString() {
        return id + " " + chuanHoa() + " " + age() + " " + total() + " " + rank();
    }

    @Override
    public int compareTo(PhuHo o) {
        if(this.total()==o.total())
            return this.id.compareTo(o.id);
        return o.total()-this.total();
    }
}
