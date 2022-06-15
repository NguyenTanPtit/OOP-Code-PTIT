package J07008;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("DAYSO.in"));
        ArrayList<Integer> input = new ArrayList<>();
        while (in.hasNextInt()) {
            input.add(in.nextInt());
        }

        int n = input.get(0);
        int[] arr = new int[n];
        for (int i = 1; i < input.size(); i++) {
            arr[i-1] = input.get(i);
        }
        ArrayList<Integer> path = new ArrayList<>();
        ArrayList<String> ans = new ArrayList<>();
        in(arr, 0, path, ans);
        Collections.sort(ans);
        for(String str : ans)
            System.out.println(str);
    }

    static void in(int[] arr, int index, ArrayList<Integer> path, ArrayList<String> ans) {
        if(index == arr.length) {
            if(path.size() > 1 && check(path)){
                StringBuilder res = new StringBuilder();
                for (Integer integer : path) {
                    res.append(integer).append(" ");
                }
                ans.add(res.toString());
            }

        }
        else {
            in(arr, index + 1, path, ans);
            path.add(arr[index]);
            in(arr, index + 1, path, ans);
            path.remove(path.size() - 1);
        }
    }

    static boolean check(ArrayList<Integer> path) {
        for (int i = 0; i < path.size() -1; i++) {
            if(path.get(i) > path.get(i+1))
                return false;
        }
        return true;
    }
}
