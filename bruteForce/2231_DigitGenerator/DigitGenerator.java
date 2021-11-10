import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DigitGenerator {
    public static void main(String[] args) throws Exception {
        int num, res, add;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        res = num - (9 * (int)(Math.log10(num)+1));
        while (res < num) {
            String temp = Integer.toString(res);
            add = 0;
            for (int i=0; i < temp.length(); i++) {
                add += Character.getNumericValue(temp.charAt(i));
            }
            if (res + add == num) {
                System.out.println(res);
                return;
            }
            res++;
        }
        System.out.println("0");
        return;
    }
}
