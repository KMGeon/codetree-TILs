import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(Main.solution(a,b));
	}

	private static String solution(int a, int b) {
		if (a>b){
			return logic(a,b);
		}else{
			return logic(b,a);
		}
	}

	private static String logic(int a, int b) {
		int a1 = a + 25;
		int b1 = b * 2;
		return a1+" "+b1;
	}
}