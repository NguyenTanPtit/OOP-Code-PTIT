package J05081;

public class Product implements Comparable<Product>{
    private int priceMua,priceBan ;
    private String name,per,id;

    public Product(int id,  String name, String per,int priceMua, int priceBan) {
        this.id = String.format("%03d",id);
        this.priceMua = priceMua;
        this.priceBan = priceBan;
        this.name = name;
        this.per = per;
    }
    private int cash(){
        return priceBan-priceMua;
    }

    @Override
    public int compareTo(Product o) {
        if(this.cash()==o.cash()){
            return this.id.compareTo(o.id);
        }
        return o.cash()-this.cash();
    }

    @Override
    public String toString() {
        return "MH"+id+" "+name+" "+per+" "+priceMua+" "+priceBan+" "+cash();
    }
}
