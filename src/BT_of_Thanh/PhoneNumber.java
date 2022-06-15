package BT_of_Thanh;

public class PhoneNumber implements Comparable {
    private String id;
    private String num;

    public PhoneNumber() {
    }

    public PhoneNumber(String id, String num) {
        this.id = id;
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return id+"-"+num;
    }

    @Override
    public int compareTo(Object o) {
        return this.compareTo(o);
    }
}
