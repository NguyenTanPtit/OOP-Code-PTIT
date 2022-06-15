package J05067;

public class Product implements Comparable<Product>{
    private String id;
    private int quantity;

    public Product(String id, int quantity) {
        this.id = id;
        this.quantity = quantity;
    }
    private String name(){
        switch (id.substring(3)){
            case "BP":
                return "British Petro";
            case "ES":
                return "Esso";
            case "SH":
                return "Shell";
            case "CA":
                return "Castrol";
            case "TN":
                return "Trong Nuoc";
            default:return "Mobil";
        }
    }
    private int price(){
        switch (id.charAt(0)){
            case 'X':
                return 128000;
            case 'D':
                return 11200;
            default:return 9700;
        }
    }
    private long pay(){
        return (long) price() *quantity;
    }
    private int tax(){
        if(id.substring(3).equals("TN")) return 0;
        else {
            switch (id.charAt(0)){
                case 'X':
                    return (int)(pay()*0.03);
                case 'D':
                    return (int) (pay()*0.035);
                default:return (int) (pay()*0.02);
            }
        }
    }
    private long total(){
        return pay()+tax();
    }

    @Override
    public String toString() {
        return id+" "+name()+" "+price()+" "+tax()+" "+total();
    }

    @Override
    public int compareTo(Product o) {
        return Long.compare(o.total(),this.total());
    }
}
