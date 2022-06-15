package tinh_thuc_hanh;

public class Match implements Comparable<Match>{
    private String id;
    private String name;
    private int revenue;

    public Match(String id, String name, int revenue) {
        this.id = id;
        this.name = name;
        this.revenue = revenue;
    }

    @Override
    public int compareTo(Match o) {
        if(this.revenue==o.revenue){
            return this.id.compareTo(o.id);
        }
        return o.revenue-this.revenue;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+revenue;
    }
}
