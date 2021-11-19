import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortCoordinate {
    public static void main(String[] args) throws Exception{
        Scanner scanner= new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int len = Integer.parseInt(br.readLine());
        int[][] arr = new int[len][2];
        for (int i=0; i < len; i++) {
            String[] sp = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(sp[0]);
            arr[i][1] = Integer.parseInt(sp[1]);
        }
        Arrays.sort(arr, new Comparator<int[]>() { // 생성과 함께 오버라이딩
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0])
                    return o1[1] - o2[1];
                else
                    return o1[0] - o2[0];
            }
        });
        for (int i=0; i < len; i++) {
            bw.write(Integer.toString(arr[i][0]));
            bw.write(" ");
            bw.write(Integer.toString(arr[i][1]));
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
