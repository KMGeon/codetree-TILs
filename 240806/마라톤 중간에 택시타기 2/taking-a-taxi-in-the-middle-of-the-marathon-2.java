import java.util.Scanner;

public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;
    public static final int MAX_N = 100;

    public static int n;
    public static int[] x = new int[MAX_N];
    public static int[] y = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수 선언 및 입력
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int result = INT_MAX;
        for (int i = 1; i < n - 1; i++) {

            int diff = 0;
            int prev = 0;
            for (int j = 1; j < n; j++) {
                if (i==j) continue;
                diff += Math.abs(x[prev] - x[j]) + Math.abs(y[prev] - y[j]);
                prev = j;
            }
            result = Math.min(diff, result);
        }
        System.out.println(result);

    }
}