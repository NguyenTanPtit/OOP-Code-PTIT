package zcode;

import java.util.ArrayList;
import java.util.Scanner;

public class J03010 {
    static ArrayList<String> arr = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0) {
            String str = sc.nextLine().toLowerCase().trim();
            convert(str);
        }
        for (int i = 0; i < arr.size(); i++) {
            int dem = 0;
            for (int j = 0; j <= i; j++) {
                if(arr.get(i).equals(arr.get(j))) dem++;
            }
            if(dem == 1) {
                System.out.println(arr.get(i) + "@ptit.edu.vn");
            }else {
                System.out.println(arr.get(i) + dem+ "@ptit.edu.vn");
            }
        }
        sc.close();
    }

    public static void convert(String str) {
        StringBuilder res = new StringBuilder();
        int n = str.length() - 1;
        while(str.charAt(n) != ' '){
            res.append(str.charAt(n));
            n--;
        }
        StringBuilder test = new StringBuilder();
        test=res.reverse();
        test.append(str.charAt(0));
        for (int i = 1; i < n; i++) {
            if(str.charAt(i) != ' ' && str.charAt(i-1) == ' ') {
                test.append(str.charAt(i));
            }
        }
        arr.add(test.toString());
    }
}