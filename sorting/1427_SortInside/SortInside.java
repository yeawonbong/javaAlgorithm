import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortInside {
    public static void main (String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] arr = new char[str.length()];
        for (int i=0; i<str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        Arrays.sort(arr);
        for (int i=str.length()-1; 0 <= i; i--) {
            System.out.print(arr[i]);
        }
    }
}
