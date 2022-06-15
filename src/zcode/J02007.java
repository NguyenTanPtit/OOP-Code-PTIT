package zcode;
import java.util.Scanner;

public class J02007 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int j=1; j<=t; j++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Test " + j + ":");

            int[] fr = new int[n];
            int visited = -1;
            for (int i = 0; i < arr.length; i++) {
                int dem = 1;
                for (int k = i+1; k < arr.length; k++) {
                    if(arr[i] == arr[k]) {
                        dem++;
                        fr[k] = visited;
                    }
                }
                if(fr[i] != visited)
                    fr[i] = dem;
            }

            for (int i = 0; i < fr.length; i++) {
                if(fr[i] != visited)
                System.out.println(arr[i] + " xuat hien " + fr[i] + " lan");
            }

        }
        sc.close();
    }

}
