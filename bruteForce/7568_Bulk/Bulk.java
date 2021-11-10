import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bulk {
    public static void main(String[] args) throws Exception {
        int num;
        String[] temp;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        int[][] in = new int[num][3];
        for (int i=0; i < num; i++) {
            temp = br.readLine().split(" ");
            in[i][0] = Integer.parseInt(temp[0]);
            in[i][1] = Integer.parseInt(temp[1]);
            in[i][2] = 0;
        }
        for (int i=0; i < num; i++) {
            for (int j=0; j < num; j++) {
                if (j != i &&
                        in[i][0] > in[j][0] && in[i][1] > in[j][1]) {
                    in[j][2]++;
                }
            }
        }
        for (int[] i : in) {
            System.out.print(i[2] + 1 + " ");
        }
    }
}
