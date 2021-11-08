import java.util.Scanner;

public class HoneyComb {
    public static void main(String[] args) {
        int input, lastnum=1, count=0;

        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();

        while ((lastnum + (6*count)) < input) {
            lastnum += (6*count);
            count++;
        }
        System.out.println(count + 1);
    }
}
