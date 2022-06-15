package J05077;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        ArrayList<PhongBan> phongBans= new ArrayList<>();
        while (n-->0){
            phongBans.add(new PhongBan(s.next(),s.nextLine()));
        }
        int t = Integer.parseInt(s.nextLine());
        ArrayList<Employee> employees= new ArrayList<>();
        while (t-->0){
            employees.add(new Employee(s.nextLine(),s.nextLine(),Integer.parseInt(s.nextLine()),Integer.parseInt(s.nextLine())));
        }
        for (Employee e : employees){
            for (PhongBan pb: phongBans){
                if(e.getId().substring(3).equals(pb.getId()))
                    e.setPb(pb);
            }
        }
        String idpb= s.nextLine();
        for (PhongBan pb: phongBans){
            if(pb.getId().equals(idpb))
                System.out.println("Bang luong phong "+pb.getName().trim()+":");
        }
        for (Employee e: employees){
            if(e.getPb().getId().equals(idpb))
                System.out.println(e);
        }
    }
}
