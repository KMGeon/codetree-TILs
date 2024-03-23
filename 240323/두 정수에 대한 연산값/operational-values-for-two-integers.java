import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(Main.solution(a, b));
	}

	private static String solution(int a, int b) {
		return a > b ? logic(b, a) : logic(a, b);
	}

	private static String logic(int a, int b) {
		return (a + 25) + " " + (b * 2);
	}
}