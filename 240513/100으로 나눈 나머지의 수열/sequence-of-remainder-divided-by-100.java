import java.util.Scanner;

public class Main {    
    // a번째 수열 값을 반환합니다.
    public static int sequence(int a) {
        if(a == 1)
            return 2;
        if(a == 2)
            return 4;
    
        return (sequence(a - 1) * sequence(a - 2)) % 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수 선언 및 입력:
        int n = sc.nextInt();

        System.out.print(sequence(n));
    }
}