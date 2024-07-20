import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[][] arr = new int[num][num];
        for (int i=0; i<num; i++){
            for (int j=0; j<num; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int result =0;
        for (int i=0; i<num; i++){
            for (int j=0; j<num-2;j++){
                int tmp = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                result = Math.max(result, tmp);
            }
        }

        System.out.println(result);
    }
}