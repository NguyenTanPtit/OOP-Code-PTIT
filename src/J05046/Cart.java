package J05046;

public class Cart implements Comparable<Cart> {
    private String name,id;
    private int quantity, price;

    public Cart(String name, int quantity, int price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void setId(String id) {
        this.id = id;
    }

    private float phantramchietkhau() {
        if (quantity > 10) {
            return 0.05F;
        } else if (quantity >= 8) {
            return 0.02F;
        } else if (quantity >= 5) {
            return 0.01F;
        } else return 0;
    }
    private int tienchietkhau(){
        return (int) (price*quantity*phantramchietkhau());
    }
    private int thanhtien(){
        return price*quantity-tienchietkhau();
    }
    public String ID(){
        StringBuilder str = new StringBuilder();
        String [] s = name.split(" ");
        str.append(s[0].toUpperCase().charAt(0)).append(s[1].toUpperCase().charAt(0));
        return str.toString();
    }

    @Override
    public String toString() {
        return ID()+id+" "+name+" "+tienchietkhau()+" "+thanhtien();
    }

    @Override
    public int compareTo(Cart o) {
        return o.tienchietkhau()-this.tienchietkhau();
    }
}
