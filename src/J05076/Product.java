package J05076;

public class Product {
    private String id,name,rank;

    public Product(String id, String name, String rank) {
        this.id = id;
        this.name = name;
        this.rank = rank;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return id+" "+name;
    }
}
