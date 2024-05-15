import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(Main.solution(str));
    }

    private static String solution(String str) {

        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        
        

        return new String(charArray);
    }
}