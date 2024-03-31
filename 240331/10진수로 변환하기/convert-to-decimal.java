import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        String binary = sc.next();

        // 십진수로 변환합니다.
        int num = 0;
        for(int i = 0; i < binary.length(); i++)
            num = num * 2 + (binary.charAt(i) - '0');
        
        // 출력
        System.out.print(num);
    }
}