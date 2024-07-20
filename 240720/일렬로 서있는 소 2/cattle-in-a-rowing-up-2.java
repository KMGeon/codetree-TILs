import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int result = 0;
        for (int i = 0; i < num - 2; i++) {
            for (int j = i + 1; j < num; j++) {
                for (int k = j + 1; k < num; k++) {
                    if (isIjk(i, j, k) && isValueIjk(i, j, k, arr)) {
                        result++;
                    }
                }
            }
        }

        System.out.println("result = " + result);


    }

    private static boolean isValueIjk(int i, int j, int k, int[] arr) {
        return arr[i] <= arr[j] && arr[j] <= arr[k] && arr[i] <= arr[k] ? true : false;
    }

    private static boolean isIjk(int i, int j, int k) {
        return i <= j && j <= k && i <= k ? true : false;

    }
}