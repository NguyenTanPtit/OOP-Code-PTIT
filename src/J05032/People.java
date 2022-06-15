package J05032;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class People implements Comparable<People>{
    private String name;
    private Date dob;

    public People(String name, String dob) throws ParseException {
        this.name = name;
        this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(People o) {
        if(this.dob.before(o.dob))
            return 1;
        else if(this.dob.equals(o.dob))
            return 0;
        return -1;
    }
}
