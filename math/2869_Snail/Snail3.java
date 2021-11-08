import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Snail3 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int up = Integer.parseInt(input[0]);
        int down = Integer.parseInt(input[1]);
        int height = Integer.parseInt(input[2]);
        int day = (height - down) / (up - down);
        if (0 < (height - down) % (up - down))
            day++;
        System.out.println(day);
    }
}
