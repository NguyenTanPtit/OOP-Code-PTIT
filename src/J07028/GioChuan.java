package J07028;

public class GioChuan {
    private GiangVien pro;
    private MonHoc mh;
    private float time;

    public GioChuan(GiangVien pro, MonHoc mh, float time) {
        this.pro = pro;
        this.mh = mh;
        this.time = time;
    }

    public GiangVien getPro() {
        return pro;
    }



    public float getTime() {
        return time;
    }
}
