package J05043;

public class Staff implements Comparable<Staff> {
    private String id, name, chucVu;
    private int luongcoban, ngaycong;

    public Staff(int id, String name, String chucVu, int luongcoban, int ngaycong) {
        this.id = String.format("%02d", id);
        this.name = name;
        this.chucVu = chucVu;
        this.luongcoban = luongcoban;
        this.ngaycong = ngaycong;
    }

    public String getChucVu() {
        return chucVu;
    }

    private int phucap() {
        int pc;
        switch (chucVu) {
            case "GD":
                pc = 500;
                break;
            case "PGD":
                pc = 400;
                break;
            case "TP":
                pc = 300;
                break;
            case "KT":
                pc = 250;
                break;
            default:
                pc = 100;
                break;
        }
        return pc;
    }

    private int luongchinh() {
        return luongcoban * ngaycong;
    }

    private int tamung() {
        float tamungt = (phucap() + luongchinh()) * (2f / 3);
        if (tamungt < 25000)
            return Math.round(tamungt / 1000) * 1000;
        return 25000;
    }

    private int thunhap() {
        return luongchinh() + phucap();
    }

    @Override
    public String toString() {
        return "NV" + id + " " + name + " " + phucap() + " " + luongchinh() + " " + tamung() + " " + (luongchinh() + phucap() - tamung());
    }

    @Override
    public int compareTo(Staff o) {
        if (o.thunhap() == this.thunhap()) {
            return this.id.compareTo(o.id);
        }
        return o.thunhap() - this.thunhap();
    }
}
