package thuchanh610;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Call {
    private String id;
    private Date start;
    private Date end;

    public Call(String id, String start, String end) throws ParseException {
        this.id = id;
        this.start = new SimpleDateFormat("HH:mm").parse(start);
        this.end = new SimpleDateFormat("HH:mm").parse(end);
    }

    public String getId() {
        return id;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    public int counttime() {
        int time = (int) (end.getTime() - start.getTime());
        int minute = time / (60 * 1000);
        if (id.charAt(0) == '0') {
            return minute;
        } else return Math.round((float) minute / 3);
    }
}
