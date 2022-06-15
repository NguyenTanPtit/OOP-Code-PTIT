package J04009;


public class Triangle {
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }



    public boolean valid(){
        double d1=p1.Distance(p2),d2=p2.Distance(p3),d3=p3.Distance(p1);
        if(d1+d2<=d3||d1+d3<=d2||d2+d3<=d1){
            return false;
        }
        return true;
    }
    public double getPerimeter(){
        double d1=p1.Distance(p2),d2=p2.Distance(p3),d3=p3.Distance(p1);
        return (double) Math.round((d1+d2+d3)*1000)/1000;
    }
}
