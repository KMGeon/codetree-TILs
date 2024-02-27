import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int input1 = sc.nextInt();

        System.out.print(Main.Solution(input1));
    }

    private static Integer Solution(int input){
        int result =0;

        for (int i = 1; i <= input; i++) {
            result += i;
        }
        
        return result/10;
    }
}