package BT_of_Thanh;

public class IntPhoneNumber extends PhoneNumber{
    private String id_country;



    public IntPhoneNumber(String id_country,String id, String num) {
        super(id, num);
        this.id_country = id_country;
    }

    @Override
    public String toString() {
        return id_country+"-"+getId()+"-"+getNum();
    }

}
