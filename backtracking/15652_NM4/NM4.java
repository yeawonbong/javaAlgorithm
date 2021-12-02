import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NM4 {
    static boolean[] visited;
    static int[] out;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int N = Integer.parseInt(in[0]);
        int M = Integer.parseInt(in[1]);
        visited = new boolean[N]; // 모든 숫자 방문확인 배열
        out = new int[M]; // 출력할 배열
        dfs(N, M, 0);
    }

    static void dfs(int N, int M, int idx) {
        if (idx == M) {
            for (int m = 0; m < M; m++) { //출력
                System.out.print(out[m] + 1);
                if (m < M - 1)
                    System.out.print(" ");
            }
            System.out.print('\n');
            return;
        }
        int j = idx == 0 ? 0 : out[idx - 1]; //추가한 부분
        for (; j < N; j++) {
            out[idx] = j;
            dfs(N, M, idx + 1);
        }
    }
}
