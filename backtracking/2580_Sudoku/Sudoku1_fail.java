import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Sudoku1_fail {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[][] arr = new int[9][9];
    static String[] splitArr;

    public static void getArr() throws Exception {
        for (int i=0; i < 9; i++) {
            splitArr = br.readLine().split(" ");
            for (int j=0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(splitArr[j]);
            }
        }
    }

    public static void fillNum(int i, int j) {
        boolean[] check = new boolean[10];
        int count=0;

        for (int x=0; x<9; x++) { // 세로 줄 확인
            check[arr[x][j]] = true;
        }
        for (int y=0; y<9; y++) { // 가로 줄 확인
            check[arr[i][y]] = true;
        }
        int x = 3 * (i / 3), y = 3 * (j / 3); // 정사각형 시작지점 (0,0)
        for (int xx=0; xx < 3; xx++) {
            for (int yy=0; yy < 3; yy++) {
                check[arr[x+xx][y+yy]] = true;
            }
        }
        for (int n=1; n < 10; n++) {
            if (check[n] == false)
                arr[i][j] = n;
        }
    }

    public static void main(String[] args) throws Exception {
        getArr();
        for (int i=0; i < 9; i++) {
            for (int j=0; j < 9; j++) {
                if (arr[i][j] == 0) {
                    fillNum(i, j);
                }
            }
        }
        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                bw.write(Integer.toString(arr[i][j]));
                bw.write(" ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
