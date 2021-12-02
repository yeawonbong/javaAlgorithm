import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class NM3 {
    static boolean[] visited;
    static int[] out;

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws Exception {
        String[] in = br.readLine().split(" ");
        int N = Integer.parseInt(in[0]);
        int M = Integer.parseInt(in[1]);
        visited = new boolean[N]; // 모든 숫자 방문확인 배열
        out = new int[M]; // 출력할 배열
        dfs(N, M, 0);
        bw.flush();
        bw.close();
    }

    static void dfs(int N, int M, int idx) throws Exception {
        if (idx == M) {
            for (int m = 0; m < M; m++) { //출력
                bw.write(Integer.toString(out[m]+1));
                if (m < M - 1)
                    bw.write(" ");
            }
            bw.write('\n');
            return;
        }
        for (int j=0; j < N; j++) {
                out[idx] = j;
                dfs(N, M, idx + 1);
        }
    }
}
