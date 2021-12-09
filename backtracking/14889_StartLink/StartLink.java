import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StartLink {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[][] arr;
    static String[] splitArr;
    static int N;

    public static void getArr() throws Exception {
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        for (int i=0; i < N; i++) {
            splitArr = br.readLine().split(" ");
            for (int j=0; j < N; j++) {
                arr[i][j] = Integer.parseInt(splitArr[j]);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        getArr();

    }
}
