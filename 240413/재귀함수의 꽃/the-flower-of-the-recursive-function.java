import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Main.solution(num);
    }

    private static void solution(int num) {
        if (num==0)return;

        System.out.print(num+" ");
        solution(num-1);
        System.out.print(num+" ");
    }
}