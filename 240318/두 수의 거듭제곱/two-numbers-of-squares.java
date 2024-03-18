import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int put1 = sc.nextInt();
        int put2 = sc.nextInt();

        System.out.println(Main.solution(put1, put2));
    }

    private static Integer solution(int put1, int put2) {
        Integer result =put1 ;

        for (int i = 1; i < put2; i++) {
            result *= put1;
        }

        return result;
    }
}