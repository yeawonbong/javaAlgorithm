import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BlackJack {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int num = Integer.parseInt(in[0]);
        int max = Integer.parseInt(in[1]);
        in = br.readLine().split(" ");
        int[] arr = new int[num];
        for (int i=0; i < num; i++) {
            arr[i] = Integer.parseInt(in[i]);
        }
        int sum = 0;
        int temp;
        for (int i=0; i < num; i++) {
            for (int j = i+1; j < num; j++) {
                for (int k = j+1; k < num; k++) {
                    temp = arr[i] + arr[j] + arr[k];
                    if (temp <= max && temp > sum) {
                            sum = temp;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
