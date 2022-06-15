package Thi1212;

public class MonThi implements Comparable<MonThi>{
    private String id,name,hinhthuc;

    public MonThi(String id, String name, String hinhthuc) {
        this.id = id;
        this.name = name;
        this.hinhthuc = hinhthuc;
    }

    @Override
    public String toString() {
        return id +" "+name+" "+hinhthuc;
    }

    @Override
    public int compareTo(MonThi o) {
        return this.id.compareTo(o.id);
    }
}
