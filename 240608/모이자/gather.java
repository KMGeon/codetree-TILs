import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Main.solution(n, arr));
    }

    private static Integer solution(int n, int[] arr) {

        int maxValue = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int sumDiff = 0;
            for (int j = 0; j < n; j++) {
                sumDiff += Math.abs(j - i) * arr[j];
            }
            maxValue = Math.min(maxValue, sumDiff);
        }


        return maxValue;
    }
}