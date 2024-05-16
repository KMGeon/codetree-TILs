import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(Main.solution(str1, str2));
    }

    private static String solution(String str1, String str2) {

        char[] arr1 = str1.toCharArray();
        Arrays.sort(arr1);
        
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr2);

        String s1 = new String(arr1);
        String s2 = new String(arr2);
        
        if(s1.equals(s2)) return "Yes";
        else return "No";
    }
}