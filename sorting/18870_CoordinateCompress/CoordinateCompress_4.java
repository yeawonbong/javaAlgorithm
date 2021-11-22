import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;

public class CoordinateCompress_4 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> cnt = new HashMap<>();
        int len = Integer.parseInt(br.readLine());
        int[] origin = new int[len];
        String[] in = br.readLine().split(" ");
        for (int i=0; i < len; i++) {
            origin[i] = Integer.parseInt(in[i]);
        }
        int[] sort = origin.clone();
        Arrays.sort(sort);
        int count=0;
        for (int num : sort) {
            if (map.containsKey(num) == false) {
                map.put(num, count++); //자신보다 작은 좌표 갯수, 인덱스
            }
        }
        for (int n : origin) {
            bw.write(Integer.toString(map.get(n)));
            bw.write(" ");
        }
        bw.flush();
        bw.close();
    }
}
