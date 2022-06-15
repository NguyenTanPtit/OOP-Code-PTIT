package J05036;

public class Product implements Comparable<Product>{
    private String id,name,unit;
    private int price,quantity;

    public Product(int  id, String name, String unit, int price, int quantity) {
        this.id = String.format("MH%02d",id);
        this.name = name;
        this.unit = unit;
        this.price = price;
        this.quantity = quantity;
    }
    private int deliver(){
        return (int) Math.round(price*quantity*0.05);
    }
    private int pay(){
        return Math.round(price*quantity+deliver());
    }
    private int total(){
        double p=(pay()+pay()*0.02f)/quantity;
        return (int) Math.ceil(p/100)*100;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+unit+" "+deliver()+" "+pay()+" "+total();
    }

    @Override
    public int compareTo(Product o) {
        return o.total()-this.total();
    }
}
