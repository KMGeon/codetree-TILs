import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		Main.solution(i);
	}

	private static void solution(int i) {
		if (i==0)return;
		
		solution(i-1);
		System.out.println("HelloWorld");
	}
}