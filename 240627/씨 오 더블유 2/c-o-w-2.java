import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String str;
        n = sc.nextInt();
        str = sc.next();

        char[] arr = str.toCharArray();

        int result =0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] =='C' && arr[j]=='O'&& arr[k]=='W'){
                      result++;
                    }
                }
            }
        }
        System.out.println(result);

    }
}