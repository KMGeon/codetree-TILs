import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.print(Main.Solution(input));
    }

    private static String Solution(int input) {
        int temp =0;
        int temp2 = 0;
        char[] chars = Character.toChars(input);
        
        for (int i=0; i< chars.length; i++){
            temp +=chars[i];
        }
        
        if (temp %5 ==0 && input %2 ==0){
            return "Yes";
        }
        
        return "No";
    }
}