import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;

public class CoordinateCompress_3timeout {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<Integer, Integer> cnt = new HashMap<>();
        int len = Integer.parseInt(br.readLine());
        int[] sort = new int[len];
        String[] in = br.readLine().split(" ");
        for (int i=0; i < len; i++) {
            sort[i] = Integer.parseInt(in[i]);
            map.put(i, in[i]);
        }
        Arrays.sort(sort);
        int count=0;
        for (int i=0; i < len; i++) {
            for (int j=0; j < i; j++) {
                if ((j == 0 || sort[j] != sort[j-1]) && sort[j] < sort[i])
                    count++; //자신보다 작은 좌표 갯수 올려주기
            }
            cnt.put(sort[i], count);
            count = 0;
        }
        for (int i=0; i < len; i++) {
            bw.write(Integer.toString(cnt.get(Integer.parseInt(map.get(i)))));
            bw.write(" ");
        }
        bw.flush();
        bw.close();
    }
}
