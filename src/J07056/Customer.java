package J07056;

public class Customer implements Comparable<Customer>{
    private String id, name, loai;
    private int csdau, cscuoi;

    public Customer(int id,String name, String loai, int csdau, int cscuoi) {
        this.id = String.format("KH%02d",id);
        this.name = name;
        this.loai = loai;
        this.csdau = csdau;
        this.cscuoi = cscuoi;
    }
    private int dinhmuc(){
        switch (loai){
            case "A": return 100;
            case "B": return 500;
            default: return 200;
        }
    }
    private int tientrongdinhmuc(){
        int cs = cscuoi - csdau;
        if(cs< dinhmuc()){
            return cs*450;
        }else return dinhmuc()*450;
    }
    private int tienvuotdinhmuc(){
        int cs = cscuoi - csdau;
        if(cs> dinhmuc())
            return (cs - dinhmuc())*1000;
        else
            return 0;
    }
    private int tax(){
        return (int) (tienvuotdinhmuc()*0.05);
    }
    private int total(){
        return tientrongdinhmuc()+tienvuotdinhmuc()+tax();
    }
    private String chuanhoa(){
        String [] name = this.name.trim().toLowerCase().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String s : name ){
            res.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).append(" ");
        }
        return res.toString().trim();
    }
    @Override
    public String toString() {
        return id+" "+chuanhoa()+" "+tientrongdinhmuc()+" "+tienvuotdinhmuc()+" "+tax()+" "+total();
    }

    @Override
    public int compareTo(Customer o) {
        return o.total()-this.total();
    }
}
