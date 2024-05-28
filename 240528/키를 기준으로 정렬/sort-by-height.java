import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        Person[] people = new Person[input];

        for (int i = 0; i < input; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            Person person = new Person(name, height, weight);
            people[i] = person;
        }

        Arrays.sort(people);

        for (int i = 0; i < input; i++){
            System.out.print(people[i].getName() + " ");
            System.out.print(people[i].getHeight() + " ");
            System.out.println(people[i].getWeight());
        }


    }
}

class Person implements Comparable<Person> {
    private String name;
    private int height;
    private int weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Person person) {
        return Integer.compare(this.height, person.height);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}