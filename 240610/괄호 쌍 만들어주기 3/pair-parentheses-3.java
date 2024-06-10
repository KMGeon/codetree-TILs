import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        char[] charArray = str.toCharArray();

        System.out.println(Main.solution(charArray));
    }

    private static Integer solution(char[] charArray) {
        int result =0;

        for (int i=0; i<charArray.length; i++){
            for (int j=i; j<charArray.length; j++){
                if (charArray[i] == '(' && charArray[j]==')'){
                    result ++;
                }
            }
        }

        return result;
    }

}