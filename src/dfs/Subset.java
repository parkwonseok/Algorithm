package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Subset {

    static int N, total, arr[];
    static boolean[] ch;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        ch = new boolean[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        dfs(0);
        System.out.println("부분집합 개수 : " + total);
    }

    static void dfs(int idx) {
        if(idx == N) {
            for(int i = 0; i < N; i++) {
                if(ch[i]) System.out.print(arr[i] + " ");
            }
            System.out.println();
            total++;
            return;
        }

        // 현재 인덱스 포함
        ch[idx] = true;
        dfs(idx + 1);

        // 현재 인덱스 불포함
        ch[idx] = false;
        dfs(idx + 1);
    }
}
