import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("------------Menu-------------");
            System.out.println("[1]. Nhập thông tin sinh viên");
            System.out.println("[2]. In ra thông tin các sinh viên theo dạng bảng");
            System.out.println("[3]. Sắp xếp danh sách sinh viên theo điêm GPA");
            System.out.println("[4]. Xóa sinh viên theo id");
            System.out.println("[5]. Thoát chương trình");
            System.out.print("Nhập lựa chọn: ");
            int choose = scanner.nextInt();
            ClassRoom list = new ClassRoom();
            switch (choose) {
                case 1:
                    list.inputList();
                    break;
                case 2:
                    list.outputList();
                    break;
                case 3:
                    list.sortByGpa();
                    break;
                case 4:
                    list.removeById();
                    break;
                case 5:
                    System.out.println("Thoát chương trình");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        }

    }
}