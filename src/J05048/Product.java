package J05048;

public class Product implements Comparable<Product>{
    private String id;
    private int quantityNhap;

    public Product(String id, int quantityNhap) {
        this.id = id;
        this.quantityNhap = quantityNhap;
    }

    public String getId() {
        return id;
    }

    private int quantityXuat() {
        if (id.charAt(0) == 'A') {
            return (int) Math.round(quantityNhap * 0.6);
        } else return (int) Math.round(quantityNhap * 0.7);
    }

    private int price() {
        if (id.charAt(4) == 'Y')
            return 110000;
        return 135000;
    }

    private long total() {
        return (long) quantityXuat() * price();
    }

    private int tax() {
        if (id.charAt(0) == 'A' && id.charAt(4) == 'Y')
            return (int) (0.08 * total());
        if (id.charAt(0) == 'A' && id.charAt(4) == 'N')
            return (int) (0.11 * total());
        if (id.charAt(0) == 'B' && id.charAt(4) == 'Y')
            return (int) (0.17 * total());
        return (int) (0.22 * total());
    }

    @Override
    public String toString() {
        return id + " " + quantityNhap + " " + quantityXuat() + " " + price() + " " + total() + " " + tax();
    }

    @Override
    public int compareTo(Product o) {
        return o.tax()-this.tax();
    }
}
