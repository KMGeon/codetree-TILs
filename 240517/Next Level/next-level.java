import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Member member = new Member("codetree", 10);
        System.out.println("user "+member.getUser()+" "+"lv "+member.getLevel());

        String str = sc.next();
        int a1 = sc.nextInt();

        Member member2 = new Member(str, a1);
        System.out.println("user "+member2.getUser()+" "+"lv "+member2.getLevel());
    }
}

class Member{
    private String user;
    private int level;

    public Member(String user, int level) {
        this.user = user;
        this.level = level;
    }

    public String getUser() {
        return user;
    }

    public int getLevel() {
        return level;
    }
}