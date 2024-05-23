import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        Person[] personArr = new Person[number];


        for (int i = 0; i < number; i++) {
            String name = sc.next();
            String address = sc.next();
            String region = sc.next();
            personArr[i] = new Person(name, address, region);
        }

        int TEMP =0;

        for (int i=1; i< number; i++){
            if ((personArr[i].getName().compareTo(personArr[TEMP].getName() )> 0)) {
                TEMP = i;
            }
        }

        System.out.println("name "+personArr[TEMP].getName());
        System.out.println("addr "+personArr[TEMP].getAddress());
        System.out.println("city "+personArr[TEMP].getRegion());

    }

}

class Person {
    private String name;
    private String address;
    private String region;

    public Person(String name, String address, String region) {
        this.name = name;
        this.address = address;
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getRegion() {
        return region;
    }
}