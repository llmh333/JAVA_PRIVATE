import java.util.Scanner;

public class Person {
    Scanner scanner = new Scanner(System.in);
    protected String name;
    protected int age;
    protected Address address;

    public Person() {

    }

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    void input() {
        System.out.print("Name: ");
        name = scanner.nextLine();

        System.out.print("Age: ");
        age = scanner.nextInt();

        address.input();
    }

    void output() {
        System.out.print("| Name: " + name + " | Age: " + age);
        address.output();
    }
}
