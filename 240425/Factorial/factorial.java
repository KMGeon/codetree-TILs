import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(Main.solution(n));
    }

    private static Integer solution(int n) {
        if (n == 1 ){
            return 1;
        }


        return solution(n-1) * n;
    }


}