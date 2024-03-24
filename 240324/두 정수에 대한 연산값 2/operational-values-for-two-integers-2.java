import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(Main.solution(a,b));
	}

	private static String solution(int a, int b) {
		String result = "";
		if (a>b){
			int first = a * 2;
			int last = b +10;
			result = first+" "+last;
		}else{
			int first = b * 2;
			int last = a +10;
			result = last+" "+first;
		}
		return result;
	}
}