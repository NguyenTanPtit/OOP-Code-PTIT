package J04013;
import java.util.Scanner;

public class test {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            String id=s.next();
            s.nextLine();
            String name=s.nextLine();
            float toan=s.nextFloat();
            float ly=s.nextFloat();
            float hoa=s.nextFloat();
            ThiSinh a= new ThiSinh(id,name,toan,ly,hoa);
            System.out.println(a);
        }
    }

