import java.util.Scanner;

public class Main {
    private static Integer test =0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Main.solution(a);
        System.out.println(test);
    }

    private static Integer solution(int a) {

        if (a==1){
            return 1;
        }

        if (a%2==0){
            test++;
            return solution(a/2);
        }else{
            test++;
            return solution(3*a+1);
        }
    }
}