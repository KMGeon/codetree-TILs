import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(Main.solution(str));
    }

    private static String solution(String str) {
        String result ="Yes";

        String reversedStr = new StringBuilder(str).reverse().toString();
        
        if (str.equals(reversedStr)){
            return result;
        }
        return "No";
    }
}