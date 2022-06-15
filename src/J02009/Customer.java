package J02009;

public class Customer implements Comparable<Customer>{
    private int start,end;

    public Customer(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    @Override
    public int compareTo(Customer o) {
        return this.start-o.start;
    }
}
