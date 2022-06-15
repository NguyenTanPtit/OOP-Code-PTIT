package J05011;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class player implements Comparable<player> {
    private String id;
    private String name;
    private Date begintime;
    private Date endtime;

    public player(String id, String name, String begintime, String endtime) throws ParseException {
        this.id = id;
        this.name = name;
        this.begintime = new SimpleDateFormat("hh:mm").parse(begintime);
        this.endtime = new SimpleDateFormat("hh:mm").parse(endtime);
    }
    private long playtime(){
        return (endtime.getTime()-begintime.getTime())/60/1000;
    }
    @Override
    public String toString() {
        return id+" "+name+" "+playtime()/60+" gio "+playtime()%60+" phut";
    }

    @Override
    public int compareTo(player o) {
        return (int)(o.playtime()-this.playtime());
    }
}
