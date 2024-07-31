import java.util.Scanner;

public class Main {
    private static int INPUT = 1010;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String a = "1010";

        int maxN = 0;

        for (int i = 0; i < a.length(); i++) {
            StringBuilder modified = new StringBuilder(a);
            if (a.charAt(i) == '0') {
                modified.setCharAt(i, '1');
            } else {
                modified.setCharAt(i, '0');
            }

            int current = Integer.parseInt(modified.toString(), 2);
            maxN = Math.max(maxN, current);
        }

        if (maxN == 0) {
            maxN = Integer.parseInt(a);
        }
        System.out.println(maxN);
    }
}