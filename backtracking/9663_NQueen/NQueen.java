import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class NQueen {
    static int[] arr;
    static int x=0, count=0, N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        nqueen(x);
        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
    }

    public static void nqueen(int x) {

        for (int y=0; y < N; y++) {
            if (isValid(x, y)) {
                arr[x] = y;
                if (x == N - 1) { // N개 찾았으면 return
                    count++;
                    return;
                }
                nqueen(x + 1); //다음 줄 검사
            }
        }// 해당 열에 유효한 좌표가 없는 경우 재귀종료
    }

    public static boolean isValid(int x, int y) {
        for (int i=0; i < x; i++) {
            if ((arr[i] == y) //가로 행 위치 같음
            || (Math.abs(arr[i] - y) == Math.abs(x - i))) // 대각선으로 걸림
                return false;
        }
        return true;
    }
}
