import java.util.Scanner;

public class Student extends Person {
    Scanner scanner = new Scanner(System.in);
    private int id;
    private String nameClass;
    private float gpa;
    private final float criteria = 2;

    public Student() {
        super();
    }

    public Student(String name, int age, Address address, int id, String nameClass, float gpa) {
        super(name, age, address);
        this.id = id;
        this.nameClass = nameClass;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getNameClass() {
        return nameClass;
    }

    public float getGpa() {
        return gpa;
    }

    public float getCriteria() {
        return criteria;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void input() {

        System.out.print("Name: ");
        name = scanner.nextLine();

        System.out.print("Age: ");
        age = scanner.nextInt();

        System.out.print("Id: ");
        id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Name Class: ");
        nameClass = scanner.nextLine();

        System.out.print("Gpa: ");
        gpa = scanner.nextFloat();
        scanner.nextLine();
    }

    public void output() {
        System.out.printf("%-5d %-20s %-5d %-10s %-6.2f", id, name, age, nameClass, gpa);
        address.output();
    }

    public Boolean checkFall() {
        if (criteria > gpa) return false;
        else return false;
    }
}
