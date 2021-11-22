import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class CoordinateCompress_1timeout {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int len = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        String[] in = br.readLine().split(" ");
        arr.add(Integer.parseInt(in[0]));
        for (int i=1; i < len; i++) {
            for (int j=0; j < i; j++) {
                if (in[j].equals(in[i])) {
                    break;
                }
                if (j == i - 1)
                    arr.add(Integer.parseInt(in[i]));
            }
        }
        Collections.sort(arr);
        for (String s : in) {
            bw.write(Integer.toString(arr.indexOf(Integer.parseInt(s))));
            bw.write(" ");
        }
        bw.flush();
        bw.close();
    }
}
