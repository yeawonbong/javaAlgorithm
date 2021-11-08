import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fraction{

    int col=1, row=1, num=0, flag=0, input;

    public void nextLine(){
        if(flag == 0) {
            col++;
            flag = 1;
        }
        else{
            row++;
            flag = 0;
        }
        input--;
        num++;
    }

    public void diagonal() {
        int i = 0;
        while (i < num && 0 < input) {
            if (flag == 0) {
                col++;
                row--;
            }
            else {
                col--;
                row++;
            }
            i++;
            input--;
        }
    }

    public void fraction() {
        while (0 < input) {
            nextLine();
            diagonal();
        }
    }

    public static void main(String[]args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Fraction f = new Fraction();
        f.input = Integer.parseInt(br.readLine()) - 1;
        f.fraction();
        System.out.println(f.row + "/" + f.col);
    }
}
