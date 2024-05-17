import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a1 = sc.next();
        String a2 = sc.next();
        int a3 = sc.nextInt();
        zero zero = new zero(a1,a2,a3);
        System.out.println("secret code : "+zero.getSecretCode());
        System.out.println("meeting point : "+zero.getMeetingPoint());
        System.out.println("time : "+zero.getTime());
    }
}

class zero{
    private String secretCode;
    private String meetingPoint;
    private int time;

    public zero(String secretCode, String meetingPoint, int time) {
        this.secretCode = secretCode;
        this.meetingPoint = meetingPoint;
        this.time = time;
    }

    public String getSecretCode() {
        return secretCode;
    }

    public String getMeetingPoint() {
        return meetingPoint;
    }

    public int getTime() {
        return time;
    }
}