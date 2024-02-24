import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        Main.Solution(a1);
    }

    private static void Solution(int a1) {
        int cnt = 1;
        for (int i = 0; i < a1; i++) {
            for (int j=0; j<a1; j++){
                System.out.print(cnt +" ");
                cnt ++;
                if (cnt ==10){
                    cnt = 1;
                }
            }
            System.out.println();
        }
    }
}