import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(Main.solution(a,b));
		
	}

	private static String solution(int a, int b) {
		String result ="Yes";
		
		
		if (isDayValid(a,b)){
			return result;
		}
		
		return "No";
	}

	private static boolean isDayValid(int a, int b) {
		
		if (isMonthValid(a)){
			if (a==2){
				if (b>=1 && b<=28){
					return true;
				}
			}
			return b >= 1 && b <= 31;
		}
		return false;
	}

	private static boolean isMonthValid(int a) {
		return a >= 1 && a <= 12;
	}
}