import java.util.Arrays;
import java.util.Scanner;

public class SortNum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arr = new int[len];
        for (int i=0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for (int i=0; i < len; i++) {
            System.out.println(arr[i]);
        }
    }
}
