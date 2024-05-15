import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] numArr = new int[a];
        for (int i = 0; i < a; i++) {
            numArr[i] = sc.nextInt();
        }

        System.out.println(Main.solution(b, numArr));
    }

    private static Integer solution(int b, int[] numArr) {
        int result = 0;

        Arrays.sort(numArr);

        result = numArr[b-1];

        return result;
    }
}