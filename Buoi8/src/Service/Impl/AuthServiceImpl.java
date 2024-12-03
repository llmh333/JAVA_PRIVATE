package Service.Impl;

import Service.AuthService;
import Service.Role;
import Service.Status;
import model.Account;
import model.Address;

import java.util.ArrayList;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {
    public ArrayList<Account> accounts = new ArrayList<Account>();

    public AuthServiceImpl(ArrayList<Account> accounts, Account currentAccount) {
        this.accounts = accounts;
        this.currentAccount = currentAccount;
    }

    Account currentAccount = null;
    @Override
    public void login(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        boolean kt = false;
        for (Account account:accounts) {
            if (username.equals(account.getUsername()) && password.equals(account.getPassword())) {
                kt = true;
                currentAccount = account;
                break;
            }
        }
        if (!kt) {
            System.out.println("Tai khoan hoac mat khau khong chinh xac");
        }
    }

    @Override
    public void logout() {
        if (currentAccount == null) {
            System.out.println("Chua dang nhap");
        } else {
            currentAccount = null;
            System.out.println("Dang xuat thanh cong");
        }
    }

    @Override
    public void changePassword(String username, String oldPassword, String newPassword) {
        if (currentAccount == null) {
            System.out.println("Chua dang nhap");
        } else {
            currentAccount.setPassword(newPassword);
            accounts.set(accounts.indexOf(currentAccount), currentAccount);
            System.out.println("Doi mat khau thanh cong");
        }
    }
}
