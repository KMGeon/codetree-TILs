import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();

        System.out.println(Main.solution(a1,b1));

    }

    private static String solution(int a1, int b1) {
        int temp =0;
        
        temp = a1;
        a1 = b1;
        b1 = temp;


        return a1 + " " + b1;
    }
    
}