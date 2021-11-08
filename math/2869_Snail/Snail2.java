import java.util.Scanner;

public class Snail2 {
    public static void main(String[] args) {
        int up=0, down=0, height=0;
        Scanner scanner = new Scanner(System.in);
        up = scanner.nextInt();
        down = scanner.nextInt();
        height = scanner.nextInt();
        height -= down;
        int climbPerDay = up - down;
        int day = (height) / climbPerDay;
        if (0 < height % climbPerDay)
            day++;
        System.out.println(day);
    }
}
