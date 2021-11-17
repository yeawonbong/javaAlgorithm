import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Statistic {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float len = Integer.parseInt(br.readLine());
        float sum=0;
        int[] arr = new int[(int)len];
        if (len == 1) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(n);
            System.out.println(n);
            System.out.println(n);
            System.out.println(0);
            return;
        }
        for (int i=0; i < len; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);
        System.out.println(Math.round(sum / len));
        System.out.println(arr[((int)len-1) / 2]);
        System.out.println(mode(arr, (int)len));
        System.out.println(arr[(int)len-1] - arr[0]);
        }

    public static int mode(int[] arr, int len) throws Exception {
        ArrayList<String> al = new ArrayList<>();
        String in = null;

        int j=1, res=0, topc=0, ex=0;
        int[] count = new int[len];
        count[0] = 1;
        for (int i=1; i < len; i++) {
            if (arr[i] == arr[i-1]) {
                count[i] = ++j;
            }
            else {
                count[i] = 1;
                j = 1;
            }
        }
        for (int i=0; i < len; i++) {
            if (topc <= count[i]) {
                topc = count[i];
            }
        }
        int t=0;
        for (int i=0; i < len; i++) {
            if (topc == count[i]) {
                res = arr[i];
                t++;
            }
            if (t == 2)
                return res;
        }
        return res;
    }
}
