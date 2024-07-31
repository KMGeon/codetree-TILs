import java.util.Scanner;

public class Main {
    public static final int MAX_N = 15;

    public static int n, m;
    public static char[][] grid = new char[MAX_N][MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }

        // 처음 뛸때 0,0
        int result =0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                for (int a = i + 1; a < n - 1; a++) {
                    for (int b = j + 1; b < m - 1; b++) {
                        if (grid[0][0]!=grid[i][j] && grid[i][j]!=grid[a][b]
                        && grid[a][b] != grid[n-1][m-1]){
                            result++;
                        }

                    }
                }
            }
        }

        System.out.println(result);
    }
}