package J05052;

public class Order implements Comparable<Order>{
    private String name , id ;
    private int price,quantity;

    public Order(String name, String id, int price, int quantity) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }
    private int total(){
        return price*quantity;
    }
    private int discount(){
        if(id.charAt(4)=='1')
            return (int) (total()*0.5);
        return (int) (total()*0.3);
    }
    private int pay(){
        return total()-discount();
    }
    private String thutu(){
        return id.substring(1,4);
    }
    @Override
    public String toString() {
        return name+" "+id+" "+thutu()+" "+discount()+" "+pay();
    }

    @Override
    public int compareTo(Order o) {
        return this.thutu().compareTo(o.thutu());
    }
}
