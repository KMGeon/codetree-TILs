import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(Main.solution(a));
    }

    private static boolean solution(int a) {

        if (isLaepYear(a)){
            return true;
        }
        return false;
    }

    private static boolean isLaepYear(int a) {

        if (a%100==0 && a%400==0){
            return false;
        }
        if (a%4 ==0){
            return true;
        }
        return false;

    }
}