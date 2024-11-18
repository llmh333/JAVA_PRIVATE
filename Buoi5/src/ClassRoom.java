import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ClassRoom {
    static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Student> listStudent = new ArrayList<>();

    public void sortByGpa() {
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Float.compare(o1.getGpa(),o2.getGpa());
            }
        });
    }
    public void inputList() {
        System.out.print("Nhập số lượng sinh viên muốn thêm:");
        int n = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= n ; i++) {
            System.out.println("---Nhập thông tin sinh viên thứ "+i+"---");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();

            System.out.print("Id: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Name Class: ");
            String nameClass = scanner.nextLine();

            System.out.print("Gpa: ");
            float gpa = scanner.nextFloat();
            scanner.nextLine();
            Address address = new Address();
            address.input();
            Student student = new Student(name,age,address,id,nameClass,gpa);

            listStudent.add(student);
        }
    }

    public void outputList() {
        System.out.printf("%-5s %-20s %-5s %-10s %-5s %-45s\n", "ID", "Name", "Age", "NameClass", "GPA", "Address");
        for (Student student:listStudent) {
            student.output();
//            student.address.output();
        }
    }

    public Boolean removeById() {
        System.out.print("Nhập ID muốn xóa: ");
        int idRemove = scanner.nextInt();
        boolean kt = false;
        for (Student student : listStudent) {
            if (student.getId() == idRemove) {
                kt = true;
            }
        }
        if (kt) {
            listStudent.removeIf(student -> student.getId() == idRemove);
        }
        return kt;

    }
}
