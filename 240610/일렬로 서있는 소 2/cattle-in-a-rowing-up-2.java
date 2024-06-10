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

        int result =0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if(arr[i] <= arr[j] && arr[j] <= arr[k]){
                      result++;
                    }

                }
            }
        }

        return result;
    }
}