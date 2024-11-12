import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

//import static Ma;
//import static Main.n;

public class Setting {
    static Scanner scanner = new Scanner(System.in);
    public static void AddBook() {

        Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập mã sách: ");
            int maSach = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nhập tên sách: ");
            String tenSach = scanner.nextLine();
            System.out.print("Nhập tên tác giả: ");
            String tenTacGia = scanner.nextLine();
            System.out.print("Nhập năm xuất bản: ");
            int namSanXuat = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nhập tóm tắt nội dung: ");
            String tomTatNoiDung = scanner.nextLine();
            System.out.print("Nhập giá: ");
            double giaTien = scanner.nextDouble();

            Book newBook = new Book(tenSach,maSach, tenTacGia, tomTatNoiDung, namSanXuat, giaTien);

            Main.books = Arrays.copyOf(Main.books, Main.n + 1);
            Main.books[Main.n] = newBook;
            Main.n++;
            System.out.println("Thêm sách thành công!");
        }
        public static void editBookById() {
            System.out.print("Nhập mã sách để chỉnh sửa: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            boolean found=false;
            for (int i=0;i<Main.n;i++) {
                if(Main.books[i].getMaSach()==id) {
                    found=true;
                    System.out.print("Nhập tên mới (để trống để giữ nguyên): ");
                    String tenSach = scanner.nextLine();
                    if (!tenSach.isEmpty()) Main.books[i].setTenSach(tenSach);

                    System.out.print("Nhập tên tác giả mới (để trống để giữ nguyên): ");
                    String tenTacGia = scanner.nextLine();
                    if (!tenTacGia.isEmpty()) Main.books[i].setTenTacGia(tenTacGia);

                    System.out.print("Nhập năm mới (để trống để giữ nguyên): ");
                    String namSanXuatInput = scanner.nextLine();
                    if (!namSanXuatInput.isEmpty()) Main.books[i].setNamSanxuat(Integer.parseInt(namSanXuatInput));

                    System.out.print("Nhập tóm tắt mới (để trống để giữ nguyên): ");
                    String tomTatNoiDung = scanner.nextLine();
                    if (!tomTatNoiDung.isEmpty()) Main.books[i].setTomTatNoiDung(tomTatNoiDung);

                    System.out.println("Nhập giá mới (để trống để giữ nguyên: ");
                    String giaTienInput=scanner.nextLine();
                    if(!giaTienInput.isBlank()) Main.books[i].setGiaTien(Double.parseDouble(giaTienInput));
                    System.out.println("Cập nhật thông tin sách thành công!");
                }
            }
            if(!found) System.out.println("Không tìm thấy sách");
        }
        public static void printBookArray() {
            for (Book x: Main.books) x.display();
        }
        public static void printTheOldestBook() {
            Book oldestBook=Main.books[0];
            for (int i=1;i<Main.n;i++) {
                if(oldestBook.getNamSanxuat()<Main.books[i].getNamSanxuat()) oldestBook=Main.books[i];
            }
            System.out.println("Sách cổ nhất");
            for (int i=0;i<Main.n;i++) {
                if(oldestBook.getNamSanxuat()==Main.books[i].getNamSanxuat()) Main.books[i].display();
            }
        }
        public static void findBookByPrice() {
            System.out.print("Nhập giá tối đa: ");
            double maxPrice = scanner.nextDouble();
            boolean found=false;
            for (int i=0;i<Main.n;i++) {
                if(Main.books[i].getGiaTien()<=maxPrice) {
                    Main.books[i].display();
                    found=true;
                }
            }
            if(!found) System.out.println("Không tìm thấy cuốn sách nào");
        }
        public static void sortBooks() {
            System.out.print("Sắp xếp theo (1) Tên hoặc (2) Giá: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                Arrays.sort(Main.books, Comparator.comparing(Book::getTenSach));
                System.out.println("Sắp xếp sách theo tên thành công.");
            } else if (option == 2) {
                Arrays.sort(Main.books, Comparator.comparingDouble(Book::getGiaTien));
                System.out.println("Sắp xếp sách theo giá thành công.");
            } else {
                System.out.println("Tùy chọn không hợp lệ.");
            }
    }
}
