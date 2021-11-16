import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Statistic {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        int sum=0;
        int[] arr = new int[len];
        for (int i=0; i < len; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);
        System.out.println(sum / len);
        System.out.println(arr[len / 2 + 1]);
        System.out.println(mode(arr, len));
        System.out.println(arr[len-1] - arr[0]);
        }

    public static int mode(int[] arr, int len) throws Exception {
        int c=0, nc=0, res=0;
        for (int i=0; i < len; i++) {
            if (0 < i && arr[i] == arr[i - 1]) {
                nc++;
                if (arr[i] != res && nc > c) {
                    res = arr[i];
                    c = nc;
                }
            }
            else {
                nc = 0;
            }
        }
        return res;
    }
}
