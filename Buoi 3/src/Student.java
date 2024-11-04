import java.util.Scanner;

public class Student {
    String studentCode;
    String fullName;
    byte age;
    String gender;
    String phoneNumber;
    String email;

    public Student() {
        studentCode = null;
        fullName = null;
        age = 0;
        gender = null;
        phoneNumber = null;
        email = null;
    }

    public Student(String studentCode, String fullName, byte age, String gender, String phoneNumber, String email) {
        this.studentCode = studentCode;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void display() {
        System.out.println(" | "+studentCode+" | "+fullName+" | "+age+" | "+gender+" | "+phoneNumber+" | "+email + " |");
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStudentCode() {
        return studentCode;
    }
    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public byte getAge() {
        return age;
    }
    public void setAge(byte age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return fullName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("---Nhap thong tin cho sinh vien---");

        System.out.print("Ma sinh vien: ");
        String studentCode = sc.nextLine();

        System.out.print("Ho va ten: ");
        String fullName = sc.nextLine();

        System.out.print("Tuoi: ");
        byte age = sc.nextByte();
        sc.nextLine();

        System.out.print("Gioi tinh: ");
        String gender = sc.nextLine();

        System.out.print("SDT: ");
        String phoneNumber = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.println("---Thong tin sinh vien---");
        Student sinhvien = new Student(studentCode,fullName,age,gender,phoneNumber,email);
        sinhvien.display();
    }
}
