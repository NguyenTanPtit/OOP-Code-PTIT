package zcode;

import java.util.*;

public class J08011 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, Integer> hashMap = new TreeMap<>();
        while (scanner.hasNext()) {
            String tmp = scanner.next();
            if(check(tmp)) {
                if (hashMap.containsKey(tmp)) {
                    hashMap.put(tmp, hashMap.get(tmp) + 1);
                } else hashMap.put(tmp, 1);
            }
        }
        Map<String, Integer> map = sorByVal(hashMap);
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    static boolean check(String s) {
        for (int i = 0; i < s.length()-1; i++) {
            if((int) s.charAt(i) > (int) s.charAt(i+1))
                return false;
        }
        return true;
    }

    static HashMap<String, Integer> sorByVal(TreeMap<String, Integer> map) {
        List<Map.Entry<String, Integer>> list= new LinkedList<>(map.entrySet());
        list.sort((o1, o2) -> (o2.getValue().compareTo(o1.getValue())));
        HashMap<String, Integer> tmp = new LinkedHashMap<>();
        for (Map.Entry entry : list) {
            tmp.put(entry.getKey().toString(), Integer.parseInt(entry.getValue().toString()));
        }
        return tmp;
    }
}

