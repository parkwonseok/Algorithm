package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Combination {

    static int N, R, total, arr[], res[];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        R = Integer.parseInt(br.readLine());
        arr = new int[N];
        res = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        dfs(0, 0);
        System.out.println("조합 경우의수 : " + total);
    }

    private static void dfs(int cnt, int start) {

        if(cnt == R) {
            for(int i = 0; i < R; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();
            total++;
            return;
        }

        for(int i = start; i < N; i++) {
            res[cnt] = arr[i];
            dfs(cnt + 1, i + 1);
        }
    }
}
