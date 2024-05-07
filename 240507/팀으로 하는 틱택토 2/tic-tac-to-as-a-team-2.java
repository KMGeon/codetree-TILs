import java.util.Scanner;

public class Main {
    public static final int MAX_X = 9;
    public static final int MAX_A = 3;
    
    public static String[] inp = new String[MAX_A];
    public static int[][] board = new int[MAX_A][MAX_A];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        for(int i = 0; i < MAX_A; i++)
            inp[i] = sc.next();
        
        for(int i = 0; i < MAX_A; i++)
            for(int j = 0; j < MAX_A; j++)
                board[i][j] = inp[i].charAt(j) - '0';

        int ans = 0;

        // 모든 쌍에 대해 전부 시도해 봅니다.
        for(int i = 1; i <= MAX_X; i++)
            for(int j = i + 1; j <= MAX_X; j++) {
                // i, j 두 명이 팀이 됐을 때 이길 수 있는지를 확인합니다.
                // win : 두 명이 팀이 됐을 때 이길 수 있다면 true
                boolean win = false;

                // numI , numJ : 각 줄에 i, j가 나오는 개수
                int numI = 0, numJ = 0;

                // 가로로 빙고가 만들어질 때
                for(int k = 0; k < MAX_A; k++) {
                    numI = 0;
                    numJ = 0;
                    for(int l = 0; l < MAX_A; l++) {
                        if(board[k][l] == i)
                            numI++;
                        if(board[k][l] == j)
                            numJ++;
                    }

                    // 3개의 칸에 i, j가 총 3번 나오며
                    // 둘 다 최소 1번 이상 나오면 승리
                    if(numI + numJ == 3 && numI >= 1 && numJ >= 1)
                        win = true;
                }

                // 세로로 빙고가 만들어질 때
                for(int k = 0; k < MAX_A; k++) {
                    numI = 0;
                    numJ = 0;
                    for(int l = 0; l < MAX_A; l++) {
                        if(board[l][k] == i)
                            numI++;
                        if(board[l][k] == j)
                            numJ++;
                    }

                    // 3개의 칸에 i, j가 총 3번 나오며
                    // 둘 다 최소 1번 이상 나오면 승리
                    if(numI + numJ == 3 && numI >= 1 && numJ >= 1)
                        win = true;
                }

                // 왼쪽 위에서 오른쪽 아래를 잇는 대각선으로 빙고가 만들어질 때
                numI = 0;
                numJ = 0;
                for(int k = 0; k < MAX_A; k++) {
                    if(board[k][k] == i)
                        numI++;
                    if(board[k][k] == j)
                        numJ++;
                }

                // 3개의 칸에 i, j가 총 3번 나오며
                // 둘 다 최소 1번 이상 나오면 승리
                if(numI + numJ == 3 && numI >= 1 && numJ >= 1)
                    win = true;

                // 오른쪽 위에서 왼쪽 아래를 잇는 대각선으로 빙고가 만들어질 때
                numI = 0;
                numJ = 0;
                for(int k = 0; k < MAX_A; k++) {
                    if(board[k][MAX_A - k - 1] == i)
                        numI++;
                    if(board[k][MAX_A - k - 1] == j)
                        numJ++;
                }

                // 3개의 칸에 i, j가 총 3번 나오며
                // 둘 다 최소 1번 이상 나오면 승리
                if(numI + numJ == 3 && numI >= 1 && numJ >= 1)
                    win = true;


                if(win)
                    ans++;
            }

        System.out.print(ans);
    }
}