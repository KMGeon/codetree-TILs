import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int[] arr1 = new int[a];
        int[] arr2 = new int[a];

        for (int i = 0; i < a; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < a; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println(Main.solution(a, arr1, arr2));
    }

    private static String solution(int a, int[] arr1, int[] arr2) {

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean equals = Arrays.equals(arr1, arr2);
        if (equals) {
            return "Yes";
        }else{
            return "No";
        }
    }
}