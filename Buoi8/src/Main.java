import Service.Impl.AccountServiceImpl;
import Service.Impl.AuthServiceImpl;
import Service.Role;
import Service.Status;
import model.Account;
import model.Address;

import java.lang.reflect.AccessFlag;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<Account>();
        Account account1 = new Account("001","Le Minh Hieu",19, new Address("Dai Dong","Vinh Phuc"),"28/03/2005","admin","admin", Role.ADMIN,Status.ACTIVE);
        Account account2 = new Account("002","Nguyen Van A",20, new Address("Hoai Duc","Bac Tu Liem"),"01/01/2000","vana","123", Role.USER,Status.ACTIVE);
        accounts.add(account1);
        accounts.add(account2);
        Account currentAccount = null;
        AccountServiceImpl accountService = new AccountServiceImpl(accounts,currentAccount);
        while (true) {
            System.out.println("1. Login");
            System.out.println("2. Logout");
            System.out.println("3. Change Password");
            System.out.println("4. Exit");
            System.out.println("Nhap lua chon: ");
            int choice1 = scanner.nextInt();
            switch (choice1) {
                case 1:
                    accountService.login(scanner);
                    currentAccount = accountService.getCurrentAccount();
                    if (currentAccount == null) {
                        continue;
                    }
                    if (currentAccount.getStatus() == Status.ACTIVE && currentAccount.getRole() == Role.ADMIN) {
                        while (true) {
                            System.out.println("===== HỆ THỐNG QUẢN LÝ TÀI KHOẢN =====");
                            System.out.println("Xin chào ADMIN: [ "+currentAccount.getUsername()+" ]");
                            System.out.println("Chọn một trong các chức năng sau: ");
                            System.out.println("1. Xem danh sach tai khoan");
                            System.out.println("2. Tao tai khoan moi");
                            System.out.println("3. Tim kiem tai khoan theo username");
                            System.out.println("4. Xoa tai khoan");
                            System.out.println("5. Thay doi trang thai tai khoan (ACTIVE <> BAN)");
                            System.out.println("6. Xem thong tin ca nhan");
                            System.out.println("0. Dang xuat");
                            System.out.println("------------------------");
                            System.out.print("Nhap lua chon cua ban: ");
                            int choice2 = scanner.nextInt();
                            switch (choice2) {
                                case 1:
                                    List<Account> listAccount = accountService.getAllAccount();
                                    for (Account account:listAccount) {
                                        System.out.println(account);
                                    }
                                    break;
                                case 2:
                                    accountService.createNewAccount(new Account("002","Le Van B",21, new Address("Thanh Xuan","Ha Noi"),"01/01/2002","levanb","123", Role.USER,Status.BAN));
                                    break;
                                case 3:
                                    Account findAccount = accountService.getAccountByUsername("levanb");
                                    if (findAccount == null) {
                                        System.out.println("Khong ton tai tai khoan nay");
                                    } else {
                                        System.out.println(findAccount);
                                    }
                                    break;
                                case 4:
                                    accountService.deleteAccount("levanb");
                                    break;
                                case 5:
                                    accountService.changeStatus("levanb",Status.ACTIVE);
                                    break;
                                case 6:
                                    System.out.println(currentAccount);
                                    break;
                                case 0:
                                    accountService.logout();
                                    break;
                                default:
                                    System.out.println("Lua chon khong hop ly");
                            }
                        }
                    } else {
                        while (true) {
                            System.out.println("===== HE THONG NGUOI DUNG =====");
                            System.out.println("Xin chao USER: " + currentAccount.getUsername());
                            System.out.println("Chon mot trong cac chuc nang sau: ");
                            System.out.println("1. Doi mat khau");
                            System.out.println("2. Xem thong tin ca nhan");
                            System.out.println("0. Dang xuat");
                            System.out.println("----------------------");
                            System.out.println("Nhap lua chon cua ban: ");
                            int choice2 = scanner.nextInt();
                            switch (choice2) {
                                case 0:
                                    accountService.logout();
                                    break;
                                case 1:
                                    accountService.changePassword("vana","123","1234");
                                    break;
                                case 2:
                                    System.out.println(currentAccount);
                                    break;
                                default:
                                    System.out.println("Lua chon khong hop le");
                            }
                        }
                    }
                case 2:
                    accountService.logout();
                    break;
                case 3:
                    accountService.changePassword("Nguyen Van A","1234","111");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        }

    }
}