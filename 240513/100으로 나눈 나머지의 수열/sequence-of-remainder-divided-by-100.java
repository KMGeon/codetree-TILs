import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        Integer result = Main.solution(a1);
        System.out.println(result%100);
    }

    private static Integer solution(int a1) {
        if (a1 == 1) return 2;
        else if (a1 == 2) return 4;


        return solution(a1 - 1) * solution(a1 - 2);
    }
}