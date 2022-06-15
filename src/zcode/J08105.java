package zcode;

import java.util.HashMap;
import java.util.Scanner;

public class J08105 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            int n = scanner.nextInt();
            Long[] a = new Long[n];
            long k = scanner.nextLong();
            HashMap<Long, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
                if (!hashMap.containsKey(a[i])) {
                    hashMap.put(a[i], 1);
                } else {
                    hashMap.put(a[i], hashMap.get(a[i]) + 1);
                }
            }
            long count = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == k - a[i]) {
                    count += (hashMap.get(a[i]) - 1);
                } else {
                    if (hashMap.get(k - a[i]) != null)
                        count += hashMap.get(k - a[i]);
                }
            }
            System.out.println(count / 2);
        }
    }

}
