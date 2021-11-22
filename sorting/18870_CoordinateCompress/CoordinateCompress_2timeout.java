import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

//[0] -input 숫자
//[1] -원래 순서
//[2] -자신보다 작은 좌표 갯수
//[3] -중복 여부
public class CoordinateCompress_2timeout {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int len = Integer.parseInt(br.readLine());
        int[][] arr = new int[len][4];
        String[] in = br.readLine().split(" ");
        for (int i=0; i < len; i++) {
            arr[i][0] = Integer.parseInt(in[i]);
            arr[i][1] = i;
            for (int j=0; j < i; j++) {
                if (in[j].equals(in[i])) {
                    arr[i][3] = -1;
                    break;
                }
            }
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        for (int i=0; i < len; i++) {
            for (int j=0; j < i; j++) {
                if (arr[j][3] != -1 && arr[j][0] < arr[i][0])
                    arr[i][2]++; //자신보다 작은 좌표 갯수 올려주기
            }
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1]; //원래 순서대로 다시 정렬
            }
        });
        for (int[] out : arr) {
            bw.write(Integer.toString(out[2]));
            bw.write(" ");
        }
        bw.flush();
        bw.close();
    }
}
