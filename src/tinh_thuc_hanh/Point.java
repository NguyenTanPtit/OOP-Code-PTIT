package tinh_thuc_hanh;

import java.util.Scanner;

public class Point {
    private double x,y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double Distance(Point p){
        return Math.sqrt((p.getX()-x)*(p.getX()-x)+(p.getY()-y)*(p.getY()-y));
    }
    public static double Distance(J04009.Point p1, J04009.Point p2){
        return (double) Math.round(p1.Distance(p2)*1000)/1000;
    }
    public static void nextPoint(Scanner s){
        double x,y;
        x=s.nextDouble();
        y=s.nextDouble();
    }
}
