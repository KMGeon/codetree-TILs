import java.util.Scanner;

public class Main {    
    // 재귀함수를 이용해 별을 1개부터 n개까지 줄을 쌓습니다.
    public static void printStar(int n) {
        if(n == 0)
            return;
    
        printStar(n - 1);
        for(int i = 0; i < n; i++)
            System.out.print("*");
        System.out.println();
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수 선언 및 입력:
        int n = sc.nextInt();

        printStar(n);
    }
}