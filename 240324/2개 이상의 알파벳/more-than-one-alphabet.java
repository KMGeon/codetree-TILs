import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(Main.solution(str));
	}

	private static String solution(String str) {
		String result = "Yes";
		HashSet<Character> set = new HashSet<>();

		for (char c : str.toCharArray()) {
			set.add(c);
		}
		
		return set.size() >= 2 ? "Yes": "No";
	}
}