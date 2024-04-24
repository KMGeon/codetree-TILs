import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(Main.solution(n));
    }

    private static Integer solution(int n) {
        if (n%2==0) {
            return even(n);
        }else{
            return odd(n);
        }

    }

    private static Integer odd(int n) {
        if (n==1){
            return 1;
        }

        if (n%2==0){
            return odd(n-1) ;
        }else{
            return odd(n-1)+n;
        }
    }

    private static Integer even(int n) {
        if (n==2){
            return 2;
        }

        if (n%2==0){
            return even(n-1) + n;
        }else{
            return even(n-1);
        }
    }


}