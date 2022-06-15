package J05025;

public class Giangvien implements Comparable<Giangvien>{
    private int id;
    private String name;
    private String major;

    public Giangvien(int id, String name, String major) {
        this.id = id;
        this.name = name;
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    private String bomon(){
        StringBuilder res= new StringBuilder();
        res.append(major.charAt(0));
        for(int i=1;i<major.length()-1;i++){
            if(this.major.charAt(i)==' '){
                res.append(major.charAt(i+1));
            }
        }
        return res.toString().toUpperCase();
    }
    @Override
    public String toString() {
        return "GV"+String.format("%02d",id)+" "+name+" "+bomon();
    }
    private String getname(){
        StringBuilder res=new StringBuilder();
        for(int i=name.length()-1;i>0;i--){
            res.append(name.charAt(i));
            if(name.charAt(i-1)==' ')
                break;
        }
        return res.reverse().toString();
    }
    @Override
    public int compareTo(Giangvien o) {
        return this.getname().compareTo(o.getname());
    }
}
