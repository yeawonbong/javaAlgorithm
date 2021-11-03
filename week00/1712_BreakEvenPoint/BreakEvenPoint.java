import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BreakEvenPoint {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);

        if (C-B < 0 || (B == C && A != 0)) {
            System.out.println(-1);
            return;
        }
        int res = A / (C-B);
        System.out.println(++res);
    }
}
