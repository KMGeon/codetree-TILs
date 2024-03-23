import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];

        // 배열 입력 받기
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }

        // 절댓값 함수 호출 및 출력
        absoluteValues(array);
    }

    // 절댓값을 씌우는 함수
    private static void absoluteValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(arr[i]); // Math 클래스의 abs 메서드를 사용하여 절댓값 계산
            System.out.print(arr[i] + " ");
        }
    }
}