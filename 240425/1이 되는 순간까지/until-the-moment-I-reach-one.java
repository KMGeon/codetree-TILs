import java.util.Scanner;

public class Main {
    private static Integer result =0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(Main.solution(n));
    }

    private static Integer solution(int n) {

        if (n == 1) {
            return result;
        }

        if (n % 2 == 0) {
            result ++;
            solution(n/2);
        } else {
            result ++;
            solution(n/3);
        }

        return result;
    }
}