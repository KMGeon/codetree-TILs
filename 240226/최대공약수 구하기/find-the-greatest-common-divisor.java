import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        System.out.print(Main.Solution(input1, input2));
    }

    private static Integer Solution(int input1, int input2){
        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();
        int max =0;

        // 1,2,3,4,6,12
        for (int i=1; i<=input1; i++){
            if (input1 % i == 0){
                result1.add(i);
            }
        }
        // 1,2,3,6,9
        for (int i=1; i<= input2; i++){
            if (input2 % i == 0){
                result2.add(i);
            }
        }


        for (Integer num : result1) {
            if (result2.contains(num) && num > max) {
                max = num;
            }
        }

        return max;

    }
}