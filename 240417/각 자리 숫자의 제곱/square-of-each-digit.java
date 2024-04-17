import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Main.solution(num));
    }

    private static int solution(int n) {
        if (n < 10 ) return  n*n;
        
        return solution(n/10) + (n%10)*(n%10);
    }
}