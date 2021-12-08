import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Operator {

    static int MIN=Integer.MAX_VALUE;
    static int MAX=Integer.MIN_VALUE;
    static int num;
    static int sum;
    static int[] arr;
    static int[] operator;

    static boolean[] visited;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        num = Integer.parseInt(br.readLine());
        arr = new int[num];
        operator = new int[num - 1];


        int idx=0;
        String[] in = br.readLine().split(" ");
        for (int i=0; i < num; i++) {
            arr[i] = Integer.parseInt(in[i]);
        }
        in = br.readLine().split(" ");
        for (int i=0; i < 4; i++) {
            for (int j=Integer.parseInt(in[i]); 0 < j; j--) {
                operator[idx++] = i;
            }
        }
        visited = new boolean[operator.length];
        sum=arr[0];
        System.out.println("small = " + MIN);
        sum=arr[0];
        backtracking(1);
        System.out.println("small = " + MIN);
    }


    static void operation (int nIdx, int oIdx){

            switch (operator[oIdx]) {
                case 0 : // +
                    sum += arr[nIdx];
                    break;
                case 1 : // -
                    sum -= arr[nIdx];
                    break;
                case 2 : // *
                    sum *= arr[nIdx];
                    break;
                case 3 : // /
                    sum /= arr[nIdx];
                    break;
            }
    }

    static void    backtracking(int nIdx) {

        for (int j=0; j < num-1; j++) { //operator arr
            if (visited[j] == false) {
                visited[j] = true;
                operation(nIdx, j);
                if (nIdx < num)
                    backtracking(nIdx + 1);
                visited[j] = false;
            }
        }
        if (sum < MIN) {
            MIN = sum;
        }
    }
}
