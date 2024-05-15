import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int[] numberArr = new int[a1];

        for (int i = 0; i < a1; i++) {
            numberArr[i] = sc.nextInt();
        }

        Integer[] sortedArr = Main.solution(numberArr);
        for (int i : sortedArr) {
            System.out.println(i);
        }
    }

    private static Integer[] solution(int[] numberArr) {
        Integer[] arr2 = Arrays.stream(numberArr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr2, Collections.reverseOrder());
        return arr2;
    }
}