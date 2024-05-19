import java.util.Scanner;


class Bomb{
    String unlockCode;
    char linearColor;
    int time;
    
    public Bomb(String unlockCode, char linearColor, int time) {
        this.unlockCode = unlockCode;
        this.linearColor = linearColor;
        this.time = time;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String uCode = sc.next();
        char lColor = sc.next().charAt(0);
        int time = sc.nextInt();
        

        Bomb b = new Bomb(uCode, lColor, time);


        System.out.println("code : " + b.unlockCode);
        System.out.println("color : " + b.linearColor);
        System.out.println("second : " + b.time);
    }
}