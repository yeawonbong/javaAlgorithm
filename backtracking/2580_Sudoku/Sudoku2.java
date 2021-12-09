import java.io.*;

public class Sudoku2 {
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

    public static boolean isPossible(int row, int col, int value) {
        //세로 줄에 겹치는 숫자가 있는 지 확인
        for (int i = 0; i < 9; i++) {
            if (arr[i][col] == value) {
                return false;
            }
        }

        //가로 줄에 겹치는 숫자가 있는 지 확인
        for (int i = 0; i < 9; i++) {
            if (arr[row][i] == value) {
                return false;
            }
        }

        //3*3 정사각형 안에 겹치는 숫자가 있는 지 확인
        int rowPoint = 3 * (row / 3), colPoint = 3 * (col / 3); // 정사각형 시작지점 (0,0)

        for (int i = rowPoint; i < rowPoint + 3; i++) {
            for (int j = colPoint; j < colPoint + 3; j++) {
                if (arr[i][j] == value) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void sudoku(int row, int col) throws IOException {
        //가로 줄 다 채우면 다음 열로 이동
        if (col == 9) {
            sudoku(row + 1, 0);
            return ;
        }

        //행열 다 채워졌을 경우 출력 후 exit 종료
        if (row == 9) {
            for (int i=0; i<9; i++) {
                for (int j=0; j<9; j++) {
                    bw.write(Integer.toString(arr[i][j]));
                    bw.write(" ");
                }
                bw.write("\n");
            }
            bw.flush();
            bw.close();
            System.exit(0) ;
        }

        if (arr[row][col] == 0) {
            //1~9 숫자 넣어보기
            for (int value = 1; value <= 9; value++) {
                if (isPossible(row, col, value) == true) {
                    arr[row][col] = value;
                    sudoku(row, col+1); // 다음 행
                }
            }
            // 가능한 숫자가 없는 경우, roll back
            arr[row][col] = 0;
            return;
        }

        // 다음 행으로 도는 거 기본 (j++)
        sudoku(row, col + 1);
    }

    public static void main(String[] args) throws Exception {
        getArr();
        sudoku(0, 0);
    }
}
