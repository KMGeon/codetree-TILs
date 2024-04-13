import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(Main.solution(num));
    }

    private static int solution(int num) {
        if (num ==1) return 1;


        return solution(num-1)+num;
    }
}