package J05077;

public class Employee {
    private String id,name;
    private int salary, day;
    private PhongBan pb;
    public Employee(String id, String name, int salary, int day) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.day = day;
    }

    public String getId() {
        return id;
    }

    public PhongBan getPb() {
        return pb;
    }

    public void setPb(PhongBan pb) {
        this.pb = pb;
    }

    private int heso(){
        int year= Integer.parseInt(id.substring(1,3));
        switch (id.charAt(0)){
            case 'A':
                if(year>=16) return 20;
                else if(year>=9) return 14;
                else if(year>=4) return 12;
                else return 10;
            case 'B':
                if(year>=16) return 16;
                else if(year>=9) return 13;
                else if(year>=4) return 11;
                else return 10;
            case 'C':
                if(year>=16) return 14;
                else if(year>=9) return 12;
                else if(year>=4) return 10;
                else return 9;
            default:
                if(year>=16) return 13;
                else if(year>=9) return 11;
                else if(year>=4) return 9;
                else return 8;
        }
    }
    private int total(){
        return salary*day*heso()*1000;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+total();
    }
}
