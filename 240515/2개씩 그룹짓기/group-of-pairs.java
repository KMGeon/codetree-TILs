import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        int[] ints = new int[input1];

        for (int i = 0; i < input1; i++) {
            ints[i] = sc.nextInt();
        }

        System.out.println(Main.solution(input1, ints));
    }

    private static Integer solution(int input1, int[] ints) {
        Arrays.sort(ints);
        int temp = 0;
        int first = ints[0];
        int last = ints[ints.length - 1];

        int diffrent = input1 - 2;

        for (int i = 1; i <= diffrent; i++) {
            temp = ints[i];
        }

        return temp + first +last;
    }
}