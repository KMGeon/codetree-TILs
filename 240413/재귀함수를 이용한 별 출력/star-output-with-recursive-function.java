import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Main.solution(num);
    }

    private static void solution(int num) {
        if (num==0) return;

        solution(num-1);
        for (int  i=0; i< num; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}