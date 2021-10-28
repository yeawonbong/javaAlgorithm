import java.util.Scanner;

public class Snail1 {

    public static int  climbingSnail(int A, int B, int V) {
        int status=0;
        int day=0;

        while (status < V)
        {
            status += A;
            if (status < V)
                status -= B;
            day++;
        }
        return day;
    }

    public static void main(String[] args) {
        int A=0, B=0, V=0;
        Scanner scanner = new Scanner(System.in);
        A = scanner.nextInt();
        B = scanner.nextInt();
        V = scanner.nextInt();
        System.out.println(climbingSnail(A, B, V));
    }
}
