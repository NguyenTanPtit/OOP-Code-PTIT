package J08026;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-->0) {
            int S = s.nextInt(), T = s.nextInt();
            Queue<Node> nodes = new LinkedList<>();
            nodes.add(new Node(S,0));
            Set<Integer> st = new HashSet<>();
            while (!nodes.isEmpty()){
                Node top = nodes.peek();
                nodes.remove();
                int key = top.key, val = top.val;
                st.add(key);
                if(key == T){
                    System.out.println(val);
                    break;
                }
                if(!st.contains(key-1)&& key-1>0){
                    nodes.add(new Node(key-1,val+1));
                }
                if(!st.contains(key*2)&& key*2<10000){
                    nodes.add(new Node(key*2,val+1));
                }
            }
        }
    }
}
