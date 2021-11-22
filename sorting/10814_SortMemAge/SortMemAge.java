import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class SortMemAge {
    static class Member {
        int age;
        String name;

        Member(String str) {
            String[] inArr = str.split(" ");
            this.age = Integer.parseInt(inArr[0]);
            this.name = inArr[1];
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        Member[] memArr = new Member[len];
        for (int i=0; i < len; i++) {
            memArr[i] = new Member(br.readLine());
        }
        Arrays.sort(memArr, new Comparator<Member>(){
            @Override
            public int compare(Member o1, Member o2) {
                return o1.age - o2.age;
            }
        });
        for (Member m : memArr) {
            System.out.println(m.age + " " + m.name);
        }
    }
}
