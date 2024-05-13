import java.util.Scanner;

public class Main {
    public static int[] arr = new int[100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];

        for (int i=0; i<a; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Main.solution(a,arr));
    }

    private static Integer solution(int a, int[] arr) {
        if (a==0){
            return arr[0];
        }
        int result = Math.max(arr[a-1], solution(a-1, arr));
        return result;
    }
}