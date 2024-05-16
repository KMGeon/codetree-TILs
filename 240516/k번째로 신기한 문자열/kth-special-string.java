import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b2 = sc.nextInt();

        String str = sc.next();


        String[] strArr = new String[a1];
        for (int i = 0; i < a1; i++) {
            strArr[i] = sc.next();
        }


        List<String> list = new ArrayList<>();

        for (String s : strArr) {
            String substring = s.substring(0, 2);

            if (substring.equals(str)){
                list.add(s);
            }
        }

        // list에 있는 데이터를 string배열로 만들기
        String[] resultArr = list.toArray(new String[0]);

        Arrays.sort(resultArr);

        System.out.println(resultArr[3]);
    }
}