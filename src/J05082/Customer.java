package J05082;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer implements Comparable<Customer> {
    private String id, name, sex, address;
    private Date birthday;

    public Customer(int id, String name, String sex, String birthday, String address) throws ParseException {
        this.id = String.format("KH%03d", id);
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.birthday = new SimpleDateFormat("dd/MM/yyyy").parse(birthday);
    }

    @Override
    public int compareTo(Customer o) {
        if (this.birthday.before(o.birthday))
            return -1;
        else return 1;
    }

    private String chuanhoa() {
        String[] name = this.name.trim().toLowerCase().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String s : name) {
            res.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).append(" ");
        }
        return res.toString().trim();
    }

    @Override
    public String toString() {
        return id + " " + chuanhoa() + " " + sex + " " + address + " " + new SimpleDateFormat("dd/MM/yyyy").format(birthday);
    }
}
