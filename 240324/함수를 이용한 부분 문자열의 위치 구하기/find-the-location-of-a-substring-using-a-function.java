import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();
        System.out.println(solution(str, str2));
    }

    private static int solution(String str, String str2) {
        Queue<Character> queue = new LinkedList<>();

        // 입력 문자열을 큐에 추가
        for (char c : str.toCharArray()) {
            queue.add(c);
        }

        int result = -1; // 결과값을 -1로 초기화하여 부분 문자열이 발견되지 않았음을 표시

        // 입력 문자열을 탐색하면서 목적 문자열이 부분 문자열로 존재하는지 확인
        for (int i = 0; i <= str.length() - str2.length(); i++) {
            boolean found = true; // 목적 문자열이 부분 문자열로 존재하는지 여부를 나타내는 플래그

            // 목적 문자열과 입력 문자열의 현재 위치부터 비교하여 부분 문자열이 일치하는지 확인
            for (int j = 0; j < str2.length(); j++) {
                char peek = queue.poll();
                if (peek != str2.charAt(j)) {
                    found = false; // 부분 문자열이 일치하지 않으면 플래그를 false로 설정
                }
                queue.add(peek); // 큐에 다시 문자 추가
            }

            // 부분 문자열이 발견되면 해당 인덱스를 결과값으로 설정하고 반복문 종료
            if (found) {
                result = i;
                break;
            }

            // 입력 문자열의 첫 번째 문자를 큐에서 제거하여 다음 위치의 문자를 탐색할 수 있도록 함
            queue.poll();
            queue.add(str.charAt(i + str2.length()));
        }

        return result;
    }
}