package Sapxeplichthi;



public class Monthi{
    private String id,name,hinhthuc;

    public Monthi(String id, String name, String hinhthuc) {
        this.id = id;
        this.name = name;
        this.hinhthuc = hinhthuc;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }


}
