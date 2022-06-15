package J04015;

public class Professor {
    private String id, name ;
    private long luong;

    public Professor(String id, String name, long luong) {
        this.id = id;
        this.name = name;
        this.luong = luong;
    }
    private int bacluong(){
        return Integer.parseInt(id.substring(2));
    }
    private long phucap(){
        String ma = id.substring(0,2);
        if( ma.equals("HT")){
            return 2000000;
        }
        else if (ma.equals("HP"))
            return 900000;
        else return 500000;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+bacluong()+" "+phucap()+" "+(luong*bacluong()+phucap());
    }
}
