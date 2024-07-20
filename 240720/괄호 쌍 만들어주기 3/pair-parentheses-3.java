import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = ")(()())";
        char[] arr = str.toCharArray();
        int size = arr.length;

        int result = 0;
        for (int i = 0; i < size; i++) {

            if (arr[i] == ')'){
                continue;
            }

            int sumDiff = 0;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] == ')') {
                    sumDiff += 1;
                }
            }
            result += sumDiff;
        }
        System.out.println(result);
    }
}