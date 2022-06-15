package J05010;

public class Product implements Comparable<Product>{
    private int id ;
    private  String name, cat;
    private float buy, sell;

    public Product(int id, String name, String cat, float buy, float sell) {
        this.id = id;
        this.name = name;
        this.cat = cat;
        this.buy = buy;
        this.sell = sell;
    }
    private float profit(){
        return sell-buy;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+cat+" "+String.format("%.2f",profit());
    }

    @Override
    public int compareTo(Product o) {
        return Float.compare(o.profit(),this.profit());
    }
}
