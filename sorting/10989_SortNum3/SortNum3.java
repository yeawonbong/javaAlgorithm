import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SortNum3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int len = Integer.parseInt(br.readLine());
        int[] count = new int[10001];
        for (int i=0; i < len; i++) {
            count[Integer.parseInt(br.readLine())]++;
        }
        for (int i=0; i < 10001; i++) {
            for (int j=0; j < count[i]; j++) {
                bw.write(Integer.toString(i));
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
    }
}