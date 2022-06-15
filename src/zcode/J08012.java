package zcode;

import java.util.HashMap;
import java.util.Scanner;


    public class J08012 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < n-1; i++) {
                int u = in.nextInt();
                int v = in.nextInt();
                if (hashMap.containsKey(u)) {
                    hashMap.put(u, hashMap.get(u) + 1);
                }else hashMap.put(u, 1);

                if (hashMap.containsKey(v)) {
                    hashMap.put(v, hashMap.get(v) + 1);
                }else hashMap.put(v,1);
            }
            if(hashMap.containsValue(n-1))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }

