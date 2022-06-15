package J04011;

public class Point3D {
    private int a,b,c;

    public Point3D(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4){
        Point3D v1 = new Point3D(p2.a-p1.a, p2.b-p1.b, p2.c- p1.c);
        Point3D v2 = new Point3D(p3.a-p1.a, p3.b-p1.b, p3.c- p1.c);
        Point3D v3 = new Point3D(p4.a-p1.a, p4.b-p1.b, p4.c- p1.c);

        Point3D phapTuyen = new Point3D(v1.b*v2.c - v1.c*v2.b,
                v1.c*v2.a - v1.a* v2.c,
                v1.a*v2.b - v1.b*v2.a);

        int kq = phapTuyen.a*v3.a + phapTuyen.b*v3.b + phapTuyen.c*v3.c;

        return kq == 0;
    }
}
