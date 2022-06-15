package J05054;

public class Student {
    private String id,name;
    private int rank;
    private float score;

    public Student(int id, String name,float score) {
        this.id = String.format("HS%02d",id);
        this.name = name;
        this.score= score;
    }

    public float getScore() {
        return score;
    }

    private String rating(){
        if(score<5) return "Yeu";
        else if(score<7) return "Trung Binh";
        else if(score<9) return "Kha";
        else return "Gioi";
    }

    @Override
    public String toString() {
        return id+" "+name+" "+score+" "+rating();
    }
}
