import java.util.Scanner;

public class Main {

    private static Integer RESULT = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int start = a * b * c;

        System.out.println(Main.solution(start));
    }

    private static Integer solution(int start) {
        if (start < 10) {
            return start;
        }
        int a1 = start % 10;
        return solution(start/10)+ a1;
    }
}