package J07048;

public class Product implements Comparable<Product>{
    private String id,name;
    private int price,month;

    public Product(String id, String name, int price, int month) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.month = month;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+price+" "+month;
    }

    @Override
    public int compareTo(Product o) {
        if(this.price==o.price)
            return this.id.compareTo(o.id);
        return o.price-this.price;
    }
}
