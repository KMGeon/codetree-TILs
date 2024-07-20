import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = new int[num];

        for (int i=0; i< num; i++){
            arr[i] = sc.nextInt();
        }


        int result =Integer.MAX_VALUE;
        for (int i=0; i<num; i++){

            int sumDiff = 0;
            for (int j=0; j<num; j++){
                int tmp = arr[j] * Math.abs(i - j);
                sumDiff += tmp;
            }
            if (result > sumDiff)result = sumDiff;
            
        }

        System.out.println(result);
    }
}