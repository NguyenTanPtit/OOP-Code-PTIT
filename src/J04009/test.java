package J04009;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t= s.nextInt();
        while (t-->0){

            double x1=s.nextDouble(),y1=s.nextDouble(),x2= s.nextDouble(),y2= s.nextDouble(),x3=s.nextDouble(),y3=s.nextDouble();
            Point p1=new Point(x1,y1);
            Point p2=new Point(x2,y2);
            Point p3=new Point(x3,y3);
            double d1=p1.Distance(p2),d2=p2.Distance(p3),d3=p3.Distance(p1);
            if(d1+d2<=d3||d1+d3<=d2||d2+d3<=d1){
                System.out.println("INVALID");
            }
            else {
               double S=  (0.25*Math.sqrt((d1+d2+d3)*(d1+d2-d3)*(d1-d2+d3)*(-d1+d2+d3)));
               double R=  ((d1*d2*d3)/(4*S));
               double Shinhtron=(double) Math.round(Math.PI*Math.pow(R,2)*1000)/1000;
                System.out.printf("%.3f",Shinhtron);
                System.out.println();
            }

        }
    }
}
