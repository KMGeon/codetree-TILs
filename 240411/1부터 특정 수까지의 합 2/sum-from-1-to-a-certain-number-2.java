public class Main {
    public static int sum(int n) {
        if(n == 0)
            return 0;

        return sum(n - 1) + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력:
        int n = sc.nextInt();

        System.out.println(sum(n));
    }
}