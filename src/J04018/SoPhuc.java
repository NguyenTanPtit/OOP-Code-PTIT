package J04018;

public class SoPhuc {
    private int a, b;


    public SoPhuc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public SoPhuc add(SoPhuc B) {
        SoPhuc res = new SoPhuc(0,0);
        res.a = this.a + B.a;
        res.b = this.b + B.b;
        return res;
    }

    public SoPhuc mul(SoPhuc B) {
        SoPhuc res = new SoPhuc(0,0);
        res.a = (this.a * B.a) - (this.b * B.b);
        res.b = (this.a * B.b) + (this.b * B.a);
        return res;
    }

    @Override
    public String toString() {
        if(b>0) {
            return a + " + " + b + "i";
        }
        else return a + " - " + b*-1 + "i";
    }
}
