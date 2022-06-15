package J05055;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Athlete implements Comparable<Athlete>{
    private String id, name;
    private Date birthday, startTime, finishTime;
    private int rank;

    public Athlete(int id, String name, String birthday, String startTime, String finishTime) throws ParseException {
        this.id = String.format("VDV%02d", id);
        this.name = name;
        this.birthday = new SimpleDateFormat("dd/MM/yyyy").parse(birthday);
        this.startTime = new SimpleDateFormat("hh:mm:ss").parse(startTime);
        this.finishTime = new SimpleDateFormat("hh:mm:ss").parse(finishTime);
    }

    //get year form a date
    private int age() {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(birthday);
        int year = calendar.get(Calendar.YEAR);
        return 2021 - year;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    private String bonus() {
        if (age() < 18) return "00:00:00";
        else if (age() < 25) return "00:00:01";
        else if (age() < 32) return "00:00:02";
        else return "00:00:03";
    }

    private String result() {
        long res = (finishTime.getTime() - startTime.getTime()) / 1000;
        int hour = (int) (res / 3600);
        int min = (int) (res / 60);
        int second = (int) (res % 60);
        return String.format("%02d", hour) + ":" + String.format("%02d", min) + ":" + String.format("%02d", second);
    }

    public String achievement() {
        String kq = result();
        long res = Integer.parseInt(kq.substring(0, 2)) * 3600L + Integer.parseInt(kq.substring(3, 5)) * 60L
                + Integer.parseInt(kq.substring(6)) - Integer.parseInt(bonus().substring(6));
        int hour = (int) (res / 3600);
        int min = (int) (res / 60);
        int second = (int) (res % 60);
        return String.format("%02d", hour) + ":" + String.format("%02d", min) + ":" + String.format("%02d", second);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + result() + " " + bonus() + " " + achievement()+" "+rank;
    }

    @Override
    public int compareTo(Athlete o) {
        return this.rank-o.rank;
    }
}
