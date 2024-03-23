import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        modifyAndPrint(a, b);
    }

    private static void modifyAndPrint(int a, int b) {
        if (a > b) {
            b *= 2;
            a += 25;
        } else {
            a *= 2;
            b += 25;
        }
        System.out.println(a + " " + b);
    }
}