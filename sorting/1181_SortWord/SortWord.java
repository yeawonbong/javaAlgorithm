import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class SortWord {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());

        String[] arr = new String[len];
        for (int i=0; i < len; i++) {
            arr[i] = br.readLine();
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() != o2.length())
                    return o1.length() - o2.length();
                else {
                    for (int i=0; i < o1.length(); i++) {
                        if (o1.charAt(i) != o2.charAt(i)) {
                            return (int)o1.charAt(i) - (int)o2.charAt(i);
                        }
                    }
                }
                return 0;
            }
        });
        System.out.println(arr[0]);
        for (int i=1; i < len; i++) {
            if (arr[i].equals(arr[i - 1]) == false)
                System.out.println(arr[i]);
        }
    }
}
