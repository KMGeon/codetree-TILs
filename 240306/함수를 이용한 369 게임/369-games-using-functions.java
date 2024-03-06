import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Main.solution(a,b));
    }

    /**
     * 각 자리의 수가 3의 배수
     * 각 자리의 수 합 = 3의 배수
     */
    private static Integer solution(int a, int b) {
        int result =0;

        for (int i = a; i <= b; i++) {
            if (is369Number(i)){
                result ++;
            }
        }

        return result;
    }

    private static boolean is369Number(int i) {
        return (i%3==0) || contain369(i);
    }

    private static boolean contain369(int i) {
        while (i>0){
            if (i%10==3 || i%10==6|| i%10 ==9){
                return true;
            }
            i/=10;
        }
        return false;
    }
}