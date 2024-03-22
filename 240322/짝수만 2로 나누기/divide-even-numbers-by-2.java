import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int[] arr = new int[a1];
        for (int i = 0; i < a1; i++) {
            arr[i] = sc.nextInt();
        }

        for (Integer i : Main.solution(a1,arr)) {
            System.out.print(i+" ");
        }
    }

    private static List<Integer> solution(int a1, int[] arr) {
        List<Integer> result = new ArrayList<>();

        for (int n : arr) {
            if (n%2==0){
                result.add(n/2);
            }else{
                result.add(n);
            }
        }

        return result;
    }
}