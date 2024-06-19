import java.util.Scanner;

public class Main {
    public static String str;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        str = sc.next();
        char[]arr = str.toCharArray();
        
        int cnt =0;
        int n = (int) str.length();
        
        for(int i=0; i<n-1; i++){
            for(int j=i; j<n-1; j++){
             if(arr[i] == '(' &&
             arr[i+1] =='(' &&
             arr[j] == ')' &&
             arr[j+1] ==')'){
                cnt++;
             }   
            }
        }


        System.out.print(cnt);
    }
}