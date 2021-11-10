import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FilmDirectorShom {
    public static void main(String[] args) throws Exception {
        int num = 666, in;
        String tmp = null;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        in = Integer.parseInt(br.readLine());
        for (int i=0; i < in; num++) {
            tmp = Integer.toString(num);
            if (tmp.contains("666")) {
                i++;
            }
        }
        System.out.println(tmp);
    }
}
