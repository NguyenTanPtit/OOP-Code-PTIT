package J07050;

public class Product implements Comparable<Product>{
    private String id,name,brand;
    private float buy,sell;

    public Product(int id, String name, String brand, float buy, float sell) {
        this.id = String.format("MH%02d",id);
        this.name = name;
        this.brand = brand;
        this.buy = buy;
        this.sell = sell;
    }
    private float profit(){
        return sell-buy;
    }

    @Override
    public int compareTo(Product o) {
        return Float.compare(o.profit(),this.profit());
    }

    @Override
    public String toString() {
        return id+" "+name+" "+brand+" "+String.format("%.2f",profit());
    }
}
