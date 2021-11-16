import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortNum2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        int[] arr = new int[len];
        for (int i=0; i < len; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for (int i=0; i < len; i++) {
            System.out.println(arr[i]);
        }
    }
}