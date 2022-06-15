package zcode;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class J1013 {
    static PrintWriter printWriter = new PrintWriter(System.out);
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    static final int N = (int) ((int)2*1e6 + 5);
    static int[] minPrime = new int[N];
    public static void main(String[] args) throws IOException {

        eratos();

        int testCase = 1;
        for(int i=0; i<testCase; i++){
            solution();
        }
        bufferedReader.close();
        printWriter.close();
    }

    static void eratos(){
        for(int i=2; i<N; i++) minPrime[i] = 0;

        for(int i=2; i<=(int)Math.sqrt(N); i++){
            if(minPrime[i] == 0){
                for(int j=i*i; j<N; j+=i){
                    if(minPrime[j] == 0) minPrime[j] = i;
                }
            }
        }
        for(int i=2; i<N; i++) {
            if(minPrime[i] == 0) minPrime[i] = i;
        }
    }

    static void solution() throws IOException {

        int n = Integer.parseInt(bufferedReader.readLine());
        long ans = 0;

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(Integer.parseInt(bufferedReader.readLine()));
        }

        for(int number: list){
            while(number != 1){
                ans += minPrime[number];
                number /= minPrime[number];
            }
            if(number > 1) ans += number;
        }

        printWriter.println(ans);

    }
}