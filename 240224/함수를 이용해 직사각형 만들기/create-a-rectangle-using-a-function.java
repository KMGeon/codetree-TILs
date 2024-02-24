import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 =sc.nextInt();
        int a2 =sc.nextInt();
        Main.Solution(a1, a2);
    }

    private static void Solution(int a1, int a2){
        for(int i=0; i<a1;i++){
            for(int j=0; j<a2; j++){
                System.out.print("1");
            }
            System.out.println();
        }
    }
}