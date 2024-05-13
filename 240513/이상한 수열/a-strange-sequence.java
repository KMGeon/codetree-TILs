import java.util.Scanner;

public class Main {    
    // a번째 수열 값을 반환합니다.
    public static int strangeSequence(int a) {
        if(a == 1)
            return 1;
        if(a == 2)
            return 2;
    
        return strangeSequence(a / 3) + strangeSequence(a - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수 선언 및 입력:
        int n = sc.nextInt();

        System.out.print(strangeSequence(n));
    }
}