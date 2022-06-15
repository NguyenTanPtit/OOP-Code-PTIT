package tinh_thuc_hanh;

public class Club {
    private String id;
    private String name;
    private int price;

    public String getId() {
        return id;
    }



    public String getName() {
        return name;
    }



    public int getPrice() {
        return price;
    }

    public Club(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
