package J04013;

public class ThiSinh {
    private String id,name;
    private float toan;
    private float ly;
    private float hoa;
    public ThiSinh() {
    }

    public ThiSinh(String id, String name, float toan, float ly, float hoa) {
        this.id = id;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getToan() {
        return toan;
    }

    public float getLy() {
        return ly;
    }

    public float getHoa() {
        return hoa;
    }

    public void setToan(int toan) {
        this.toan = toan;
    }



    public void setLy(int ly) {
        this.ly = ly;
    }



    public void setHoa(int hoa) {
        this.hoa = hoa;
    }
    public float tongdiem() {
        return getHoa() + getToan() * 2 + getLy();
    }
    public boolean convert(){
        return tongdiem() % 1 == 0;
    }
    public String ketqua(){
        if((tongdiem()+kv())>=24){
            return "TRUNG TUYEN";
        }
    return "TRUOT";
    }
    public float kv(){
        String s=getId().substring(0,3);
        if(s.equals("KV3")){
            return 2.5F;
        }
        else if (s.equals("KV2")){
            return 1.0F;
        }
        else
            return 0.5F;
    }

    @Override
    public String toString() {
        if (convert()) {
            if (kv() == 1.0F) {
                return getId() + " " + getName() + " " + (int) kv() + " " + (int) tongdiem() + " " + ketqua();
            }
            else return getId() + " " + getName() + " " + kv() + " " + (int) tongdiem() + " " + ketqua();
        }
        else{
            if(kv()==1.0){
                return getId() + " " + getName() + " " + (int) kv() + " " + tongdiem() + " " + ketqua();
            }
            else return getId()+" " +getName()+" "+kv()+" "+tongdiem()+" "+ketqua();
        }


    }
}
