package J05050;

public class Bill implements Comparable<Bill>{
    private String SD,id;
    private int chisocu,chisomoi;

    public Bill(int id,String SD, int chisocu, int chisomoi) {
        this.id=String.format("%02d",id);
        this.SD = SD;
        this.chisocu = chisocu;
        this.chisomoi = chisomoi;
    }
    private int heSo(){
        int hs;
        switch (SD){
            case "KD":
               hs=3;
               break;
            case "NN":
                hs=5;
                break;
            case "TT":
                hs=4;
                break;
            default:
                hs=2;
                break;
        }
        return hs;
    }
    private long price(){
        return (long) (chisomoi - chisocu) *heSo()*550;
    }
    private long additional(){
        int t = chisomoi-chisocu;
        if(t<50) return 0;
        else if(t<=100) return  Math.round(price()/100.0*35);
        else return price();
    }
    private long total(){
        return price()+additional();
    }

    @Override
    public String toString() {
        return "KH"+id+" "+heSo()+" "+price()+" "+additional()+" "+total();
    }

    @Override
    public int compareTo(Bill o) {
        return (int) (o.total()-this.total());
    }
}
