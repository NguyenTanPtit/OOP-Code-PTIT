package J04014;

public class PhanSo {
    private long tu, mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    private long Ucln(long a, long b) {
        if (b == 0) return a;
        return Ucln(b, a % b);

    }

    public PhanSo add(PhanSo B) {
        long mauchung = this.mau * B.mau;
        long tu = this.tu * B.mau + B.tu * this.mau;
        return new PhanSo(tu, mauchung);
    }

    public PhanSo mul(PhanSo B) {
        long mau = this.mau * B.mau;
        long tu = this.tu * B.tu;
        return new PhanSo(tu, mau);
    }

    public PhanSo rutGon() {
        long hs = Ucln(tu, mau);
        long mauchung = mau / hs;
        long tuchung = tu / hs;
        if (mauchung > 0)
            return new PhanSo(tuchung, mauchung);
        return new PhanSo(tuchung * (-1), mauchung * (-1));
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }
}
