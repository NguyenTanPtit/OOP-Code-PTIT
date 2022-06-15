package J05074;

public class Student {
    private String id,name,lop;
    private int diemCC;
    public Student(String id, String name,String lop) {
        this.id = id;
        this.name = name;
        this.lop=lop;
    }

    public void setDiemCC(int diemCC) {
        this.diemCC = diemCC;
    }

    public String getLop() {
        return lop;
    }

    public String getId() {
        return id;
    }

    private String note(){
        if(diemCC==0){
            return "KDDK";
        }
        return "";
    }

    @Override
    public String toString() {
        return id+" "+name+" "+lop+" "+diemCC+" "+note();
    }
}
