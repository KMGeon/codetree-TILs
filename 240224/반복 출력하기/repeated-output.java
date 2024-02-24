import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input =sc.nextInt();
        Main.Solution(input);
    }

    private static void Solution(int input){
        String str = "12345^&*()_";

        for(int i=0; i<input; i++){
            System.out.println(str);
        }
    }
}