
import javax.print.attribute.SetOfIntegerSyntax;
import java.util.Scanner;
import java.util.Set;

public class Main {

    static Book[] books = new Book[100];
    static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("So sach: "); n = scanner.nextInt();
//        while (n < 5) {
//            System.out.println("So sach can lon hon 5, vui long nhap lai");
//            System.out.print("So sach: "); n = scanner.nextInt();
//
//        }

        for(int i = 0; i < n; i++) {
            System.out.println("---Thông tin quyển sách thứ "+i);
            System.out.print("Mã sách: ");          int maSach = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Tên Sách: ");         String tenSach = scanner.nextLine();
            System.out.print("Tên tác giả: ");      String tenTacGia = scanner.nextLine();
            System.out.print("Năm sản xuất: ");     int namSanXuat = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Tóm tắt nội dung: "); String tomTatNoiDung = scanner.nextLine();
            System.out.print("Giá tiền: ");;        double giaTien = scanner.nextDouble();
            books[i] = new Book(tenSach,maSach,tenTacGia,tomTatNoiDung,namSanXuat,giaTien);
        }
        while(true) {
            System.out.println("\n----------------Menu------------------");
            System.out.println("1. Thêm sách mới");
            System.out.println("2. Chỉnh sửa thông tin sách");
            System.out.println("3. In ra danh sách các cuốn sách có trong mảng");
            System.out.println("4. In ra cuốn sách lâu đời cổ kính nhất");
            System.out.println("5. In ra cuốn sách phù hợp với giá tiền người mua yêu cầu");
            System.out.println("6. Sắp xếp lại danh sách các cuốn sách( theo tên hoặc theo giá tiền)");
            System.out.println("7. Thoát chương trình");
            System.out.print("Chọn một tùy chọn: ");
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    Setting.AddBook();
                    System.out.println("Mảng sau khi thêm sách");
                    Setting.printBookArray();
                    break;
                case 2:
                    Setting.editBookById();
                    System.out.println("Mảng sau khi chỉnh sửa sách");
                    Setting.printBookArray();
                    break;
                case 3:
                    Setting.printBookArray();
                    break;
                case 4:
                    Setting.printTheOldestBook();
                    break;
                case 5:
                    Setting.findBookByPrice();
                    break;
                case 6:
                    System.out.println("Mảng sau khi sắp xếp");
                    Setting.sortBooks();
                    Setting.printBookArray();
                    break;
                case 7:
                    System.out.println("Thoát chương trình...");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }
}