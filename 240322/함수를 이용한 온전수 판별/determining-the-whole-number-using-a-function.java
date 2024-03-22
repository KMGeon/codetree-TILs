import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        System.out.println(Main.solution(a1, a2));
    }

    private static int solution(int a1, int a2) {
        int result = 0;

        for (int i = a1; i <= a2; i++) {
            if (isPerfectNumber(i)) {
                result++;
            }
        }

        return result;
    }

    private static boolean isPerfectNumber(int n) {
        if(n % 2 == 0)
            return false;
        else if(n % 10 == 5)
            return false;
        else if(n % 3 == 0 && n % 9 != 0)
            return false;
        else
            return true;
    }

}