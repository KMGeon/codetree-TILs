import java.util.Scanner;

public class Main {
    public static final int MAX_N = 20;

    public static int n;
    public static int[][] arr = new int[MAX_N][MAX_N];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();

        int maxCnt = 0;
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n - 2; j++) {
                int cnt = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                maxCnt = Math.max(maxCnt, cnt);
            }
        
        System.out.println(maxCnt);
    }
}