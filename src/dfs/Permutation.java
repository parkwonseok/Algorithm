package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Permutation {

    static int N, total, arr[], res[];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        res = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        dfs(0, 0);
        System.out.println("순열 경우의 수 : " + total);
    }

    private static void dfs(int cnt, int flag) {
        
        if(cnt == N) {
            for(int i = 0; i < N; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();
            total++;
            return;
        }

        for(int i = 0; i < N; i++) {
            if((flag & 1 << i) == 0) {
                res[cnt] = arr[i];
                dfs(cnt + 1, flag | 1 << i);
            }
        }
    }
}
