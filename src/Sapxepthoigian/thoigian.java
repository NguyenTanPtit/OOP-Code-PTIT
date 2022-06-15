package Sapxepthoigian;

public class thoigian implements Comparable<thoigian> {
    private int gio,phut,giay;

    public thoigian(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    @Override
    public int compareTo(thoigian o) {
        if(this.gio==o.gio){
            if(this.phut==o.phut){
                return this.giay-o.giay;
            }
            return this.phut-o.phut;
        }
        return this.gio-o.gio;
    }

    @Override
    public String toString() {
        return gio+" "+phut+" "+giay;
    }

}
