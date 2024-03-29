import java.util.Scanner;

public class Main {
    public static void printNumber1(int n) { 
        if(n == 0)                          
            return;                         

        printNumber1(n - 1);  
        System.out.print(n + " ");
    }

    public static void printNumber2(int n) { 
        if(n == 0)                          
            return;                         

        System.out.print(n + " ");
        printNumber2(n - 1);  
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력:
        int n = sc.nextInt();

        printNumber1(n);
        System.out.println();
        printNumber2(n);
	}
}