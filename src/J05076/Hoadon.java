package J05076;

public class Hoadon {
    private Product product;
    private String id ;
    private int importQuantity, price, exportQuantity;

    public Hoadon(String id, int importQuantity, int price, int exportQuantity) {
        this.id = id;
        this.importQuantity = importQuantity;
        this.price = price;
        this.exportQuantity = exportQuantity;
    }

    public String getId() {
        return id;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    private float laiSuat(){
        switch (product.getRank()){
            case "A":
                return 0.08f;
            case "B":
                return 0.05f;
            default:
                return 0.02f;
        }
    }
    private int total(){
        return (int) ((price*laiSuat()+price)*exportQuantity);
    }
    private int importMoney(){
        return importQuantity*price;
    }

    @Override
    public String toString() {
        return product+" "+importMoney()+" "+total();
    }
}
