package Vu_thuc_hanh;

public class Classroom {
    private String idprof;
    private String idsub;
    private float time;

    public String getIdprof() {
        return idprof;
    }

    public String getIdsub() {
        return idsub;
    }

    public float getTime() {
        return time;
    }

    public Classroom(String idprof, String idsub, float time) {
        this.idprof = idprof;
        this.idsub = idsub;
        this.time = time;
    }
}
