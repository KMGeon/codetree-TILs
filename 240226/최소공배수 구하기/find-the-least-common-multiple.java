import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        System.out.print(Main.Solution(input1, input2));
    }

    private static Integer Solution(int input1, int input2){
        int result =0 ;

        for (int  i=1; i<=Math.min(input1, input2); i++){
            if (input1 % i==0 && input2 % i ==0){
                result = i;
            }
        }

        int output1 = input1 / result;
        int output2 = input2 / result;

        return result * output1 * output2;

    }
}