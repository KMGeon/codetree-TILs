import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();

        System.out.println(Main.solution(a, o, c));
    }

    private static String solution(int a, char o, int c) {
        String result = "";
        List<String> list = new ArrayList<>();

        if (o != '+' && o != '-' && o != '*' && o != '/') {
            return "False";
        }

        switch (o) {
            case '+':
                result = String.valueOf(a) + " " + o + " " + String.valueOf(c) + " " + "=" + " " + String.valueOf(a + c);
                break;
            case '-':
                result = String.valueOf(a) + " " + o + " " + String.valueOf(c) + " " + "=" + " " + String.valueOf(a - c);
                break;
            case '*':
                result = String.valueOf(a) + " " + o + " " + String.valueOf(c) + " " + "=" + " " + String.valueOf(a * c);
                break;
            case '/':
                result = String.valueOf(a) + " " + o + " " + String.valueOf(c) + " " + "=" + " " +  String.valueOf(a / c);
                break;
        }
        return result;
    }
}